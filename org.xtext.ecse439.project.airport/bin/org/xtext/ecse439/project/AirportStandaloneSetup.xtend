/*
 * generated by Xtext 2.10.0
 */
package org.xtext.ecse439.project


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class AirportStandaloneSetup extends AirportStandaloneSetupGenerated {

	def static void doSetup() {
		new AirportStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}