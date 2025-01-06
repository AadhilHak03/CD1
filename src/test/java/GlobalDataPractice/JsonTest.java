package GlobalDataPractice;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import GlobalData.jsonConversion;

public class JsonTest {

	@Test(dataProvider="getData")
	public void integ(HashMap<String,String> input) {
		System.out.println(input.get("name"));
		
	}
	
	@DataProvider
	public Object[][] getData() throws IOException {
		jsonConversion dr = new jsonConversion();
		List<HashMap<String,String>> d = jsonConversion.jsonCon("C:\\\\Users\\\\aadhi\\\\eclipse-workspacePractice\\\\PracticeConcetps\\\\src\\\\main\\\\java\\\\GlobalData\\\\payLoad.json");
		return new Object[][] {{d.get(0)},{d.get(1)}};
	}
	
	
	
	
}
