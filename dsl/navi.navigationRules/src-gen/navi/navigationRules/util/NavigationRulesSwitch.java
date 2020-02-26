/**
 * generated by Xtext 2.19.0
 */
package navi.navigationRules.util;

import navi.navigationRules.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see navi.navigationRules.NavigationRulesPackage
 * @generated
 */
public class NavigationRulesSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static NavigationRulesPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NavigationRulesSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = NavigationRulesPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case NavigationRulesPackage.ROOT:
      {
        Root root = (Root)theEObject;
        T result = caseRoot(root);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NavigationRulesPackage.MAPPINGS:
      {
        Mappings mappings = (Mappings)theEObject;
        T result = caseMappings(mappings);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NavigationRulesPackage.MAPPING:
      {
        Mapping mapping = (Mapping)theEObject;
        T result = caseMapping(mapping);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NavigationRulesPackage.MAPPING_SPEC:
      {
        MappingSpec mappingSpec = (MappingSpec)theEObject;
        T result = caseMappingSpec(mappingSpec);
        if (result == null) result = caseMapping(mappingSpec);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NavigationRulesPackage.PERMISSION_MAPPING_SPEC:
      {
        PermissionMappingSpec permissionMappingSpec = (PermissionMappingSpec)theEObject;
        T result = casePermissionMappingSpec(permissionMappingSpec);
        if (result == null) result = caseMappingSpec(permissionMappingSpec);
        if (result == null) result = caseMapping(permissionMappingSpec);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NavigationRulesPackage.COORDINATE_MAPPING_SPEC:
      {
        CoordinateMappingSpec coordinateMappingSpec = (CoordinateMappingSpec)theEObject;
        T result = caseCoordinateMappingSpec(coordinateMappingSpec);
        if (result == null) result = caseMappingSpec(coordinateMappingSpec);
        if (result == null) result = caseMapping(coordinateMappingSpec);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NavigationRulesPackage.TRANSITION_DEFINITIONS:
      {
        TransitionDefinitions transitionDefinitions = (TransitionDefinitions)theEObject;
        T result = caseTransitionDefinitions(transitionDefinitions);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NavigationRulesPackage.TRANSITION_DEFINITION:
      {
        TransitionDefinition transitionDefinition = (TransitionDefinition)theEObject;
        T result = caseTransitionDefinition(transitionDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NavigationRulesPackage.NAVIGATION_RULES:
      {
        NavigationRules navigationRules = (NavigationRules)theEObject;
        T result = caseNavigationRules(navigationRules);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NavigationRulesPackage.RULE:
      {
        Rule rule = (Rule)theEObject;
        T result = caseRule(rule);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NavigationRulesPackage.DESTINATION:
      {
        Destination destination = (Destination)theEObject;
        T result = caseDestination(destination);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NavigationRulesPackage.PERMISSION_REFERENCE:
      {
        PermissionReference permissionReference = (PermissionReference)theEObject;
        T result = casePermissionReference(permissionReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Root</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Root</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRoot(Root object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mappings</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mappings</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMappings(Mappings object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mapping</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mapping</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMapping(Mapping object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mapping Spec</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mapping Spec</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMappingSpec(MappingSpec object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Permission Mapping Spec</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Permission Mapping Spec</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePermissionMappingSpec(PermissionMappingSpec object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Coordinate Mapping Spec</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Coordinate Mapping Spec</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCoordinateMappingSpec(CoordinateMappingSpec object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Transition Definitions</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Transition Definitions</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTransitionDefinitions(TransitionDefinitions object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Transition Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Transition Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTransitionDefinition(TransitionDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Navigation Rules</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Navigation Rules</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNavigationRules(NavigationRules object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rule</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rule</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRule(Rule object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Destination</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Destination</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDestination(Destination object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Permission Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Permission Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePermissionReference(PermissionReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //NavigationRulesSwitch