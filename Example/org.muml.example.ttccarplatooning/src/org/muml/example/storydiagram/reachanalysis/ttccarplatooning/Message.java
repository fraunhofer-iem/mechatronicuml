/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.example.storydiagram.reachanalysis.ttccarplatooning;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.example.storydiagram.reachanalysis.ttccarplatooning.Message#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.muml.example.storydiagram.reachanalysis.ttccarplatooning.Message#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.muml.example.storydiagram.reachanalysis.ttccarplatooning.TtccarplatooningPackage#getMessage()
 * @model
 * @generated
 */
public interface Message extends EObject {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.example.storydiagram.reachanalysis.ttccarplatooning.CarParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see org.muml.example.storydiagram.reachanalysis.ttccarplatooning.TtccarplatooningPackage#getMessage_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<CarParameter> getParameters();

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
	 * @see org.muml.example.storydiagram.reachanalysis.ttccarplatooning.TtccarplatooningPackage#getMessage_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.muml.example.storydiagram.reachanalysis.ttccarplatooning.Message#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Message
