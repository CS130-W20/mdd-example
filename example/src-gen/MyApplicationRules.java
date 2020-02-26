import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MyApplicationRules {
	private Map<String, Set<NaviDestination>> rules = new HashMap<>();
	
	public MyApplicationRules() {
		NaviDestination nv;

		nv = new NaviDestination();
		nv.action = "USER_LOGON_FAILED";
		nv.targetClassname = "myapp.gui.login.LoginFailedController";
		nv.targetBundleId = "myapp.login";
		store("Login", nv);

		nv = new NaviDestination();
		nv.action = "USER_LOGON_SUCCESS";
		nv.targetClassname = "myapp.gui.menu.MainMenuController";
		nv.targetBundleId = "myapp.menu";
		store("Login", nv);

		nv = new NaviDestination();
		nv.action = "OK";
		nv.targetClassname = "myapp.gui.login.LoginController";
		nv.targetBundleId = "myapp.login";
		store("LoginFailed", nv);

		nv = new NaviDestination();
		nv.action = "ADMIN";
		nv.targetClassname = "myapp.gui.admin.UserAdministration";
		nv.targetBundleId = "myapp.admin";
		store("MainMenu", nv);

		nv = new NaviDestination();
		nv.action = "DATA_LOOKUP";
		nv.targetClassname = "myapp.gui.lookup.LookupControlle";
		nv.targetBundleId = "myapp.lookup";
		store("MainMenu", nv);

		nv = new NaviDestination();
		nv.action = "BACK";
		nv.targetClassname = "myapp.gui.menu.MainMenuController";
		nv.targetBundleId = "myapp.menu";
		store("UserAdministration", nv);

		nv = new NaviDestination();
		nv.action = "BACK";
		nv.targetClassname = "myapp.gui.menu.MainMenuController";
		nv.targetBundleId = "myapp.menu";
		store("DataLookup", nv);
	}
	
	protected void store(String rule, NaviDestination dest) {
		Set<NaviDestination> destinations = rules.get(rule);
		if (destinations == null) {
			rules.put(rule, destinations = new HashSet<>());
		}
		destinations.add(dest);
	}
	
	public Map<String, Set<NaviDestination>> getRules() {
		return rules;
	}

	public class NaviDestination {
		protected String action;
		protected String targetClassname;
		protected String targetBundleId;
	}
}			
