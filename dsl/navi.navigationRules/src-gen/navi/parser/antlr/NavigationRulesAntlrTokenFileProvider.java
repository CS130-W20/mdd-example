/*
 * generated by Xtext 2.19.0
 */
package navi.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class NavigationRulesAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("navi/parser/antlr/internal/InternalNavigationRules.tokens");
	}
}
