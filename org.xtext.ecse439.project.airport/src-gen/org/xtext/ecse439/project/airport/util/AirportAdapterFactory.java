/**
 * generated by Xtext 2.10.0
 */
package org.xtext.ecse439.project.airport.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.xtext.ecse439.project.airport.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.ecse439.project.airport.AirportPackage
 * @generated
 */
public class AirportAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static AirportPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AirportAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = AirportPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AirportSwitch<Adapter> modelSwitch =
    new AirportSwitch<Adapter>()
    {
      @Override
      public Adapter caseDomainmodel(Domainmodel object)
      {
        return createDomainmodelAdapter();
      }
      @Override
      public Adapter caseAirport(Airport object)
      {
        return createAirportAdapter();
      }
      @Override
      public Adapter caseAllTerminals(AllTerminals object)
      {
        return createAllTerminalsAdapter();
      }
      @Override
      public Adapter caseAllRunways(AllRunways object)
      {
        return createAllRunwaysAdapter();
      }
      @Override
      public Adapter caseAllGates(AllGates object)
      {
        return createAllGatesAdapter();
      }
      @Override
      public Adapter caseAllAirlines(AllAirlines object)
      {
        return createAllAirlinesAdapter();
      }
      @Override
      public Adapter caseAllFlights(AllFlights object)
      {
        return createAllFlightsAdapter();
      }
      @Override
      public Adapter caseSchedule(Schedule object)
      {
        return createScheduleAdapter();
      }
      @Override
      public Adapter caseFlight(Flight object)
      {
        return createFlightAdapter();
      }
      @Override
      public Adapter caseFlGate(FlGate object)
      {
        return createFlGateAdapter();
      }
      @Override
      public Adapter caseTerminal(Terminal object)
      {
        return createTerminalAdapter();
      }
      @Override
      public Adapter caseRunway(Runway object)
      {
        return createRunwayAdapter();
      }
      @Override
      public Adapter caseGate(Gate object)
      {
        return createGateAdapter();
      }
      @Override
      public Adapter caseAirline(Airline object)
      {
        return createAirlineAdapter();
      }
      @Override
      public Adapter caseDate(Date object)
      {
        return createDateAdapter();
      }
      @Override
      public Adapter caseTime(Time object)
      {
        return createTimeAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ecse439.project.airport.Domainmodel <em>Domainmodel</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ecse439.project.airport.Domainmodel
   * @generated
   */
  public Adapter createDomainmodelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ecse439.project.airport.Airport <em>Airport</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ecse439.project.airport.Airport
   * @generated
   */
  public Adapter createAirportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ecse439.project.airport.AllTerminals <em>All Terminals</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ecse439.project.airport.AllTerminals
   * @generated
   */
  public Adapter createAllTerminalsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ecse439.project.airport.AllRunways <em>All Runways</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ecse439.project.airport.AllRunways
   * @generated
   */
  public Adapter createAllRunwaysAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ecse439.project.airport.AllGates <em>All Gates</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ecse439.project.airport.AllGates
   * @generated
   */
  public Adapter createAllGatesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ecse439.project.airport.AllAirlines <em>All Airlines</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ecse439.project.airport.AllAirlines
   * @generated
   */
  public Adapter createAllAirlinesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ecse439.project.airport.AllFlights <em>All Flights</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ecse439.project.airport.AllFlights
   * @generated
   */
  public Adapter createAllFlightsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ecse439.project.airport.Schedule <em>Schedule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ecse439.project.airport.Schedule
   * @generated
   */
  public Adapter createScheduleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ecse439.project.airport.Flight <em>Flight</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ecse439.project.airport.Flight
   * @generated
   */
  public Adapter createFlightAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ecse439.project.airport.FlGate <em>Fl Gate</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ecse439.project.airport.FlGate
   * @generated
   */
  public Adapter createFlGateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ecse439.project.airport.Terminal <em>Terminal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ecse439.project.airport.Terminal
   * @generated
   */
  public Adapter createTerminalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ecse439.project.airport.Runway <em>Runway</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ecse439.project.airport.Runway
   * @generated
   */
  public Adapter createRunwayAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ecse439.project.airport.Gate <em>Gate</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ecse439.project.airport.Gate
   * @generated
   */
  public Adapter createGateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ecse439.project.airport.Airline <em>Airline</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ecse439.project.airport.Airline
   * @generated
   */
  public Adapter createAirlineAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ecse439.project.airport.Date <em>Date</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ecse439.project.airport.Date
   * @generated
   */
  public Adapter createDateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.ecse439.project.airport.Time <em>Time</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.ecse439.project.airport.Time
   * @generated
   */
  public Adapter createTimeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //AirportAdapterFactory
