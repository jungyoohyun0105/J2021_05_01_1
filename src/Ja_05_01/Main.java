package Ja_05_01;


import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("==프로그램 시작==");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("명령어)");
		String command =sc.nextLine();
		
		System.out.printf("입력된 명령어 : %s", command);
		
		System.out.println("명령어)");
		int num =sc.nextInt();
		
		System.out.printf("입력된 명령어 : %d\n", num);
		
		
		sc.close();
		
		System.out.println("==프로그램 끝==");
	}
}
