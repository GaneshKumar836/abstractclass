import java.awt.*;
abstract class project //abstract class
{
	abstract void softwareRequirements();
	abstract void hardwareRequirements();   // Abstract Methods
	void basepaper()		// Body of the method
	{
		System.out.println("IEEE Base Paper");
	}//with in the abstract class we can create method body
}
class Javaproject extends project//level 1 class
{
	String projectname,projectdomain,frontend,backend;
	String operatingsystem,processor,ram_size,harddisk_size;
	Javaproject(String pn,String pd,String fe,String be,String os,String pro,String rs,String hs)//constructor
	{
		projectname = pn;
		projectdomain = pd;
		frontend = fe;
		backend = be;
		operatingsystem = os;
		processor = pro;
		ram_size = rs;
		harddisk_size = hs;
	}
	void softwareRequirements()//abstract method 1
	{
		System.out.println("Project Name " + projectname);
		System.out.println("Project Domain " + projectdomain);
		System.out.println("Front End " + frontend);
		System.out.println("Back End " + backend);
	}
	void hardwareRequirements()//abstract method 2
	{
		System.out.println("Operating System " + operatingsystem);
		System.out.println("Processor Name " +processor );
		System.out.println("Ram size  "+ ram_size);
		System.out.println("Hard disk size " + harddisk_size);
	}
}
class Pythonproject extends project //derived class
{
	String projectname,projectdomain,frontend,backend;
	String operatingsystem,processor,ram_size,harddisk_size;
	Pythonproject(String pn,String pd,String fe,String be,String os,String pro,String rs,String hs)//constructor
	{
		projectname = pn;
		projectdomain = pd;
		frontend = fe;
		backend = be;
		operatingsystem = os;
		processor = pro;
		ram_size = rs;
		harddisk_size = hs;
	}
	void softwareRequirements()//abstract method 1
	{
		System.out.println("Project Name " + projectname);
		System.out.println("Project Domain " + projectdomain);
		System.out.println("Front End " + frontend);
		System.out.println("Back End " + backend);
	}
	void hardwareRequirements()//abstract method 1
	{
		System.out.println("Operating System " + operatingsystem);
		System.out.println("Processor Name " +processor );
		System.out.println("Ram size  "+ ram_size);
		System.out.println("Hard disk size " + harddisk_size);
	}
}
public class ProjectEx {//main class

	public static void main(String[] args) {//main method of the class-prototype method
	
		Javaproject jp = new Javaproject("Single to Multi Cloud","Cloud Computing","Java","Mysql","Linux","Inteli3","512MB","250GB");//creating object instance of java project
		Pythonproject pp = new Pythonproject("face recognition attendance system","AI","Python","sqlite","Windows11","Inteli5","1GB","500GB");//creating object instance of python project
		jp.basepaper();//method calling using javaproject instance
		jp.softwareRequirements();//abstract method calling using javaproject instance
		jp.hardwareRequirements();//abstract method calling using javaproject instance
		pp.basepaper();//method calling using python project instance
		pp.softwareRequirements();//abstract method calling using python project instance
		pp.hardwareRequirements();//abstract method calling using python project instance
	}

}

