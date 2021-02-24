package test_server;

import java.util.ArrayList;
import java.util.List;

import org.apache.camel.json.simple.JsonObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/accounts")
public class EhCacheController {

	@GetMapping("/transactions")
	@ResponseBody
	public List<JsonObject> getCacheMember() {

		JsonObject jsonobj = new JsonObject();
		jsonobj.put("id", 1);
		jsonobj.put("name", "홍길동");
		jsonobj.put("description", "testServer");

		List<JsonObject> list = new ArrayList<>();
		list.add(jsonobj);

		return list;
	}

	// @GetMapping("accounts")
	// @ResponseBody
	// public List<String> xmlDataSend() throws JsonMappingException, JsonProcessingException {
	// String jsonString = "{\"custNm\":\"홍길동\","
	// + "\"custPh\":\"010-0000-0000\","
	// + "\"birth\":\"2000-01-23\""
	// + "}";
	//
	// ObjectMapper objectMapper = new ObjectMapper();
	// ObjectMapper xmlMapper = new XmlMapper();
	// JsonNode tree = objectMapper.readTree(jsonString);
	// String jsonAsXml = xmlMapper.writer().withRootName("RootTagName").writeValueAsString(tree);
	// System.out.println(jsonAsXml);
	// return jsonAsXml;
	// }

}
