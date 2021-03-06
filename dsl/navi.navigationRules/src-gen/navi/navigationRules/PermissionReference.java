/**
 * generated by Xtext 2.19.0
 */
package navi.navigationRules;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Permission Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link navi.navigationRules.PermissionReference#getPermission <em>Permission</em>}</li>
 * </ul>
 *
 * @see navi.navigationRules.NavigationRulesPackage#getPermissionReference()
 * @model
 * @generated
 */
public interface PermissionReference extends EObject
{
  /**
   * Returns the value of the '<em><b>Permission</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Permission</em>' reference.
   * @see #setPermission(PermissionMappingSpec)
   * @see navi.navigationRules.NavigationRulesPackage#getPermissionReference_Permission()
   * @model
   * @generated
   */
  PermissionMappingSpec getPermission();

  /**
   * Sets the value of the '{@link navi.navigationRules.PermissionReference#getPermission <em>Permission</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Permission</em>' reference.
   * @see #getPermission()
   * @generated
   */
  void setPermission(PermissionMappingSpec value);

} // PermissionReference
