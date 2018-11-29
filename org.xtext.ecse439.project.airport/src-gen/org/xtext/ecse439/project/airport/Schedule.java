/**
 * generated by Xtext 2.10.0
 */
package org.xtext.ecse439.project.airport;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schedule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ecse439.project.airport.Schedule#getDate <em>Date</em>}</li>
 *   <li>{@link org.xtext.ecse439.project.airport.Schedule#getFlGate <em>Fl Gate</em>}</li>
 * </ul>
 *
 * @see org.xtext.ecse439.project.airport.AirportPackage#getSchedule()
 * @model
 * @generated
 */
public interface Schedule extends EObject
{
  /**
   * Returns the value of the '<em><b>Date</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Date</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Date</em>' containment reference.
   * @see #setDate(Date)
   * @see org.xtext.ecse439.project.airport.AirportPackage#getSchedule_Date()
   * @model containment="true"
   * @generated
   */
  Date getDate();

  /**
   * Sets the value of the '{@link org.xtext.ecse439.project.airport.Schedule#getDate <em>Date</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Date</em>' containment reference.
   * @see #getDate()
   * @generated
   */
  void setDate(Date value);

  /**
   * Returns the value of the '<em><b>Fl Gate</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.ecse439.project.airport.FlGate}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fl Gate</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fl Gate</em>' containment reference list.
   * @see org.xtext.ecse439.project.airport.AirportPackage#getSchedule_FlGate()
   * @model containment="true"
   * @generated
   */
  EList<FlGate> getFlGate();

} // Schedule