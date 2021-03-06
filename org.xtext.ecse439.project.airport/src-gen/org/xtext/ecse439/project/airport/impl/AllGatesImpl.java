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
import org.xtext.ecse439.project.airport.AllGates;
import org.xtext.ecse439.project.airport.Gate;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>All Gates</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ecse439.project.airport.impl.AllGatesImpl#getGates <em>Gates</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AllGatesImpl extends MinimalEObjectImpl.Container implements AllGates
{
  /**
   * The cached value of the '{@link #getGates() <em>Gates</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGates()
   * @generated
   * @ordered
   */
  protected EList<Gate> gates;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AllGatesImpl()
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
    return AirportPackage.Literals.ALL_GATES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Gate> getGates()
  {
    if (gates == null)
    {
      gates = new EObjectContainmentEList<Gate>(Gate.class, this, AirportPackage.ALL_GATES__GATES);
    }
    return gates;
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
      case AirportPackage.ALL_GATES__GATES:
        return ((InternalEList<?>)getGates()).basicRemove(otherEnd, msgs);
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
      case AirportPackage.ALL_GATES__GATES:
        return getGates();
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
      case AirportPackage.ALL_GATES__GATES:
        getGates().clear();
        getGates().addAll((Collection<? extends Gate>)newValue);
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
      case AirportPackage.ALL_GATES__GATES:
        getGates().clear();
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
      case AirportPackage.ALL_GATES__GATES:
        return gates != null && !gates.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //AllGatesImpl
