package pac2;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

public class RunTestNg {

	public static void main(String[] args) {
	TestNG runner=new TestNG();
	List<String>suitfiles=new ArrayList<String>();
	suitfiles.add("D:\\LKSAHU\\seleniumprogramm\\s1\\testng.xml");
	runner.setTestSuites(suitfiles);
	runner.run();

	}

}
