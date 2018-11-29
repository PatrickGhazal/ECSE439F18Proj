/**
 * generated by Xtext 2.10.0
 */
package org.xtext.ecse439.project.airport;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ecse439.project.airport.Gate#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.ecse439.project.airport.Gate#getMaxApSize <em>Max Ap Size</em>}</li>
 * </ul>
 *
 * @see org.xtext.ecse439.project.airport.AirportPackage#getGate()
 * @model
 * @generated
 */
public interface Gate extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.ecse439.project.airport.AirportPackage#getGate_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.ecse439.project.airport.Gate#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Max Ap Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Max Ap Size</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Max Ap Size</em>' attribute.
   * @see #setMaxApSize(int)
   * @see org.xtext.ecse439.project.airport.AirportPackage#getGate_MaxApSize()
   * @model
   * @generated
   */
  int getMaxApSize();

  /**
   * Sets the value of the '{@link org.xtext.ecse439.project.airport.Gate#getMaxApSize <em>Max Ap Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Max Ap Size</em>' attribute.
   * @see #getMaxApSize()
   * @generated
   */
  void setMaxApSize(int value);

} // Gate
