/**
 */
package org.muml.example.railcab.profiles;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.muml.example.railcab.profiles.ProfilesFactory
 * @model kind="package"
 * @generated
 */
public interface ProfilesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "profiles";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.muml.org/examples/profiles/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "profiles";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProfilesPackage eINSTANCE = org.muml.example.railcab.profiles.impl.ProfilesPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.muml.example.railcab.profiles.impl.ProfileImpl <em>Profile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.example.railcab.profiles.impl.ProfileImpl
	 * @see org.muml.example.railcab.profiles.impl.ProfilesPackageImpl#getProfile()
	 * @generated
	 */
	int PROFILE = 0;

	/**
	 * The number of structural features of the '<em>Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.muml.example.railcab.profiles.impl.ProfileListImpl <em>Profile List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.example.railcab.profiles.impl.ProfileListImpl
	 * @see org.muml.example.railcab.profiles.impl.ProfilesPackageImpl#getProfileList()
	 * @generated
	 */
	int PROFILE_LIST = 1;

	/**
	 * The feature id for the '<em><b>Profiles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_LIST__PROFILES = 0;

	/**
	 * The number of structural features of the '<em>Profile List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_LIST_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Profile List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.muml.example.railcab.profiles.impl.ProfileIteratorImpl <em>Profile Iterator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.example.railcab.profiles.impl.ProfileIteratorImpl
	 * @see org.muml.example.railcab.profiles.impl.ProfilesPackageImpl#getProfileIterator()
	 * @generated
	 */
	int PROFILE_ITERATOR = 2;

	/**
	 * The feature id for the '<em><b>Profiles To Do</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_ITERATOR__PROFILES_TO_DO = 0;

	/**
	 * The number of structural features of the '<em>Profile Iterator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_ITERATOR_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Profile Iterator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_ITERATOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.muml.example.railcab.profiles.impl.ProfileStoreImpl <em>Profile Store</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.example.railcab.profiles.impl.ProfileStoreImpl
	 * @see org.muml.example.railcab.profiles.impl.ProfilesPackageImpl#getProfileStore()
	 * @generated
	 */
	int PROFILE_STORE = 3;

	/**
	 * The feature id for the '<em><b>Role Profiles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_STORE__ROLE_PROFILES = 0;

	/**
	 * The number of structural features of the '<em>Profile Store</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_STORE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Profile Store</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_STORE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.muml.example.railcab.profiles.impl.RoleProfilesImpl <em>Role Profiles</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.example.railcab.profiles.impl.RoleProfilesImpl
	 * @see org.muml.example.railcab.profiles.impl.ProfilesPackageImpl#getRoleProfiles()
	 * @generated
	 */
	int ROLE_PROFILES = 4;

	/**
	 * The feature id for the '<em><b>All Profiles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_PROFILES__ALL_PROFILES = 0;

	/**
	 * The feature id for the '<em><b>Current Profile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_PROFILES__CURRENT_PROFILE = 1;

	/**
	 * The feature id for the '<em><b>Role Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_PROFILES__ROLE_INSTANCE = 2;

	/**
	 * The feature id for the '<em><b>Second Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_PROFILES__SECOND_INSTANCE = 3;

	/**
	 * The number of structural features of the '<em>Role Profiles</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_PROFILES_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Role Profiles</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_PROFILES_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.muml.example.railcab.profiles.Profile <em>Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Profile</em>'.
	 * @see org.muml.example.railcab.profiles.Profile
	 * @generated
	 */
	EClass getProfile();

	/**
	 * Returns the meta object for class '{@link org.muml.example.railcab.profiles.ProfileList <em>Profile List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Profile List</em>'.
	 * @see org.muml.example.railcab.profiles.ProfileList
	 * @generated
	 */
	EClass getProfileList();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.example.railcab.profiles.ProfileList#getProfiles <em>Profiles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Profiles</em>'.
	 * @see org.muml.example.railcab.profiles.ProfileList#getProfiles()
	 * @see #getProfileList()
	 * @generated
	 */
	EReference getProfileList_Profiles();

	/**
	 * Returns the meta object for class '{@link org.muml.example.railcab.profiles.ProfileIterator <em>Profile Iterator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Profile Iterator</em>'.
	 * @see org.muml.example.railcab.profiles.ProfileIterator
	 * @generated
	 */
	EClass getProfileIterator();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.example.railcab.profiles.ProfileIterator#getProfilesToDo <em>Profiles To Do</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Profiles To Do</em>'.
	 * @see org.muml.example.railcab.profiles.ProfileIterator#getProfilesToDo()
	 * @see #getProfileIterator()
	 * @generated
	 */
	EReference getProfileIterator_ProfilesToDo();

	/**
	 * Returns the meta object for class '{@link org.muml.example.railcab.profiles.ProfileStore <em>Profile Store</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Profile Store</em>'.
	 * @see org.muml.example.railcab.profiles.ProfileStore
	 * @generated
	 */
	EClass getProfileStore();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.example.railcab.profiles.ProfileStore#getRoleProfiles <em>Role Profiles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Role Profiles</em>'.
	 * @see org.muml.example.railcab.profiles.ProfileStore#getRoleProfiles()
	 * @see #getProfileStore()
	 * @generated
	 */
	EReference getProfileStore_RoleProfiles();

	/**
	 * Returns the meta object for class '{@link org.muml.example.railcab.profiles.RoleProfiles <em>Role Profiles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Profiles</em>'.
	 * @see org.muml.example.railcab.profiles.RoleProfiles
	 * @generated
	 */
	EClass getRoleProfiles();

	/**
	 * Returns the meta object for the reference list '{@link org.muml.example.railcab.profiles.RoleProfiles#getAllProfiles <em>All Profiles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>All Profiles</em>'.
	 * @see org.muml.example.railcab.profiles.RoleProfiles#getAllProfiles()
	 * @see #getRoleProfiles()
	 * @generated
	 */
	EReference getRoleProfiles_AllProfiles();

	/**
	 * Returns the meta object for the reference '{@link org.muml.example.railcab.profiles.RoleProfiles#getCurrentProfile <em>Current Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Current Profile</em>'.
	 * @see org.muml.example.railcab.profiles.RoleProfiles#getCurrentProfile()
	 * @see #getRoleProfiles()
	 * @generated
	 */
	EReference getRoleProfiles_CurrentProfile();

	/**
	 * Returns the meta object for the reference '{@link org.muml.example.railcab.profiles.RoleProfiles#getRoleInstance <em>Role Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role Instance</em>'.
	 * @see org.muml.example.railcab.profiles.RoleProfiles#getRoleInstance()
	 * @see #getRoleProfiles()
	 * @generated
	 */
	EReference getRoleProfiles_RoleInstance();

	/**
	 * Returns the meta object for the reference '{@link org.muml.example.railcab.profiles.RoleProfiles#getSecondInstance <em>Second Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Second Instance</em>'.
	 * @see org.muml.example.railcab.profiles.RoleProfiles#getSecondInstance()
	 * @see #getRoleProfiles()
	 * @generated
	 */
	EReference getRoleProfiles_SecondInstance();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ProfilesFactory getProfilesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.muml.example.railcab.profiles.impl.ProfileImpl <em>Profile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.example.railcab.profiles.impl.ProfileImpl
		 * @see org.muml.example.railcab.profiles.impl.ProfilesPackageImpl#getProfile()
		 * @generated
		 */
		EClass PROFILE = eINSTANCE.getProfile();

		/**
		 * The meta object literal for the '{@link org.muml.example.railcab.profiles.impl.ProfileListImpl <em>Profile List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.example.railcab.profiles.impl.ProfileListImpl
		 * @see org.muml.example.railcab.profiles.impl.ProfilesPackageImpl#getProfileList()
		 * @generated
		 */
		EClass PROFILE_LIST = eINSTANCE.getProfileList();

		/**
		 * The meta object literal for the '<em><b>Profiles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROFILE_LIST__PROFILES = eINSTANCE.getProfileList_Profiles();

		/**
		 * The meta object literal for the '{@link org.muml.example.railcab.profiles.impl.ProfileIteratorImpl <em>Profile Iterator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.example.railcab.profiles.impl.ProfileIteratorImpl
		 * @see org.muml.example.railcab.profiles.impl.ProfilesPackageImpl#getProfileIterator()
		 * @generated
		 */
		EClass PROFILE_ITERATOR = eINSTANCE.getProfileIterator();

		/**
		 * The meta object literal for the '<em><b>Profiles To Do</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROFILE_ITERATOR__PROFILES_TO_DO = eINSTANCE.getProfileIterator_ProfilesToDo();

		/**
		 * The meta object literal for the '{@link org.muml.example.railcab.profiles.impl.ProfileStoreImpl <em>Profile Store</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.example.railcab.profiles.impl.ProfileStoreImpl
		 * @see org.muml.example.railcab.profiles.impl.ProfilesPackageImpl#getProfileStore()
		 * @generated
		 */
		EClass PROFILE_STORE = eINSTANCE.getProfileStore();

		/**
		 * The meta object literal for the '<em><b>Role Profiles</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROFILE_STORE__ROLE_PROFILES = eINSTANCE.getProfileStore_RoleProfiles();

		/**
		 * The meta object literal for the '{@link org.muml.example.railcab.profiles.impl.RoleProfilesImpl <em>Role Profiles</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.example.railcab.profiles.impl.RoleProfilesImpl
		 * @see org.muml.example.railcab.profiles.impl.ProfilesPackageImpl#getRoleProfiles()
		 * @generated
		 */
		EClass ROLE_PROFILES = eINSTANCE.getRoleProfiles();

		/**
		 * The meta object literal for the '<em><b>All Profiles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_PROFILES__ALL_PROFILES = eINSTANCE.getRoleProfiles_AllProfiles();

		/**
		 * The meta object literal for the '<em><b>Current Profile</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_PROFILES__CURRENT_PROFILE = eINSTANCE.getRoleProfiles_CurrentProfile();

		/**
		 * The meta object literal for the '<em><b>Role Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_PROFILES__ROLE_INSTANCE = eINSTANCE.getRoleProfiles_RoleInstance();

		/**
		 * The meta object literal for the '<em><b>Second Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_PROFILES__SECOND_INSTANCE = eINSTANCE.getRoleProfiles_SecondInstance();

	}

} //ProfilesPackage
