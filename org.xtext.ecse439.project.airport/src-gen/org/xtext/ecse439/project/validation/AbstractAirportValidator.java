/*
 * generated by Xtext 2.10.0
 */
package org.xtext.ecse439.project.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractAirportValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(org.xtext.ecse439.project.airport.AirportPackage.eINSTANCE);
		return result;
	}
	
}
