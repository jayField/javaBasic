package javaBasic;

import java.util.Scanner;

public class deleteOverlapString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);	// 사용자의 입력을 받을 Scanner 객체 생성
		String inputStr = sc.nextLine(); // 사용자가 입력한 문자열(한 문장)을 inputStr에 저장
		String result = ""; // 중복이 되지 않은 문자열을 저장할 문자열 생성
		
		for(int i = 0; i < inputStr.length(); i++) { // i가 0부터 사용자가 입력한 문자열의 길이만큼 반복문을 돌린다.
			if(!result.contains(String.valueOf(inputStr.charAt(i)))) {	// 사용자가 입력받은 문자열의 i번째 문자를 String으로 바꾸고 result에 이 문자가 포함되어 있지 않다면
				result += String.valueOf(inputStr.charAt(i));		// result에 계속 추가, 즉 중복되지 않으면 추가
			}
		}
		System.out.println(result);
	}
}
