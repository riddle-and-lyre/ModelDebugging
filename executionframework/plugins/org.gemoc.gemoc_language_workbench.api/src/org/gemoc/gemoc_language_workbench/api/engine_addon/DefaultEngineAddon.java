package org.gemoc.gemoc_language_workbench.api.engine_addon;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.gemoc.execution.engine.mse.engine_mse.LogicalStep;
import org.gemoc.execution.engine.mse.engine_mse.MSEOccurrence;
import org.gemoc.gemoc_language_workbench.api.core.EngineStatus.RunStatus;
import org.gemoc.gemoc_language_workbench.api.core.IBasicExecutionEngine;


public class DefaultEngineAddon implements IEngineAddon {

	@Override
	public void engineAboutToStart(IBasicExecutionEngine engine) 
	{
	}

	@Override
	public void engineStarted(IBasicExecutionEngine executionEngine) 
	{
	}

	@Override
	public void aboutToSelectLogicalStep(IBasicExecutionEngine engine, Collection<LogicalStep> logicalSteps) 
	{
	}

	@Override
	public void logicalStepSelected(IBasicExecutionEngine engine, LogicalStep selectedLogicalStep) 
	{
	}

	@Override
	public void engineStopped(IBasicExecutionEngine engine) 
	{
	}


	@Override
	public void aboutToExecuteLogicalStep(IBasicExecutionEngine executionEngine, LogicalStep logicalStepToApply) 
	{
	}


	@Override
	public void aboutToExecuteMSEOccurrence(IBasicExecutionEngine executionEngine, MSEOccurrence mseOccurrence) 
	{
	}

	@Override
	public void engineStatusChanged(IBasicExecutionEngine engineRunnable, RunStatus newStatus) 
	{
	}

	@Override
	public void engineAboutToStop(IBasicExecutionEngine engine) 
	{
	}

	@Override
	public void logicalStepExecuted(IBasicExecutionEngine engine, LogicalStep logicalStepExecuted) 
	{
	}

	@Override
	public void mseOccurrenceExecuted(IBasicExecutionEngine engine, MSEOccurrence mseOccurrence) 
	{
	}

	@Override
	public void proposedLogicalStepsChanged(IBasicExecutionEngine engine,
			Collection<LogicalStep> logicalSteps) {
	}

	@Override
	public void engineAboutToDispose(IBasicExecutionEngine engine) {
	}

	@Override
	public List<String> validate(List<IEngineAddon> otherAddons) {
		return new ArrayList<String>();
	}
}
