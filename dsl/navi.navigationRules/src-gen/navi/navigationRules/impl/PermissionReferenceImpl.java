/**
 * generated by Xtext 2.19.0
 */
package navi.navigationRules.impl;

import navi.navigationRules.NavigationRulesPackage;
import navi.navigationRules.PermissionMappingSpec;
import navi.navigationRules.PermissionReference;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Permission Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link navi.navigationRules.impl.PermissionReferenceImpl#getPermission <em>Permission</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PermissionReferenceImpl extends MinimalEObjectImpl.Container implements PermissionReference
{
  /**
   * The cached value of the '{@link #getPermission() <em>Permission</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPermission()
   * @generated
   * @ordered
   */
  protected PermissionMappingSpec permission;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PermissionReferenceImpl()
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
    return NavigationRulesPackage.Literals.PERMISSION_REFERENCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PermissionMappingSpec getPermission()
  {
    if (permission != null && permission.eIsProxy())
    {
      InternalEObject oldPermission = (InternalEObject)permission;
      permission = (PermissionMappingSpec)eResolveProxy(oldPermission);
      if (permission != oldPermission)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, NavigationRulesPackage.PERMISSION_REFERENCE__PERMISSION, oldPermission, permission));
      }
    }
    return permission;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PermissionMappingSpec basicGetPermission()
  {
    return permission;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPermission(PermissionMappingSpec newPermission)
  {
    PermissionMappingSpec oldPermission = permission;
    permission = newPermission;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, NavigationRulesPackage.PERMISSION_REFERENCE__PERMISSION, oldPermission, permission));
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
      case NavigationRulesPackage.PERMISSION_REFERENCE__PERMISSION:
        if (resolve) return getPermission();
        return basicGetPermission();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case NavigationRulesPackage.PERMISSION_REFERENCE__PERMISSION:
        setPermission((PermissionMappingSpec)newValue);
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
      case NavigationRulesPackage.PERMISSION_REFERENCE__PERMISSION:
        setPermission((PermissionMappingSpec)null);
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
      case NavigationRulesPackage.PERMISSION_REFERENCE__PERMISSION:
        return permission != null;
    }
    return super.eIsSet(featureID);
  }

} //PermissionReferenceImpl