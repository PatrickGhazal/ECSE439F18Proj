/**
 * generated by Xtext 2.10.0
 */
package org.xtext.ecse439.project.airport.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.ecse439.project.airport.AirportPackage;
import org.xtext.ecse439.project.airport.AllFlights;
import org.xtext.ecse439.project.airport.Flight;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>All Flights</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ecse439.project.airport.impl.AllFlightsImpl#getFlights <em>Flights</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AllFlightsImpl extends MinimalEObjectImpl.Container implements AllFlights
{
  /**
   * The cached value of the '{@link #getFlights() <em>Flights</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFlights()
   * @generated
   * @ordered
   */
  protected EList<Flight> flights;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AllFlightsImpl()
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
    return AirportPackage.Literals.ALL_FLIGHTS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Flight> getFlights()
  {
    if (flights == null)
    {
      flights = new EObjectContainmentEList<Flight>(Flight.class, this, AirportPackage.ALL_FLIGHTS__FLIGHTS);
    }
    return flights;
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
      case AirportPackage.ALL_FLIGHTS__FLIGHTS:
        return ((InternalEList<?>)getFlights()).basicRemove(otherEnd, msgs);
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
      case AirportPackage.ALL_FLIGHTS__FLIGHTS:
        return getFlights();
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
      case AirportPackage.ALL_FLIGHTS__FLIGHTS:
        getFlights().clear();
        getFlights().addAll((Collection<? extends Flight>)newValue);
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
      case AirportPackage.ALL_FLIGHTS__FLIGHTS:
        getFlights().clear();
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
      case AirportPackage.ALL_FLIGHTS__FLIGHTS:
        return flights != null && !flights.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //AllFlightsImpl
