package test_server;

import java.util.ArrayList;
import java.util.List;

import org.apache.camel.json.simple.JsonObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

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

	@RequestMapping(value = "/xml", produces = "application/xml")
	@ResponseBody
	public String xmlDataSend() throws JsonMappingException, JsonProcessingException {

		String jsonString = "{\"custNm\":\"홍길동\","
				+ "\"custPh\":\"010-0000-0000\","
				+ "\"birth\":\"2000-01-23\""
				+ "}";

		ObjectMapper	objectMapper	= new ObjectMapper();
		ObjectMapper	xmlMapper			= new XmlMapper();
		JsonNode			tree					= objectMapper.readTree(jsonString);
		String				jsonAsXml			= xmlMapper.writer().withRootName("").writeValueAsString(tree);
		System.out.println(jsonAsXml);

		// TestModel model = new TestModel();
		// model.setAge(11);
		// model.setName("홍길동");
		// model.setGender("남자");
		// model.setMoney(1111111);
		//
		// TestModel model2 = new TestModel();
		// model2.setTestModel(model);

		return jsonAsXml;

	}

}
