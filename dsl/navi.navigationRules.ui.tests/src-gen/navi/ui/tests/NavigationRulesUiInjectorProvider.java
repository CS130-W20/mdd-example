/*
 * generated by Xtext 2.19.0
 */
package navi.ui.tests;

import com.google.inject.Injector;
import navi.navigationRules.ui.internal.NavigationRulesActivator;
import org.eclipse.xtext.testing.IInjectorProvider;

public class NavigationRulesUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return NavigationRulesActivator.getInstance().getInjector("navi.NavigationRules");
	}

}
