/**
 * generated by Xtext 2.19.0
 */
package navi.navigationRules;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see navi.navigationRules.NavigationRulesPackage
 * @generated
 */
public interface NavigationRulesFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  NavigationRulesFactory eINSTANCE = navi.navigationRules.impl.NavigationRulesFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Root</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Root</em>'.
   * @generated
   */
  Root createRoot();

  /**
   * Returns a new object of class '<em>Mappings</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mappings</em>'.
   * @generated
   */
  Mappings createMappings();

  /**
   * Returns a new object of class '<em>Mapping</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mapping</em>'.
   * @generated
   */
  Mapping createMapping();

  /**
   * Returns a new object of class '<em>Mapping Spec</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mapping Spec</em>'.
   * @generated
   */
  MappingSpec createMappingSpec();

  /**
   * Returns a new object of class '<em>Permission Mapping Spec</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Permission Mapping Spec</em>'.
   * @generated
   */
  PermissionMappingSpec createPermissionMappingSpec();

  /**
   * Returns a new object of class '<em>Coordinate Mapping Spec</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Coordinate Mapping Spec</em>'.
   * @generated
   */
  CoordinateMappingSpec createCoordinateMappingSpec();

  /**
   * Returns a new object of class '<em>Transition Definitions</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Transition Definitions</em>'.
   * @generated
   */
  TransitionDefinitions createTransitionDefinitions();

  /**
   * Returns a new object of class '<em>Transition Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Transition Definition</em>'.
   * @generated
   */
  TransitionDefinition createTransitionDefinition();

  /**
   * Returns a new object of class '<em>Navigation Rules</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Navigation Rules</em>'.
   * @generated
   */
  NavigationRules createNavigationRules();

  /**
   * Returns a new object of class '<em>Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rule</em>'.
   * @generated
   */
  Rule createRule();

  /**
   * Returns a new object of class '<em>Destination</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Destination</em>'.
   * @generated
   */
  Destination createDestination();

  /**
   * Returns a new object of class '<em>Permission Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Permission Reference</em>'.
   * @generated
   */
  PermissionReference createPermissionReference();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  NavigationRulesPackage getNavigationRulesPackage();

} //NavigationRulesFactory