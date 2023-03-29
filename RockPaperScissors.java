import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str[] = {"가위", "바위", "보"};
		
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		
		while(true) {
			System.out.print("가위 바위 보!>>");
			
			int randNum = (int)(Math.random() * 3);
			String userStr = scanner.next();
			
			if(userStr.equals("그만")) {
				System.out.println("프로그램을 종료합니다...");
				System.exit(0);
			}
			
			if(str[randNum].equals(userStr))
				System.out.println("사용자 = " + userStr + ", 컴퓨터 = " + str[randNum] + ", 비겼습니다.");
			
			if(str[randNum].equals("가위") && userStr.equals("바위"))
				System.out.println("사용자 = " + userStr + ", 컴퓨터 = " + str[randNum] + ", 사용자가 이겼습니다.");
			else if(str[randNum].equals("가위") && userStr.equals("보"))
				System.out.println("사용자 = " + userStr + ", 컴퓨터 = " + str[randNum] + ", 사용자가 졌습니다.");
			
			if(str[randNum].equals("바위") && userStr.equals("가위"))
				System.out.println("사용자 = " + userStr + ", 컴퓨터 = " + str[randNum] + ", 사용자가 졌습니다.");
			else if(str[randNum].equals("가위") && userStr.equals("보"))
				System.out.println("사용자 = " + userStr + ", 컴퓨터 = " + str[randNum] + ", 사용자가 이겼습니다.");
			
			if(str[randNum].equals("보") && userStr.equals("가위"))
				System.out.println("사용자 = " + userStr + ", 컴퓨터 = " + str[randNum] + ", 사용자가 이겼습니다.");
			else if(str[randNum].equals("보") && userStr.equals("바위"))
				System.out.println("사용자 = " + userStr + ", 컴퓨터 = " + str[randNum] + ", 사용자가 졌습니다.");
			
		}
	}
}
