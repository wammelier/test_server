package test_server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

//@XmlRootElement (name = "")
@XmlAccessorType (XmlAccessType.FIELD)
@Data
public class TestModel {

	private String name;
	private Integer age;
	private Integer money;
	private String gender;
	
//	@XmlElement(name = "")
	private TestModel testModel = null;
	
	public TestModel getmodel() {
		return testModel;
	}
	
	public void setTestModel(TestModel model) {
		this.testModel = model;
	}
}
