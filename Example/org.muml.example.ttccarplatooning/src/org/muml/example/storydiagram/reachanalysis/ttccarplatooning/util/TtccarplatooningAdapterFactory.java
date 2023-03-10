/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.example.storydiagram.reachanalysis.ttccarplatooning.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;
import org.muml.example.storydiagram.reachanalysis.ttccarplatooning.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.muml.example.storydiagram.reachanalysis.ttccarplatooning.TtccarplatooningPackage
 * @generated
 */
public class TtccarplatooningAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TtccarplatooningPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TtccarplatooningAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TtccarplatooningPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TtccarplatooningSwitch<Adapter> modelSwitch =
		new TtccarplatooningSwitch<Adapter>() {
			@Override
			public Adapter caseEnvironment(Environment object) {
				return createEnvironmentAdapter();
			}
			@Override
			public Adapter caseCarprocess(Carprocess object) {
				return createCarprocessAdapter();
			}
			@Override
			public Adapter caseCarParameter(CarParameter object) {
				return createCarParameterAdapter();
			}
			@Override
			public Adapter caseMessageQueue(MessageQueue object) {
				return createMessageQueueAdapter();
			}
			@Override
			public Adapter caseMessage(Message object) {
				return createMessageAdapter();
			}
			@Override
			public Adapter caseStatechart(Statechart object) {
				return createStatechartAdapter();
			}
			@Override
			public Adapter caseState(State object) {
				return createStateAdapter();
			}
			@Override
			public Adapter caseActiveState(ActiveState object) {
				return createActiveStateAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.muml.example.storydiagram.reachanalysis.ttccarplatooning.Environment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.example.storydiagram.reachanalysis.ttccarplatooning.Environment
	 * @generated
	 */
	public Adapter createEnvironmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.example.storydiagram.reachanalysis.ttccarplatooning.Carprocess <em>Carprocess</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.example.storydiagram.reachanalysis.ttccarplatooning.Carprocess
	 * @generated
	 */
	public Adapter createCarprocessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.example.storydiagram.reachanalysis.ttccarplatooning.CarParameter <em>Car Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.example.storydiagram.reachanalysis.ttccarplatooning.CarParameter
	 * @generated
	 */
	public Adapter createCarParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.example.storydiagram.reachanalysis.ttccarplatooning.MessageQueue <em>Message Queue</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.example.storydiagram.reachanalysis.ttccarplatooning.MessageQueue
	 * @generated
	 */
	public Adapter createMessageQueueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.example.storydiagram.reachanalysis.ttccarplatooning.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.example.storydiagram.reachanalysis.ttccarplatooning.Message
	 * @generated
	 */
	public Adapter createMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.example.storydiagram.reachanalysis.ttccarplatooning.Statechart <em>Statechart</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.example.storydiagram.reachanalysis.ttccarplatooning.Statechart
	 * @generated
	 */
	public Adapter createStatechartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.example.storydiagram.reachanalysis.ttccarplatooning.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.example.storydiagram.reachanalysis.ttccarplatooning.State
	 * @generated
	 */
	public Adapter createStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.muml.example.storydiagram.reachanalysis.ttccarplatooning.ActiveState <em>Active State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.muml.example.storydiagram.reachanalysis.ttccarplatooning.ActiveState
	 * @generated
	 */
	public Adapter createActiveStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //TtccarplatooningAdapterFactory
