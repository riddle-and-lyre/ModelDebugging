/*******************************************************************************
 * Copyright (c) 2013 Obeo. All Rights Reserved.
 *
 * This software and the attached documentation are the exclusive ownership
 * of its authors and was conceded to the profit of Obeo SARL.
 * This software and the attached documentation are protected under the rights
 * of intellectual ownership, including the section "Titre II  Droits des auteurs (Articles L121-1 L123-12)"
 * By installing this software, you acknowledge being aware of this rights and
 * accept them, and as a consequence you must:
 * - be in possession of a valid license of use conceded by Obeo only.
 * - agree that you have read, understood, and will comply with the license terms and conditions.
 * - agree not to do anything that could conflict with intellectual ownership owned by Obeo or its beneficiaries
 * or the authors of this software
 *
 * Should you not agree with these terms, you must stop to use this software and give it back to its legitimate owner.
 *
 *******************************************************************************/
package org.gemoc.gemoc_language_workbench.process.support;

import fr.obeo.dsl.process.ActionTask;
import fr.obeo.dsl.process.ProcessContext;

import org.gemoc.gemoc_language_workbench.process.IActionProcessor;

/**
 * An abstract implementation of {@link IActionProcessor} providing a reference to the corresponding
 * {@link ActionTask}.
 * 
 * @author <a href="mailto:yvan.lussaud@obeo.fr">Yvan Lussaud</a>
 */
public abstract class AbstractActionProcessor<T extends ProcessContext> implements IActionProcessor {

	/**
	 * The corresponding {@link ActionTask}.
	 */
	private final ActionTask task;

	/**
	 * Constructor.
	 * 
	 * @param task
	 *            the corresponding {@link ActionTask}.
	 */
	public AbstractActionProcessor(ActionTask task) {
		this.task = task;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.gemoc.gemoc_language_workbench.process.IActionProcessor#getActionTask()
	 */
	public ActionTask getActionTask() {
		return task;
	}

	private T castContext(ProcessContext context) {
		@SuppressWarnings("unchecked")
		T castedContext = (T)context;
		return castedContext;
	}

	@Override
	public final Object updateContextWhenDone(ProcessContext context) {
		return internalUpdateContextWhenDone(castContext(context));
	}

	@Override
	public final String updateContextWhenUndone(ProcessContext context) {
		return internalUpdateContextWhenUndone(castContext(context));
	}

	@Override
	public final boolean validate(ProcessContext context) {
		return internalValidate(castContext(context));
	}

	@Override
	public final void doAction(ProcessContext context) {
		internalDoAction(castContext(context));
	}

	@Override
	public final void undoAction(ProcessContext context) {
		internalUndoAction(castContext(context));
	}

	protected abstract Object internalUpdateContextWhenDone(T context);

	protected abstract String internalUpdateContextWhenUndone(T context);

	protected abstract boolean internalValidate(T context);

	protected abstract void internalDoAction(T context);

	protected abstract void internalUndoAction(T context);

}
