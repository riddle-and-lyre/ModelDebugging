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
package fr.obeo.timeline.model;

import fr.obeo.timeline.view.ITimelineProvider;

import java.util.ArrayList;
import java.util.List;

/**
 * A possible step.
 * 
 * @author <a href="mailto:yvan.lussaud@obeo.fr">Yvan Lussaud</a>
 */
public final class PossibleStep {

	/**
	 * Shift for the {@link PossibleStep#hashCode() hash code}.
	 */
	private static final int SHIFT = 8;

	/**
	 * The containing {@link TimelineWindow}.
	 */
	private final TimelineWindow timelineWindow;

	/**
	 * The timeline index.
	 */
	private final int index;

	/**
	 * The possible step index.
	 */
	private final int possibleStep;

	/**
	 * Constructor.
	 * 
	 * @param timelineWindow
	 *            the containing {@link TimelineWindow}
	 * @param index
	 *            the timeline index
	 * @param possibleStep
	 *            the possible step index
	 */
	public PossibleStep(TimelineWindow timelineWindow, int index, int possibleStep) {
		this.timelineWindow = timelineWindow;
		this.index = index;
		this.possibleStep = possibleStep;
	}

	/**
	 * Gets the containing {@link TimelineWindow}.
	 * 
	 * @return the containing {@link TimelineWindow}
	 */
	public TimelineWindow getTimelineWindow() {
		return timelineWindow;
	}

	/**
	 * Gets the name.
	 * 
	 * @return the name
	 */
	public String getName() {
		return getTimelineWindow().getProvider().getTextAt(index, possibleStep);
	}

	/**
	 * Tells if the possible step has been selected.
	 * 
	 * @return <code>true</code> if the possible step has been selected, <code>false</code> otherwise.
	 */
	public boolean isSelected() {
		return getTimelineWindow().getProvider().getSelectedPossibleStep(index) == possibleStep;
	}

	/**
	 * Gets the owning {@link Choice}.
	 * 
	 * @return the owning {@link Choice}
	 */
	public Choice getChoice() {
		return new Choice(getTimelineWindow(), index);
	}

	/**
	 * Gets the previous {@link PossibleStep} in the {@link Choice}.
	 * 
	 * @return the previous {@link PossibleStep} in the {@link Choice} if any, <code>null</code> otherwise
	 */
	public PossibleStep getPreviousPossibleStep() {
		final PossibleStep res;

		if (possibleStep > 0) {
			res = new PossibleStep(getTimelineWindow(), index, possibleStep - 1);
		} else {
			res = null;
		}

		return res;
	}

	/**
	 * Gets the next {@link PossibleStep} in the {@link Choice}.
	 * 
	 * @return the next {@link PossibleStep} in the {@link Choice} if any, <code>null</code> otherwise
	 */
	public PossibleStep getNextPossibleStep() {
		final PossibleStep res;

		if (possibleStep < getTimelineWindow().getProvider().getNumberOfPossibleStepsAt(index)) {
			res = new PossibleStep(getTimelineWindow(), index, possibleStep + 1);
		} else {
			res = null;
		}

		return res;
	}

	/**
	 * Gets the index in the owning {@link Choice}.
	 * 
	 * @return the index in the owning {@link Choice}
	 */
	public int getPossibleStepIndex() {
		return possibleStep;
	}

	/**
	 * Gets the index of the owning {@link Choice}.
	 * 
	 * @return the index of the owning {@link Choice}
	 */
	public int getChoiceIndex() {
		return index;
	}

	/**
	 * Gets the {@link List} of preceding {@link Connection}.
	 * 
	 * @return the {@link List} of preceding {@link Connection}
	 */
	public List<Connection> getPreceding() {
		final List<Connection> res = new ArrayList<Connection>();

		final ITimelineProvider provider = getTimelineWindow().getProvider();
		if (isSelected() && index > getTimelineWindow().getStart()) {
			final int preceding = provider.getPreceding(index, possibleStep);
			if (preceding >= 0) {
				res.add(new Connection(new PossibleStep(getTimelineWindow(), index - 1, preceding), this));
			}
		}

		return res;
	}

	/**
	 * Gets the {@link List} of following {@link Connection}.
	 * 
	 * @return the {@link List} of following {@link Connection}
	 */
	public List<Connection> getFollowing() {
		final List<Connection> res = new ArrayList<Connection>();

		final ITimelineProvider provider = getTimelineWindow().getProvider();
		if (isSelected()
				&& index + 1 < Math.min(getTimelineWindow().getEnd(), getTimelineWindow().getProvider()
						.getNumberOfChoices())) {
			final int following = provider.getFollowing(index, possibleStep);
			if (following >= 0) {
				res.add(new Connection(this, new PossibleStep(getTimelineWindow(), index + 1, following)));
			}
		}

		return res;
	}

	@Override
	public int hashCode() {
		return (index << SHIFT) + possibleStep;
	}

	@Override
	public boolean equals(Object obj) {
		return obj instanceof PossibleStep && ((PossibleStep)obj).index == index
				&& ((PossibleStep)obj).possibleStep == possibleStep;
	}

	public Object getPossibleStep() {
		return getTimelineWindow().getProvider().getAt(index, possibleStep);
	}

	public Object getChoice2() {
		return getTimelineWindow().getProvider().getAt(index);
	}

}
