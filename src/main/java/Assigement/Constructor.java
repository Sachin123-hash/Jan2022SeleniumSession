package Assigement;

public class Constructor {
	private String name;
	private double version;
	private String plugin;
	
	public Constructor(String name) {
		this.name=name;
		}
	public Constructor(String name,double version) {
		this.name=name;
		this.version=version;
		
		}
	public Constructor(String name,double version,String plugin) {
		this.name=name;
		this.version=version;
		this.plugin=plugin;
		
		}
	
	
	

	public double getVersion() {
		return version;
	}
	public void setVersion(double version) {
		this.version = version;
	}
	public String getPlugin() {
		return plugin;
	}
	public void setPlugin(String plugin) {
		this.plugin = plugin;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getname() {
		return name;
		
	}
	
	public static void main(String[] args) {
		
		              
	
		Constructor c = new Constructor("Tom", 90, "Zee");
		System.out.println(c.name+""+c.plugin+""+c.version);
		
		c.setName("Hey");
		c.setPlugin("AZ");
		c.setVersion(100);
		
		System.out.println(c.getname()+""+c.getPlugin()+""+c.getVersion());
		
		
		

	}

}
