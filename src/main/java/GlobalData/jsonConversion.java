package GlobalData;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.io.FileUtils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class jsonConversion {

	public static List<HashMap<String,String>> jsonCon(String args) throws IOException {
		// TODO Auto-generated method stub
		String filePath = System.getProperty("user.dir")+"/src/main/java/GlobalData/payLoad.json";
			String js = FileUtils.readFileToString(new File(filePath), StandardCharsets.UTF_8);
			
			ObjectMapper map = new ObjectMapper();
			List<HashMap<String,String>> data =map.readValue(js, new TypeReference<List<HashMap<String,String>>>(){});
			return data;
	}

}
