/**
 * generated by Xtext 2.10.0
 */
package org.xtext.ecse439.project.airport;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domainmodel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ecse439.project.airport.Domainmodel#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see org.xtext.ecse439.project.airport.AirportPackage#getDomainmodel()
 * @model
 * @generated
 */
public interface Domainmodel extends EObject
{
  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.ecse439.project.airport.Airport}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see org.xtext.ecse439.project.airport.AirportPackage#getDomainmodel_Elements()
   * @model containment="true"
   * @generated
   */
  EList<Airport> getElements();

} // Domainmodel
