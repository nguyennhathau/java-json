package main;

import com.google.gson.Gson;

public class Test {
	public static void main(String[] args) {
		
		//lib fgJson
		//dung truc tiep, de su dung

		
		OrganisationDB organDB = new OrganisationDB();
		Organisation organ = new Organisation();
		organ = organDB.getOrganbyName();
		
		//khoi tao gson
		 Gson gson = new Gson();
		 
		 //convert java to json
		 String json = gson.toJson(organ); // serializes target to Json
		 System.out.println(json);
		 
		 //convert json to java
		 Organisation organ2 = gson.fromJson(json, Organisation.class); // deserializes json into target2
		 
		 System.out.println(organ2.getAdddressLine1());
		 System.out.println(organ2.getAdddressLine2());
		 System.out.println(organ2.getAdddressLine3());
		
	}
}
