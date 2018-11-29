/**
 * generated by Xtext 2.10.0
 */
package org.xtext.ecse439.project.airport.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.xtext.ecse439.project.airport.Airline;
import org.xtext.ecse439.project.airport.AirportPackage;
import org.xtext.ecse439.project.airport.Gate;
import org.xtext.ecse439.project.airport.Runway;
import org.xtext.ecse439.project.airport.Terminal;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Terminal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ecse439.project.airport.impl.TerminalImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.ecse439.project.airport.impl.TerminalImpl#getRunway <em>Runway</em>}</li>
 *   <li>{@link org.xtext.ecse439.project.airport.impl.TerminalImpl#getGates <em>Gates</em>}</li>
 *   <li>{@link org.xtext.ecse439.project.airport.impl.TerminalImpl#getAirline <em>Airline</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TerminalImpl extends MinimalEObjectImpl.Container implements Terminal
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getRunway() <em>Runway</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRunway()
   * @generated
   * @ordered
   */
  protected Runway runway;

  /**
   * The cached value of the '{@link #getGates() <em>Gates</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGates()
   * @generated
   * @ordered
   */
  protected EList<Gate> gates;

  /**
   * The cached value of the '{@link #getAirline() <em>Airline</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAirline()
   * @generated
   * @ordered
   */
  protected Airline airline;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TerminalImpl()
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
    return AirportPackage.Literals.TERMINAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AirportPackage.TERMINAL__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Runway getRunway()
  {
    if (runway != null && runway.eIsProxy())
    {
      InternalEObject oldRunway = (InternalEObject)runway;
      runway = (Runway)eResolveProxy(oldRunway);
      if (runway != oldRunway)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AirportPackage.TERMINAL__RUNWAY, oldRunway, runway));
      }
    }
    return runway;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Runway basicGetRunway()
  {
    return runway;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRunway(Runway newRunway)
  {
    Runway oldRunway = runway;
    runway = newRunway;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AirportPackage.TERMINAL__RUNWAY, oldRunway, runway));
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
      gates = new EObjectResolvingEList<Gate>(Gate.class, this, AirportPackage.TERMINAL__GATES);
    }
    return gates;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Airline getAirline()
  {
    if (airline != null && airline.eIsProxy())
    {
      InternalEObject oldAirline = (InternalEObject)airline;
      airline = (Airline)eResolveProxy(oldAirline);
      if (airline != oldAirline)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AirportPackage.TERMINAL__AIRLINE, oldAirline, airline));
      }
    }
    return airline;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Airline basicGetAirline()
  {
    return airline;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAirline(Airline newAirline)
  {
    Airline oldAirline = airline;
    airline = newAirline;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AirportPackage.TERMINAL__AIRLINE, oldAirline, airline));
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
      case AirportPackage.TERMINAL__NAME:
        return getName();
      case AirportPackage.TERMINAL__RUNWAY:
        if (resolve) return getRunway();
        return basicGetRunway();
      case AirportPackage.TERMINAL__GATES:
        return getGates();
      case AirportPackage.TERMINAL__AIRLINE:
        if (resolve) return getAirline();
        return basicGetAirline();
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
      case AirportPackage.TERMINAL__NAME:
        setName((String)newValue);
        return;
      case AirportPackage.TERMINAL__RUNWAY:
        setRunway((Runway)newValue);
        return;
      case AirportPackage.TERMINAL__GATES:
        getGates().clear();
        getGates().addAll((Collection<? extends Gate>)newValue);
        return;
      case AirportPackage.TERMINAL__AIRLINE:
        setAirline((Airline)newValue);
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
      case AirportPackage.TERMINAL__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AirportPackage.TERMINAL__RUNWAY:
        setRunway((Runway)null);
        return;
      case AirportPackage.TERMINAL__GATES:
        getGates().clear();
        return;
      case AirportPackage.TERMINAL__AIRLINE:
        setAirline((Airline)null);
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
      case AirportPackage.TERMINAL__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AirportPackage.TERMINAL__RUNWAY:
        return runway != null;
      case AirportPackage.TERMINAL__GATES:
        return gates != null && !gates.isEmpty();
      case AirportPackage.TERMINAL__AIRLINE:
        return airline != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //TerminalImpl
