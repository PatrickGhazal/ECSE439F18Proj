/*
 * generated by Xtext 2.10.0
 */
package org.xtext.ecse439.project.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class AirportAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("org/xtext/ecse439/project/parser/antlr/internal/InternalAirport.tokens");
	}
}
