package login;

import java.util.Scanner;

public class MemberManage {

	public static void main(String[] args) {
		MemberHandler handler = new MemberHandler(100);
		
		while (true) {
			System.out.println("-------�޴� ����------");
			System.out.println("1. ȸ������");
			System.out.println("2. �α���");
			System.out.println("9. ���α׷� ����");
			
			Scanner s = new Scanner(System.in);
			int choice = s.nextInt();
			
			switch(choice) {
			case 1 :
				handler.memberInsert();break;
			case 2 :
				handler.memberInsert();break;
			case 9 :
				System.out.println("���α׷� ����");
				return;
			}
		}
	}

}
