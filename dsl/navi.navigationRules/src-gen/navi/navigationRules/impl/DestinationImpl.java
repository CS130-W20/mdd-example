/**
 * generated by Xtext 2.19.0
 */
package navi.navigationRules.impl;

import java.util.Collection;

import navi.navigationRules.CoordinateMappingSpec;
import navi.navigationRules.Destination;
import navi.navigationRules.NavigationRulesPackage;
import navi.navigationRules.PermissionReference;
import navi.navigationRules.TransitionDefinition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Destination</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link navi.navigationRules.impl.DestinationImpl#getTransition <em>Transition</em>}</li>
 *   <li>{@link navi.navigationRules.impl.DestinationImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link navi.navigationRules.impl.DestinationImpl#getPermissions <em>Permissions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DestinationImpl extends MinimalEObjectImpl.Container implements Destination
{
  /**
   * The cached value of the '{@link #getTransition() <em>Transition</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTransition()
   * @generated
   * @ordered
   */
  protected TransitionDefinition transition;

  /**
   * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTarget()
   * @generated
   * @ordered
   */
  protected CoordinateMappingSpec target;

  /**
   * The cached value of the '{@link #getPermissions() <em>Permissions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPermissions()
   * @generated
   * @ordered
   */
  protected EList<PermissionReference> permissions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DestinationImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return NavigationRulesPackage.Literals.DESTINATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TransitionDefinition getTransition()
  {
    if (transition != null && transition.eIsProxy())
    {
      InternalEObject oldTransition = (InternalEObject)transition;
      transition = (TransitionDefinition)eResolveProxy(oldTransition);
      if (transition != oldTransition)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, NavigationRulesPackage.DESTINATION__TRANSITION, oldTransition, transition));
      }
    }
    return transition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TransitionDefinition basicGetTransition()
  {
    return transition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTransition(TransitionDefinition newTransition)
  {
    TransitionDefinition oldTransition = transition;
    transition = newTransition;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, NavigationRulesPackage.DESTINATION__TRANSITION, oldTransition, transition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CoordinateMappingSpec getTarget()
  {
    if (target != null && target.eIsProxy())
    {
      InternalEObject oldTarget = (InternalEObject)target;
      target = (CoordinateMappingSpec)eResolveProxy(oldTarget);
      if (target != oldTarget)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, NavigationRulesPackage.DESTINATION__TARGET, oldTarget, target));
      }
    }
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CoordinateMappingSpec basicGetTarget()
  {
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTarget(CoordinateMappingSpec newTarget)
  {
    CoordinateMappingSpec oldTarget = target;
    target = newTarget;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, NavigationRulesPackage.DESTINATION__TARGET, oldTarget, target));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<PermissionReference> getPermissions()
  {
    if (permissions == null)
    {
      permissions = new EObjectContainmentEList<PermissionReference>(PermissionReference.class, this, NavigationRulesPackage.DESTINATION__PERMISSIONS);
    }
    return permissions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case NavigationRulesPackage.DESTINATION__PERMISSIONS:
        return ((InternalEList<?>)getPermissions()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case NavigationRulesPackage.DESTINATION__TRANSITION:
        if (resolve) return getTransition();
        return basicGetTransition();
      case NavigationRulesPackage.DESTINATION__TARGET:
        if (resolve) return getTarget();
        return basicGetTarget();
      case NavigationRulesPackage.DESTINATION__PERMISSIONS:
        return getPermissions();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case NavigationRulesPackage.DESTINATION__TRANSITION:
        setTransition((TransitionDefinition)newValue);
        return;
      case NavigationRulesPackage.DESTINATION__TARGET:
        setTarget((CoordinateMappingSpec)newValue);
        return;
      case NavigationRulesPackage.DESTINATION__PERMISSIONS:
        getPermissions().clear();
        getPermissions().addAll((Collection<? extends PermissionReference>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case NavigationRulesPackage.DESTINATION__TRANSITION:
        setTransition((TransitionDefinition)null);
        return;
      case NavigationRulesPackage.DESTINATION__TARGET:
        setTarget((CoordinateMappingSpec)null);
        return;
      case NavigationRulesPackage.DESTINATION__PERMISSIONS:
        getPermissions().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case NavigationRulesPackage.DESTINATION__TRANSITION:
        return transition != null;
      case NavigationRulesPackage.DESTINATION__TARGET:
        return target != null;
      case NavigationRulesPackage.DESTINATION__PERMISSIONS:
        return permissions != null && !permissions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //DestinationImpl
