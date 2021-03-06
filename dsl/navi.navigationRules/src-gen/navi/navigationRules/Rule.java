/**
 * generated by Xtext 2.19.0
 */
package navi.navigationRules;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link navi.navigationRules.Rule#getSource <em>Source</em>}</li>
 *   <li>{@link navi.navigationRules.Rule#getDestinations <em>Destinations</em>}</li>
 * </ul>
 *
 * @see navi.navigationRules.NavigationRulesPackage#getRule()
 * @model
 * @generated
 */
public interface Rule extends EObject
{
  /**
   * Returns the value of the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source</em>' reference.
   * @see #setSource(CoordinateMappingSpec)
   * @see navi.navigationRules.NavigationRulesPackage#getRule_Source()
   * @model
   * @generated
   */
  CoordinateMappingSpec getSource();

  /**
   * Sets the value of the '{@link navi.navigationRules.Rule#getSource <em>Source</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' reference.
   * @see #getSource()
   * @generated
   */
  void setSource(CoordinateMappingSpec value);

  /**
   * Returns the value of the '<em><b>Destinations</b></em>' containment reference list.
   * The list contents are of type {@link navi.navigationRules.Destination}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Destinations</em>' containment reference list.
   * @see navi.navigationRules.NavigationRulesPackage#getRule_Destinations()
   * @model containment="true"
   * @generated
   */
  EList<Destination> getDestinations();

} // Rule
