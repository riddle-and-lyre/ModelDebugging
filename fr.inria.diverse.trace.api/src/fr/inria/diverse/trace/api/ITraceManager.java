package fr.inria.diverse.trace.api;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;

public interface ITraceManager {

	void save();

	void addState(); 
	
	boolean addStateIfChanged();

	void addEvent(String eventName, Map<String, Object> params);

	void retroAddEvent(String eventName, Map<String, Object> params);
	
	void endEvent(String eventName, Object returnValue);
	
	void initTrace();

	EObject getTraceRoot();

	int getTraceSize();
	
	void goTo(int index);
	
	void goTo(EObject state);

	EObject getExecutionState(int index);

	String getDescriptionOfExecutionState(int index);

	boolean isMacro(String string);

	String currentMacro();
	
	

}
