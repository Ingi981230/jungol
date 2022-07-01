package login;

import java.util.Scanner;

class MemberHandler {
	// 로그인과 회원가입을 할 수 있게 메소드들을 저장한다.
	private MemberInfo[] members;
	private int idx;

	public MemberHandler(int num) {
		members = new MemberInfo[num];
		idx = 0;
	}
	
	public void memberInsert() {// 회원가입용 메서드
		String id, pw, apw, name, birth, gender, pnumber;
		Scanner s = new Scanner(System.in);
		System.out.println("아이디: ");
		id = s.nextLine();
		if (!isUniquelID(id)) {// 아이디가 중복되었으면
			System.out.println("이미 사용중인 아이디 입니다.\n");
			return;
		}
		System.out.println("비번 :");
		pw = s.nextLine();
		System.out.println("비밀번호 확인 :");
		apw = s.nextLine();
		System.out.println("이름 : ");
		name = s.nextLine();
		System.out.println("생년월일 : ");
		birth = s.nextLine();
		System.out.println("성별 : ");
		gender = s.nextLine();
		System.out.println("전화번호 : ");
		pnumber = s.nextLine();

		members[idx] = new MemberInfo(id, pw, apw, name, birth, gender, pnumber);
		idx++;
		System.out.println("가입 완료!!! \n");
	}

	private boolean isUniquelID(String id) {//아이디 중복여부 리턴
		if(idx ==0) return true;
		
		for(int i =0; i<idx; i++) {
			if(members[i].getid().equals(id)) {
				return false;
			}
			
		}
		return true;
	}
	public void memberLoginEx() {
		Scanner s = new Scanner(System.in);
		System.out.println("아이디 : ");String id = s.nextLine();
		System.out.println("비밀번호 : ");String pw = s.nextLine();
		
		for(int i =0; i<idx; i++) {
			if(members[i].getid().equals(id)&& members[i].getpw().equals(pw)) {
				System.out.println("환영합니다");
				System.out.println("로그인에 성공했습니다");
				return;
			}else if(!members[i].getid().equals(id)) {
				System.out.println("존재하지 않는 아이디입니다. \n");
				return;
			}else if(members[i].getid().equals(id) && !members[i].getpw().equals(pw)) {
				System.out.println("비밀번호가 잘못되었습니다. \n");
				return;
			}
		}
	}
	public void memberLogin() {
		Scanner s = new Scanner(System.in);
		System.out.print("아이디 : ");String id = s.nextLine();
		System.out.print("비밀번호 : ");String pw = s.nextLine();
		String msg = "존재하지 않는 아이디입니다.";
		
		for(int i =0; i<idx; i++) {
			if(members[i].getid().equals(id)) {
				if(members[i].getpw().equals(pw)) {
					msg = "로그인 되었습니다";
				}else {
					msg = "비밀번호가 잘못되었습니다.";
				}
			}
		}
		System.out.println(msg);
	}
}


