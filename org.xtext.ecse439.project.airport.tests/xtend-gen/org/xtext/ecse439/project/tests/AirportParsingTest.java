/**
 * generated by Xtext 2.10.0
 */
package org.xtext.ecse439.project.tests;

import com.google.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.xtext.ecse439.project.airport.Domainmodel;
import org.xtext.ecse439.project.tests.AirportInjectorProvider;

@RunWith(XtextRunner.class)
@InjectWith(AirportInjectorProvider.class)
@SuppressWarnings("all")
public class AirportParsingTest {
  @Inject
  private ParseHelper<Domainmodel> parseHelper;
  
  @Test
  public void loadModel() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Hello Xtext!");
      _builder.newLine();
      final Domainmodel result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
