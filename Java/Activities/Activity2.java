package activities;

import java.util.Arrays;

public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbArr = {10, 77, 10, 54, -11, 10};
		System.out.println("Actual Array :" + Arrays.toString(numbArr));
		
		int searchNumb = 10;
		int sumNumb = 30;
		System.out.println("result :" + result(numbArr,searchNumb,sumNumb));
		
		
	}

	public static boolean result(int[] numbArr, int searchNumb, int sumNumb) {
		// TODO Auto-generated method stub
		int tempNumb = 0;
		for (int number : numbArr) {
			if (number == searchNumb) {
				tempNumb += searchNumb;
			}
			if (tempNumb > sumNumb) {
				break;
			}
		
		}
		return tempNumb == sumNumb;
	}


}