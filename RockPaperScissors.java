import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str[] = {"����", "����", "��"};
		
		System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
		
		while(true) {
			System.out.print("���� ���� ��!>>");
			
			int randNum = (int)(Math.random() * 3);
			String userStr = scanner.next();
			
			if(userStr.equals("�׸�")) {
				System.out.println("���α׷��� �����մϴ�...");
				System.exit(0);
			}
			
			if(str[randNum].equals(userStr))
				System.out.println("����� = " + userStr + ", ��ǻ�� = " + str[randNum] + ", �����ϴ�.");
			
			if(str[randNum].equals("����") && userStr.equals("����"))
				System.out.println("����� = " + userStr + ", ��ǻ�� = " + str[randNum] + ", ����ڰ� �̰���ϴ�.");
			else if(str[randNum].equals("����") && userStr.equals("��"))
				System.out.println("����� = " + userStr + ", ��ǻ�� = " + str[randNum] + ", ����ڰ� �����ϴ�.");
			
			if(str[randNum].equals("����") && userStr.equals("����"))
				System.out.println("����� = " + userStr + ", ��ǻ�� = " + str[randNum] + ", ����ڰ� �����ϴ�.");
			else if(str[randNum].equals("����") && userStr.equals("��"))
				System.out.println("����� = " + userStr + ", ��ǻ�� = " + str[randNum] + ", ����ڰ� �̰���ϴ�.");
			
			if(str[randNum].equals("��") && userStr.equals("����"))
				System.out.println("����� = " + userStr + ", ��ǻ�� = " + str[randNum] + ", ����ڰ� �̰���ϴ�.");
			else if(str[randNum].equals("��") && userStr.equals("����"))
				System.out.println("����� = " + userStr + ", ��ǻ�� = " + str[randNum] + ", ����ڰ� �����ϴ�.");
			
		}
	}
}
