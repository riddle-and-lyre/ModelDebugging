package org.gemoc.xdsmlframework.api.extensions.engine_addon;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.gemoc.xdsmlframework.api.engine_addon.IEngineAddon;
import org.gemoc.xdsmlframework.api.extensions.Extension;

public class EngineAddonSpecificationExtension extends Extension
{

	public String getId()
	{
		return getAttribute(EngineAddonSpecificationExtensionPoint.GEMOC_ENGINE_ADDON_EXTENSION_POINT_ID);
	}

	public String getName()
	{
		return getAttribute(EngineAddonSpecificationExtensionPoint.GEMOC_ENGINE_ADDON_EXTENSION_POINT_NAME);
	}
	
	public String getShortDescription()
	{
		return getAttribute(EngineAddonSpecificationExtensionPoint.GEMOC_ENGINE_ADDON_EXTENSION_POINT_SHORTDESCRIPTION);
	}
	
	public String getAddonGroupId()
	{
		return getAttribute(EngineAddonSpecificationExtensionPoint.GEMOC_ENGINE_ADDON_EXTENSION_POINT_ADDONGROUPID);
	}
	
	/**
	 * 
	 * @return the list of ids of the views that should be opened when using the addon
	 */
	public List<String> getOpenViewIds()
	{
		String viewIds = getAttribute(EngineAddonSpecificationExtensionPoint.GEMOC_ENGINE_ADDON_EXTENSION_POINT_OPENVIEWIDS);
		ArrayList<String> idsList = new ArrayList<String>();
		if(viewIds != null){
			for(String s : viewIds.split(",")){
				idsList.add(s.trim());
			}
		}
		return idsList;
	}
	
	public IEngineAddon instanciateComponent() throws CoreException
	{
		Object instance = instanciate(EngineAddonSpecificationExtensionPoint.GEMOC_ENGINE_ADDON_EXTENSION_POINT_CLASS);
		try
		{
			IEngineAddon castedInstance = (IEngineAddon)instance;			
			return castedInstance;
		}
		catch(Exception e)
		{
			throwInstanciationCoreException();			
		}
		return null;
	}
	
	public Boolean getDefaultActivationValue() 
	{
		return Boolean.parseBoolean(getAttribute(EngineAddonSpecificationExtensionPoint.GEMOC_ENGINE_ADDON_EXTENSION_POINT_DEFAULT));
	}
	
	
	
}
