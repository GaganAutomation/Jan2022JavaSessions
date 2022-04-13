package javasession;

public class Browser {
	
	private String name;
	private double version;
	private String[] plugin;
	
	public Browser(String name, double version, String[] plugin) {
		
		this.name = name;
		this.version = version;
		this.plugin = plugin;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the version
	 */
	public double getVersion() {
		return version;
	}

	/**
	 * @return the plugin
	 */
	public String[] getPlugin() {
		return plugin;
	}

	
	
}
