/**
 * generated by Xtext 2.19.0
 */
package navi.generator;

import com.google.common.collect.Iterables;
import navi.navigationRules.Destination;
import navi.navigationRules.NavigationRules;
import navi.navigationRules.Root;
import navi.navigationRules.Rule;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class NavigationRulesGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    Iterable<Root> _filter = Iterables.<Root>filter(resource.getContents(), Root.class);
    for (final Root root : _filter) {
      String _name = root.getName();
      String _plus = (_name + "Rules.java");
      fsa.generateFile(_plus, this.toCode(root));
    }
  }
  
  public String toCode(final Root root) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import java.util.HashMap;");
    _builder.newLine();
    _builder.append("import java.util.HashSet;");
    _builder.newLine();
    _builder.append("import java.util.Map;");
    _builder.newLine();
    _builder.append("import java.util.Set;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ");
    String _name = root.getName();
    _builder.append(_name);
    _builder.append("Rules {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("private Map<String, Set<NaviDestination>> rules = new HashMap<>();");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public ");
    String _name_1 = root.getName();
    _builder.append(_name_1, "\t");
    _builder.append("Rules() {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("NaviDestination nv;");
    _builder.newLine();
    {
      NavigationRules _ruledefs = null;
      if (root!=null) {
        _ruledefs=root.getRuledefs();
      }
      EList<Rule> _rules = _ruledefs.getRules();
      for(final Rule rule : _rules) {
        {
          EList<Destination> _destinations = rule.getDestinations();
          for(final Destination dest : _destinations) {
            _builder.newLine();
            _builder.append("\t\t");
            String _code = this.toCode(rule, dest);
            _builder.append(_code, "\t\t");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("protected void store(String rule, NaviDestination dest) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Set<NaviDestination> destinations = rules.get(rule);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if (destinations == null) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("rules.put(rule, destinations = new HashSet<>());");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("destinations.add(dest);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public Map<String, Set<NaviDestination>> getRules() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return rules;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public class NaviDestination {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("protected String action;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("protected String targetClassname;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("protected String targetBundleId;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}\t\t\t");
    _builder.newLine();
    return _builder.toString();
  }
  
  public String toCode(final Rule rule, final Destination dest) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("nv = new NaviDestination();");
    _builder.newLine();
    _builder.append("nv.action = \"");
    String _name = dest.getTransition().getName();
    _builder.append(_name);
    _builder.append("\";");
    _builder.newLineIfNotEmpty();
    _builder.append("nv.targetClassname = \"");
    String _controllername = dest.getTarget().getControllername();
    _builder.append(_controllername);
    _builder.append("\";");
    _builder.newLineIfNotEmpty();
    _builder.append("nv.targetBundleId = \"");
    String _bundleid = dest.getTarget().getBundleid();
    _builder.append(_bundleid);
    _builder.append("\";");
    _builder.newLineIfNotEmpty();
    _builder.append("store(\"");
    String _name_1 = rule.getSource().getName();
    _builder.append(_name_1);
    _builder.append("\", nv);");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
}
