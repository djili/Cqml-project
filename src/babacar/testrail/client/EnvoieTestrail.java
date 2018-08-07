package babacar.testrail.client;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;

public class EnvoieTestrail {
	public static void envoie (Integer code , String comment)
	{
		APIClient client = new APIClient("http://localhost/testrail/");
		client.setUser("babacarfall.dev@gmail.com");
		client.setPassword("passer");
		Map data = new HashMap();
		data.put("status_id", code);
		data.put("comment", comment);
		try {
			JSONObject r = (JSONObject) client.sendPost("add_result_for_case/6/3", data);
		} catch (IOException | APIException e) {
			e.printStackTrace();
		}
		
	}
}
