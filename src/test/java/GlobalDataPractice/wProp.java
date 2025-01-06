package GlobalDataPractice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class wProp {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties p = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"/src/main/java/GlobalData/Data.properties");
		p.load(fis);
		String g = p.getProperty("greeting");
		System.out.println(g);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
