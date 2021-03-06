/**
 * generated by Xtext 2.10.0
 */
package org.xtext.ecse439.project.airport;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>All Gates</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ecse439.project.airport.AllGates#getGates <em>Gates</em>}</li>
 * </ul>
 *
 * @see org.xtext.ecse439.project.airport.AirportPackage#getAllGates()
 * @model
 * @generated
 */
public interface AllGates extends EObject
{
  /**
   * Returns the value of the '<em><b>Gates</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.ecse439.project.airport.Gate}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Gates</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Gates</em>' containment reference list.
   * @see org.xtext.ecse439.project.airport.AirportPackage#getAllGates_Gates()
   * @model containment="true"
   * @generated
   */
  EList<Gate> getGates();

} // AllGates
