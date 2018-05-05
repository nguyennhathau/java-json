package jsonExample2.main;


import atg.taglib.json.util.JSONException;
import atg.taglib.json.util.JSONObject;


public class test {
	public static void main(String[] args) throws JSONException {
		
		//lib json
		//dung truc tiep, de su dung
		//muon xuat json thi gan cac truong vao object json
		
		Organisation organ = new Organisation();
		OrganisationDB organDB = new OrganisationDB();
		
		//khoi tao doi tuong json
		JSONObject obj = new JSONObject();
		
		
		organ = organDB.getOrganbyName();
		
		//convert java object to json
		obj.put("address1", organ.getAdddressLine1());
		obj.put("address2", organ.getAdddressLine2());
		obj.put("address3", organ.getAdddressLine3());
		
		// xuat ra dinh dang json
		System.out.println(obj);
		
		// convert json to java
		System.out.println(obj.getString("address1"));
	}
}
