package javaBasic;

public class checkDataType {

	public static void main(String[] args) {
		char ch = '1';	// char형 변수 선언
		
		Typetester test = new Typetester(); // 객체 생성
		
		test.printType(ch);
	}

}

class Typetester {
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
