package Project01;

public class MemberVo {
	private String id;
	private String password;
	private String name;
	private String pnumber;
	private String height;
	private String weight;
	private String bmi = null;
	private String gender;
	private String age;
	
	static MemberVo vo;

	public MemberVo() { }
	
	public MemberVo(String id, String password) {
		this.id = id;
		this.password = password;
	}
	
	public MemberVo(String name, String pnumber, String height, String weight, String bmi, String gender, String age) {
		this.name = name;
		this.pnumber = pnumber;
		this.height = height;
		this.weight = weight;
		this.bmi = bmi;
		this.gender = gender;
		this.age = age;
	}
	
	public MemberVo(String id, String password, String name, String pnumber, String height, String weight, String bmi, String gender, String age) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.pnumber = pnumber;
		this.height = height;
		this.weight = weight;
		this.bmi = bmi;
		this.gender = gender;
		this.age = age;
	}
	
	public String getId() {
		return id;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String getName() {
		return name;
	}
	
	public String getGender() {
		return gender;
	}
	
	public String getAge() {
		return age;
	}
	
	public String getPnumber() {
		return pnumber;
	}
	
	public String getHeight() {
		return height;
	}
	
	public String getWeight() {
		return weight;
	}
	
	public String getBmi() {
		return bmi;
	}
	
	public void setId(String id) {
		this.id = id;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public void setAge(String age) {
		this.age = age;
	}
	
	public void setPnumber(String pnumber) {
		this.pnumber = pnumber;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public void setBmi(String bmi) {
		this.bmi = bmi;
	}
	
	public double setBmi() {
		return calBMI(Double.parseDouble(this.weight), Double.parseDouble(this.height));
	}
	
	public double calBMI(double kg, double cm) {
		return Math.round((kg / (cm*cm))*1000000)/100.0;
	}
	
}