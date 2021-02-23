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

}
