/*
 * generated by Xtext 2.19.0
 */
package navi.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractNavigationRulesValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(navi.navigationRules.NavigationRulesPackage.eINSTANCE);
		return result;
	}
}
