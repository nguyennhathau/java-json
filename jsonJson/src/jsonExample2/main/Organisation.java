package jsonExample2.main;

public class Organisation {
	private String organisationName;
	private String organisationShortDes;
	private String leadContact;
	private String adddressLine1;
	private String adddressLine2;
	private String adddressLine3;
	private String postcode;
	private String town;
	private String county;
	private int countryID;
	private String typeOfBusiness;
	private int sicCode;
	private String organisationFullDes;
	private String phone;
	private String fax;
	private String email;
	private String webAddress;
	
	
	
	public Organisation() {
	}
	public Organisation(String organisation, String organisationShortDes, String leadContact, String adddressLine1,
			String adddressLine2, String adddressLine3, String postcode, String town, String county, int countryID,
			String typeOfBusiness, int sicCode, String organisationFullDes, String phone, String fax, String email,
			String webAddress) {
		super();
		this.organisationName = organisation;
		this.organisationShortDes = organisationShortDes;
		this.leadContact = leadContact;
		this.adddressLine1 = adddressLine1;
		this.adddressLine2 = adddressLine2;
		this.adddressLine3 = adddressLine3;
		this.postcode = postcode;
		this.town = town;
		this.county = county;
		this.countryID = countryID;
		this.typeOfBusiness = typeOfBusiness;
		this.sicCode = sicCode;
		this.organisationFullDes = organisationFullDes;
		this.phone = phone;
		this.fax = fax;
		this.email = email;
		this.webAddress = webAddress;
	}
	public String getOrganisation() {
		return organisationName;
	}
	public void setOrganisation(String organisation) {
		this.organisationName = organisation;
	}
	public String getOrganisationShortDes() {
		return organisationShortDes;
	}
	public void setOrganisationShortDes(String organisationShortDes) {
		this.organisationShortDes = organisationShortDes;
	}
	public String getLeadContact() {
		return leadContact;
	}
	public void setLeadContact(String leadContact) {
		this.leadContact = leadContact;
	}
	public String getAdddressLine1() {
		return adddressLine1;
	}
	public void setAdddressLine1(String adddressLine1) {
		this.adddressLine1 = adddressLine1;
	}
	public String getAdddressLine2() {
		return adddressLine2;
	}
	public void setAdddressLine2(String adddressLine2) {
		this.adddressLine2 = adddressLine2;
	}
	public String getAdddressLine3() {
		return adddressLine3;
	}
	public void setAdddressLine3(String adddressLine3) {
		this.adddressLine3 = adddressLine3;
	}
	public String getPostcode() {
		return postcode;
	}
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	public String getTown() {
		return town;
	}
	public void setTown(String town) {
		this.town = town;
	}
	public String getCounty() {
		return county;
	}
	public void setCounty(String county) {
		this.county = county;
	}
	public int getCountryID() {
		return countryID;
	}
	public void setCountryID(int countryID) {
		this.countryID = countryID;
	}
	public String getTypeOfBusiness() {
		return typeOfBusiness;
	}
	public void setTypeOfBusiness(String typeOfBusiness) {
		this.typeOfBusiness = typeOfBusiness;
	}
	public int getSicCode() {
		return sicCode;
	}
	public void setSicCode(int sicCode) {
		this.sicCode = sicCode;
	}
	public String getOrganisationFullDes() {
		return organisationFullDes;
	}
	public void setOrganisationFullDes(String organisationFullDes) {
		this.organisationFullDes = organisationFullDes;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getWebAddress() {
		return webAddress;
	}
	public void setWebAddress(String webAddress) {
		this.webAddress = webAddress;
	}

	
	
}
