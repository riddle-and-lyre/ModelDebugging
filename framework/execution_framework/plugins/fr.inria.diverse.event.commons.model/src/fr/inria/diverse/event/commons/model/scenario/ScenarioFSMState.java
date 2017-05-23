/**
 */
package fr.inria.diverse.event.commons.model.scenario;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FSM State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.event.commons.model.scenario.ScenarioFSMState#getEvent <em>Event</em>}</li>
 *   <li>{@link fr.inria.diverse.event.commons.model.scenario.ScenarioFSMState#getOutgoingTransitions <em>Outgoing Transitions</em>}</li>
 *   <li>{@link fr.inria.diverse.event.commons.model.scenario.ScenarioFSMState#getIncomingTransitions <em>Incoming Transitions</em>}</li>
 * </ul>
 *
 * @see fr.inria.diverse.event.commons.model.scenario.ScenarioPackage#getScenarioFSMState()
 * @model abstract="true"
 * @generated
 */
public interface ScenarioFSMState<E extends Event<?>, T extends ScenarioFSMTransition<?, ?>> extends EObject {
	/**
	 * Returns the value of the '<em><b>Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' containment reference.
	 * @see #setEvent(Event)
	 * @see fr.inria.diverse.event.commons.model.scenario.ScenarioPackage#getScenarioFSMState_Event()
	 * @model containment="true"
	 * @generated
	 */
	E getEvent();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.event.commons.model.scenario.ScenarioFSMState#getEvent <em>Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' containment reference.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(E value);

	/**
	 * Returns the value of the '<em><b>Outgoing Transitions</b></em>' reference list.
	 * It is bidirectional and its opposite is '{@link fr.inria.diverse.event.commons.model.scenario.ScenarioFSMTransition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Transitions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Transitions</em>' reference list.
	 * @see fr.inria.diverse.event.commons.model.scenario.ScenarioPackage#getScenarioFSMState_OutgoingTransitions()
	 * @see fr.inria.diverse.event.commons.model.scenario.ScenarioFSMTransition#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<T> getOutgoingTransitions();

	/**
	 * Returns the value of the '<em><b>Incoming Transitions</b></em>' reference list.
	 * It is bidirectional and its opposite is '{@link fr.inria.diverse.event.commons.model.scenario.ScenarioFSMTransition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Transitions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Transitions</em>' reference list.
	 * @see fr.inria.diverse.event.commons.model.scenario.ScenarioPackage#getScenarioFSMState_IncomingTransitions()
	 * @see fr.inria.diverse.event.commons.model.scenario.ScenarioFSMTransition#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<T> getIncomingTransitions();

} // ScenarioFSMState
