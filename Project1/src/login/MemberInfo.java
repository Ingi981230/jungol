package login;

class MemberInfo {
	//한명의 회원 정보를 지정하기위한 클래스. 기본 정보로 아이디, 비번, 비번확인, 이름, 생년월일, 성별, 핸드폰번호를 저장하고
	//get, set을 이용하여 각각의 변수들을 저장하거나 가져다 씀
	private String id, pw, apw, name, birth, gender, pnumber;
	public MemberInfo(String id, String pw, String apw, String name, String birth, String gender,String pnumber) {
		this.id = id;
		this.pw = pw;
		this.apw = apw;
		this.name = name;
		this.birth = birth;
		this.gender = gender;
		this.pnumber= pnumber;
	}
	public String getid() {return id; }
	public String getpw() {return pw;}
	public String getapw() {return apw;} 
	public String getname() {return name;}
	public String getbirth() {return birth;}
	public String gender() {return gender;}
	public String pnumber() {return pnumber;}
}

