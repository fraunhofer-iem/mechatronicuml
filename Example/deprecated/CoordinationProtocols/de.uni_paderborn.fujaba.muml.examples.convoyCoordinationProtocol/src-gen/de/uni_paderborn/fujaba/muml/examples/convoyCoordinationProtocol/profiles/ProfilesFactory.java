/**
 */
package de.uni_paderborn.fujaba.muml.examples.convoyCoordinationProtocol.profiles;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.uni_paderborn.fujaba.muml.examples.convoyCoordinationProtocol.profiles.ProfilesPackage
 * @generated
 */
public interface ProfilesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProfilesFactory eINSTANCE = de.uni_paderborn.fujaba.muml.examples.convoyCoordinationProtocol.profiles.impl.ProfilesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Profile</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Profile</em>'.
	 * @generated
	 */
	Profile createProfile();

	/**
	 * Returns a new object of class '<em>Profile List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Profile List</em>'.
	 * @generated
	 */
	ProfileList createProfileList();

	/**
	 * Returns a new object of class '<em>Profile Iterator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Profile Iterator</em>'.
	 * @generated
	 */
	ProfileIterator createProfileIterator();

	/**
	 * Returns a new object of class '<em>Profile Store</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Profile Store</em>'.
	 * @generated
	 */
	ProfileStore createProfileStore();

	/**
	 * Returns a new object of class '<em>Role Profiles</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role Profiles</em>'.
	 * @generated
	 */
	RoleProfiles createRoleProfiles();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ProfilesPackage getProfilesPackage();

} //ProfilesFactory
