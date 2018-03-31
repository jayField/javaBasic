package javaBasic;

public class convertCharIntoInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch = '1';	// char형 변수 선언
		int changeNum, changeNum2; // int형 변수 선언
		
		Typetestering test = new Typetestering(); // 객체 생성
		
		test.printType(ch);	// ch의 타입 출력
		changeNum = Character.getNumericValue(ch); // char를 int로 바꾸는 방법 첫 번째(있는 그대로 int출력)
		changeNum2 = (int)ch; // char를 int로 바꾸는 방법 두 번째(아스키코드 값으로 int출력)
		test.printType(changeNum);	// changeNum 타입 출력
		test.printType(changeNum2); // changeNum2 타입 출력
	}

}

class Typetestering {
    void printType(byte x) {
        System.out.println(x + " is an byte");
    }
    void printType(int x) {
        System.out.println(x + " is an int");
    }
    void printType(float x) {
        System.out.println(x + " is an float");
    }
    void printType(double x) {
        System.out.println(x + " is an double");
    }
    void printType(char x) {
        System.out.println(x + " is an char");
    }
}