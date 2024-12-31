/*
 * generated by Xtext 2.36.0
 */
package miniproject2.web;

import com.google.inject.Guice;
import com.google.inject.Injector;
import miniproject2.DslRuntimeModule;
import miniproject2.DslStandaloneSetup;
import miniproject2.ide.DslIdeModule;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages in web applications.
 */
public class DslWebSetup extends DslStandaloneSetup {
	
	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new DslRuntimeModule(), new DslIdeModule(), new DslWebModule()));
	}
	
}
