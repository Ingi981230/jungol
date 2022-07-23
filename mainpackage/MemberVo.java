package mainpackage;

public class MemberVo {
	private String id, password, apw, email, birth, gender;

	public MemberVo() {

	}

	public MemberVo(String id, String password) {
		this.id = id;
		this.password = password;
	}
	
	public MemberVo(String id, String password, String apw,String email, String birth, String gender) {
		this.id = id;
		this.password = password;
		this.apw = apw;
		this.email = email;
		this.birth = birth;
		this.gender = gender;

	}

	public String getId() {
		return id;
	}

	public String getPassword() {
		return password;

	}

	public String getapw() {
		return apw;

	}

	public String getemail() {
		return email;

	}

	public String getbirth() {
		return birth;

	}

	public String getgender() {
		return gender;

	}


}