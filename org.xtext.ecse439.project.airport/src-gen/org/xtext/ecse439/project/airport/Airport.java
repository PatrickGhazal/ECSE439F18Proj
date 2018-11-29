/**
 * generated by Xtext 2.10.0
 */
package org.xtext.ecse439.project.airport;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Airport</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ecse439.project.airport.Airport#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.ecse439.project.airport.Airport#getSchedule <em>Schedule</em>}</li>
 *   <li>{@link org.xtext.ecse439.project.airport.Airport#getAllRun <em>All Run</em>}</li>
 *   <li>{@link org.xtext.ecse439.project.airport.Airport#getAllGat <em>All Gat</em>}</li>
 *   <li>{@link org.xtext.ecse439.project.airport.Airport#getAllAir <em>All Air</em>}</li>
 *   <li>{@link org.xtext.ecse439.project.airport.Airport#getAllFli <em>All Fli</em>}</li>
 *   <li>{@link org.xtext.ecse439.project.airport.Airport#getAllTer <em>All Ter</em>}</li>
 * </ul>
 *
 * @see org.xtext.ecse439.project.airport.AirportPackage#getAirport()
 * @model
 * @generated
 */
public interface Airport extends EObject
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
   * @see org.xtext.ecse439.project.airport.AirportPackage#getAirport_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.ecse439.project.airport.Airport#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Schedule</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Schedule</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Schedule</em>' containment reference.
   * @see #setSchedule(Schedule)
   * @see org.xtext.ecse439.project.airport.AirportPackage#getAirport_Schedule()
   * @model containment="true"
   * @generated
   */
  Schedule getSchedule();

  /**
   * Sets the value of the '{@link org.xtext.ecse439.project.airport.Airport#getSchedule <em>Schedule</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Schedule</em>' containment reference.
   * @see #getSchedule()
   * @generated
   */
  void setSchedule(Schedule value);

  /**
   * Returns the value of the '<em><b>All Run</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>All Run</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>All Run</em>' containment reference.
   * @see #setAllRun(AllRunways)
   * @see org.xtext.ecse439.project.airport.AirportPackage#getAirport_AllRun()
   * @model containment="true"
   * @generated
   */
  AllRunways getAllRun();

  /**
   * Sets the value of the '{@link org.xtext.ecse439.project.airport.Airport#getAllRun <em>All Run</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>All Run</em>' containment reference.
   * @see #getAllRun()
   * @generated
   */
  void setAllRun(AllRunways value);

  /**
   * Returns the value of the '<em><b>All Gat</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>All Gat</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>All Gat</em>' containment reference.
   * @see #setAllGat(AllGates)
   * @see org.xtext.ecse439.project.airport.AirportPackage#getAirport_AllGat()
   * @model containment="true"
   * @generated
   */
  AllGates getAllGat();

  /**
   * Sets the value of the '{@link org.xtext.ecse439.project.airport.Airport#getAllGat <em>All Gat</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>All Gat</em>' containment reference.
   * @see #getAllGat()
   * @generated
   */
  void setAllGat(AllGates value);

  /**
   * Returns the value of the '<em><b>All Air</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>All Air</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>All Air</em>' containment reference.
   * @see #setAllAir(AllAirlines)
   * @see org.xtext.ecse439.project.airport.AirportPackage#getAirport_AllAir()
   * @model containment="true"
   * @generated
   */
  AllAirlines getAllAir();

  /**
   * Sets the value of the '{@link org.xtext.ecse439.project.airport.Airport#getAllAir <em>All Air</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>All Air</em>' containment reference.
   * @see #getAllAir()
   * @generated
   */
  void setAllAir(AllAirlines value);

  /**
   * Returns the value of the '<em><b>All Fli</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>All Fli</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>All Fli</em>' containment reference.
   * @see #setAllFli(AllFlights)
   * @see org.xtext.ecse439.project.airport.AirportPackage#getAirport_AllFli()
   * @model containment="true"
   * @generated
   */
  AllFlights getAllFli();

  /**
   * Sets the value of the '{@link org.xtext.ecse439.project.airport.Airport#getAllFli <em>All Fli</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>All Fli</em>' containment reference.
   * @see #getAllFli()
   * @generated
   */
  void setAllFli(AllFlights value);

  /**
   * Returns the value of the '<em><b>All Ter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>All Ter</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>All Ter</em>' containment reference.
   * @see #setAllTer(AllTerminals)
   * @see org.xtext.ecse439.project.airport.AirportPackage#getAirport_AllTer()
   * @model containment="true"
   * @generated
   */
  AllTerminals getAllTer();

  /**
   * Sets the value of the '{@link org.xtext.ecse439.project.airport.Airport#getAllTer <em>All Ter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>All Ter</em>' containment reference.
   * @see #getAllTer()
   * @generated
   */
  void setAllTer(AllTerminals value);

} // Airport