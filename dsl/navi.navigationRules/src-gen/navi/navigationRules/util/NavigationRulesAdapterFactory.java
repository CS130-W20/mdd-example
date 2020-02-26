/**
 * generated by Xtext 2.19.0
 */
package navi.navigationRules.util;

import navi.navigationRules.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see navi.navigationRules.NavigationRulesPackage
 * @generated
 */
public class NavigationRulesAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static NavigationRulesPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NavigationRulesAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = NavigationRulesPackage.eINSTANCE;
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
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
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
  protected NavigationRulesSwitch<Adapter> modelSwitch =
    new NavigationRulesSwitch<Adapter>()
    {
      @Override
      public Adapter caseRoot(Root object)
      {
        return createRootAdapter();
      }
      @Override
      public Adapter caseMappings(Mappings object)
      {
        return createMappingsAdapter();
      }
      @Override
      public Adapter caseMapping(Mapping object)
      {
        return createMappingAdapter();
      }
      @Override
      public Adapter caseMappingSpec(MappingSpec object)
      {
        return createMappingSpecAdapter();
      }
      @Override
      public Adapter casePermissionMappingSpec(PermissionMappingSpec object)
      {
        return createPermissionMappingSpecAdapter();
      }
      @Override
      public Adapter caseCoordinateMappingSpec(CoordinateMappingSpec object)
      {
        return createCoordinateMappingSpecAdapter();
      }
      @Override
      public Adapter caseTransitionDefinitions(TransitionDefinitions object)
      {
        return createTransitionDefinitionsAdapter();
      }
      @Override
      public Adapter caseTransitionDefinition(TransitionDefinition object)
      {
        return createTransitionDefinitionAdapter();
      }
      @Override
      public Adapter caseNavigationRules(NavigationRules object)
      {
        return createNavigationRulesAdapter();
      }
      @Override
      public Adapter caseRule(Rule object)
      {
        return createRuleAdapter();
      }
      @Override
      public Adapter caseDestination(Destination object)
      {
        return createDestinationAdapter();
      }
      @Override
      public Adapter casePermissionReference(PermissionReference object)
      {
        return createPermissionReferenceAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
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
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link navi.navigationRules.Root <em>Root</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see navi.navigationRules.Root
   * @generated
   */
  public Adapter createRootAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link navi.navigationRules.Mappings <em>Mappings</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see navi.navigationRules.Mappings
   * @generated
   */
  public Adapter createMappingsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link navi.navigationRules.Mapping <em>Mapping</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see navi.navigationRules.Mapping
   * @generated
   */
  public Adapter createMappingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link navi.navigationRules.MappingSpec <em>Mapping Spec</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see navi.navigationRules.MappingSpec
   * @generated
   */
  public Adapter createMappingSpecAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link navi.navigationRules.PermissionMappingSpec <em>Permission Mapping Spec</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see navi.navigationRules.PermissionMappingSpec
   * @generated
   */
  public Adapter createPermissionMappingSpecAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link navi.navigationRules.CoordinateMappingSpec <em>Coordinate Mapping Spec</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see navi.navigationRules.CoordinateMappingSpec
   * @generated
   */
  public Adapter createCoordinateMappingSpecAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link navi.navigationRules.TransitionDefinitions <em>Transition Definitions</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see navi.navigationRules.TransitionDefinitions
   * @generated
   */
  public Adapter createTransitionDefinitionsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link navi.navigationRules.TransitionDefinition <em>Transition Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see navi.navigationRules.TransitionDefinition
   * @generated
   */
  public Adapter createTransitionDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link navi.navigationRules.NavigationRules <em>Navigation Rules</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see navi.navigationRules.NavigationRules
   * @generated
   */
  public Adapter createNavigationRulesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link navi.navigationRules.Rule <em>Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see navi.navigationRules.Rule
   * @generated
   */
  public Adapter createRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link navi.navigationRules.Destination <em>Destination</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see navi.navigationRules.Destination
   * @generated
   */
  public Adapter createDestinationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link navi.navigationRules.PermissionReference <em>Permission Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see navi.navigationRules.PermissionReference
   * @generated
   */
  public Adapter createPermissionReferenceAdapter()
  {
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
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //NavigationRulesAdapterFactory