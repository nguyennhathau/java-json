package model.client;


public class Test {
	public static void main(String[] args) {
		
		//json jackson phai dung ObjectMapper de chuyen qua lai json va java
		// mapper.writeValueAsString(object); de convert Java to Json
		//mapper.readValue(jsonString, cls); de convert Json to java
		
		OrganisationDB organDB = new OrganisationDB();	
		Organisation organ = new Organisation();
		organ = organDB.getOrganbyName();
		
		//convert java to json
		String jsonString = JsonUtil.convertJavatoJson(organ);
		System.out.println(jsonString);
		System.out.println("++++++++++++++++++");
		
		// convert json to java
		Organisation organnew =JsonUtil.convertJsontoJava(jsonString, Organisation.class);
		System.out.println(organnew.getAdddressLine1());
	}
}
