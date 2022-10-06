package java001_basic;

/*
 * Ctrl + SpaceBar  : 자동완성
 * Ctrl + / : 한 라인 주석 설정 및 해제
 * Ctrl + Shift + / : 여러 라인 주석 설정
 * Ctrl + Shift + \ : 여러 라인 주석 해제
 * Ctrl + Shift + F : 자동정렬  ( Window -Preferences - General - Keys - Ctrl+Shift+F을 Ctrl+f로 변경)
 * 
 */
public class Java004_casting {

	public static void main(String[] args) {		
		byte bNum = 2;
		short sNum = 4;
		int xNum = 5;
		long lNum = 6L; //L  or l
		float fNum = 2.5F;  // F or f
		double dNum = 7.4;
		char cData = 'a';
		boolean eNum = true; //true or false
		
		System.out.println(lNum);
		System.out.println(fNum);	
		
		//형변환(casting)
		//묵시적 형변환 :  작은 데이터 타입을 큰 데이터 타입으로 변환할때 발생
		//명시적 형변환 :  큰 데이터 타입을 작은 데이터 타입으로 변환할때 발생
		long gNum = 6;  // 묵시적 형변환 : int => long
		System.out.println(gNum);
		
		float tNum =(float)2.5;  // 명시적 형변환 : double => float
		System.out.println(tNum);		
 		
		
		//데이터 손실이 발생되는 경우
		byte data = (byte)128;
		System.out.println(data);  //-128
		
	} //end main()

}//end class




