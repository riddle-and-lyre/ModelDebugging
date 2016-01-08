package org.gemoc.execution.sequential.javaengine.ui.handlers;

import java.util.function.Supplier;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.gemoc.execution.sequential.javaengine.ui.Activator;
import org.gemoc.execution.sequential.javaengine.ui.debug.OmniscientGenericSequentialModelDebugger;

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class StepBackOutHandler extends AbstractHandler {
	
	/**
	 * The constructor.
	 */
	public StepBackOutHandler() {
		setBaseEnabled(false);
	}

	@Override
	/**
	 * the command has been executed, so extract extract the needed information
	 * from the application context.
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {
		Supplier<OmniscientGenericSequentialModelDebugger> debuggerSupplier = Activator.getDefault().getDebuggerSupplier();
		if (debuggerSupplier != null) {
			OmniscientGenericSequentialModelDebugger debugger = debuggerSupplier.get();
			debugger.stepBackOut("Model debugging");
		}
		
		return null;
	}
	
	@Override
	public boolean isEnabled() {
		boolean result = false;
		Supplier<OmniscientGenericSequentialModelDebugger> debuggerSupplier = Activator.getDefault().getDebuggerSupplier();
		if (debuggerSupplier != null) {
			OmniscientGenericSequentialModelDebugger debugger = debuggerSupplier.get();
			if (debugger != null) {
				result = debugger.canStepBackOut("Model debugging");
			}
		}
		return result;
	}
}
