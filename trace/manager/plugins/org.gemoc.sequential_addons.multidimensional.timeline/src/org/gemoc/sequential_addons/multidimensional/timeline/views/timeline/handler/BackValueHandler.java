package org.gemoc.sequential_addons.multidimensional.timeline.views.timeline.handler;

import java.util.function.Supplier;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.gemoc.sequential_addons.multidimensional.timeline.Activator;
import org.gemoc.sequential_addons.multidimensional.timeline.views.timeline.MultidimensionalTimeLineView;

public class BackValueHandler extends AbstractHandler {

	final private Activator activator;
	
	public BackValueHandler() {
		setBaseEnabled(false);
		activator = Activator.getDefault();
	}
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		final Supplier<MultidimensionalTimeLineView> timelineViewSupplier = activator.getMultidimensionalTimeLineViewSupplier();
		if (timelineViewSupplier != null) {
			MultidimensionalTimeLineView timeLineView = timelineViewSupplier.get();
//			timeLineView.handleBackValue();
		}
		return null;
	}
	
	@Override
	public boolean isEnabled() {
		boolean result = false;
		final Supplier<MultidimensionalTimeLineView> timelineViewSupplier = activator.getMultidimensionalTimeLineViewSupplier();
		if (timelineViewSupplier != null) {
			MultidimensionalTimeLineView timeLineView = timelineViewSupplier.get();
//			result = timeLineView.canBackValue();
		}
		return result;
	}
}