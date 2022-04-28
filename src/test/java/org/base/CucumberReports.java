package org.base;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class CucumberReports {
	
	public static void jvmReport(String json) {
		
		File file = new File("C:\\Users\\madha\\eclipse-workspace\\CucumberProject\\target");
		
		Configuration configuration = new Configuration(file, "Facebook");
		configuration.addClassifications("Browser name", "Chrome");
		configuration.addClassifications("Sprint no", "25");
		configuration.addClassifications("Platform", "Win-11");
		configuration.addClassifications("Environment", "UAT");
		
		List<String> li = new ArrayList<String>();
		
		li.add(json);
		
		ReportBuilder builder = new ReportBuilder(li, configuration);
		builder.generateReports();
		
		
	}

}
