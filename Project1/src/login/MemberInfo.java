package login;

class MemberInfo {
	//�Ѹ��� ȸ�� ������ �����ϱ����� Ŭ����. �⺻ ������ ���̵�, ���, ���Ȯ��, �̸�, �������, ����, �ڵ�����ȣ�� �����ϰ�
	//get, set�� �̿��Ͽ� ������ �������� �����ϰų� ������ ��
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

