/**
 * generated by Xtext 2.10.0
 */
package org.xtext.ecse439.project.airport;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>All Terminals</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ecse439.project.airport.AllTerminals#getTerminals <em>Terminals</em>}</li>
 * </ul>
 *
 * @see org.xtext.ecse439.project.airport.AirportPackage#getAllTerminals()
 * @model
 * @generated
 */
public interface AllTerminals extends EObject
{
  /**
   * Returns the value of the '<em><b>Terminals</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.ecse439.project.airport.Terminal}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Terminals</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Terminals</em>' containment reference list.
   * @see org.xtext.ecse439.project.airport.AirportPackage#getAllTerminals_Terminals()
   * @model containment="true"
   * @generated
   */
  EList<Terminal> getTerminals();

} // AllTerminals
