/**
 */
package fr.inria.diverse.event.commons.model.scenario;

import fr.inria.diverse.event.commons.model.property.Property;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arbiter Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.event.commons.model.scenario.ArbiterTransition#getGuard <em>Guard</em>}</li>
 *   <li>{@link fr.inria.diverse.event.commons.model.scenario.ArbiterTransition#getSource <em>Source</em>}</li>
 *   <li>{@link fr.inria.diverse.event.commons.model.scenario.ArbiterTransition#getTarget <em>Target</em>}</li>
 *   <li>{@link fr.inria.diverse.event.commons.model.scenario.ArbiterTransition#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see fr.inria.diverse.event.commons.model.scenario.ScenarioPackage#getArbiterTransition()
 * @model
 * @generated
 */
public interface ArbiterTransition<P extends Property, S extends ArbiterState<P, ?>> extends EObject {
	/**
	 * Returns the value of the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guard</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard</em>' containment reference.
	 * @see #setGuard(Property)
	 * @see fr.inria.diverse.event.commons.model.scenario.ScenarioPackage#getArbiterTransition_Guard()
	 * @model containment="true"
	 * @generated
	 */
	P getGuard();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.event.commons.model.scenario.ArbiterTransition#getGuard <em>Guard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard</em>' containment reference.
	 * @see #getGuard()
	 * @generated
	 */
	void setGuard(P value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.inria.diverse.event.commons.model.scenario.ArbiterState#getOutgoingTransitions <em>Outgoing Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(ArbiterState)
	 * @see fr.inria.diverse.event.commons.model.scenario.ScenarioPackage#getArbiterTransition_Source()
	 * @see fr.inria.diverse.event.commons.model.scenario.ArbiterState#getOutgoingTransitions
	 * @model opposite="outgoingTransitions" required="true"
	 * @generated
	 */
	S getSource();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.event.commons.model.scenario.ArbiterTransition#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(S value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.inria.diverse.event.commons.model.scenario.ArbiterState#getIncomingTransitions <em>Incoming Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(ArbiterState)
	 * @see fr.inria.diverse.event.commons.model.scenario.ScenarioPackage#getArbiterTransition_Target()
	 * @see fr.inria.diverse.event.commons.model.scenario.ArbiterState#getIncomingTransitions
	 * @model opposite="incomingTransitions" required="true"
	 * @generated
	 */
	S getTarget();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.event.commons.model.scenario.ArbiterTransition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(S value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see fr.inria.diverse.event.commons.model.scenario.ScenarioPackage#getArbiterTransition_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.event.commons.model.scenario.ArbiterTransition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ArbiterTransition
