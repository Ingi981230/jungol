package login;

import java.util.Scanner;

class MemberHandler {
	// �α��ΰ� ȸ�������� �� �� �ְ� �޼ҵ���� �����Ѵ�.
	private MemberInfo[] members;
	private int idx;

	public MemberHandler(int num) {
		members = new MemberInfo[num];
		idx = 0;
	}

	public void memberInsert() {// ȸ�����Կ� �޼���
		String id, pw, apw, name, birth, gender, pnumber;
		Scanner s = new Scanner(System.in);
		System.out.println("���̵�: ");
		id = s.nextLine();
		if (!isUniquelID(id)) {// ���̵� �ߺ��Ǿ�����
			System.out.println("�̹� ������� ���̵� �Դϴ�.\n");
			return;
		}
		System.out.println("��ȣ :");
		pw = s.nextLine();
		System.out.println("��й�ȣ Ȯ�� :");
		apw = s.nextLine();
		System.out.println("�̸� : ");
		name = s.nextLine();
		System.out.println("������� : ");
		birth = s.nextLine();
		System.out.println("���� : ");
		gender = s.nextLine();
		System.out.println("��ȭ��ȣ : ");
		pnumber = s.nextLine();

		members[idx] = new MemberInfo(id, pw, apw, name, birth, gender, pnumber);
		idx++;
		System.out.println("���� �Ϸ�!!! \n");
	}

	private boolean isUniquelID(String id) {//���̵� �ߺ����� ����
		if(idx ==0) return true;
		
		for(int i =0; i<idx; i++) {
			if(members[i].getid().equals(id)) {
				return false;
			}
			
		}
		return false;
	}
	


}
