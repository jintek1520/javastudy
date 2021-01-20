package com.naver;

public class Test {

	public void me5() {

		int i = 0;
		while (i < 10) {
			if (i != 0 && i % 5 == 0) {
				i++;

				continue;

			}
			System.out.println(i);

			i++;
		}
	}

	public void me4() {
		int i = 0;
		while (i < 10) {

			if (i != 0 && i % 5 == 0) {
				break;
			}
			System.out.println(i);
			i++;
		}
		System.out.println("me4() 끝");
	}

	public void gugudan() {
		int i = 1;
		while (i < 9) {
			dan(i);
			i++;
			System.out.println(i + "단 <<<<<<<<<<<<");

		}

	}

	public void dan(int dan) {
		int i = 1;
		while (i < 9) {
			i++;
			System.out.println(dan + "X" + i + "=" + (dan * i));
		}

	}

	public void me5_8() { // 0 3 6 9 12 15 18 21 ... 27336 배수 열 출력하기
		int i = 0;
		while (i < 27337) {

			System.out.println(i);
			i = i + 3;

		}

	}

	public void piboNa() {

		int a = 1;
		int b = -1;

		for (int i = 0; i < 18; i++) {
			int c = a + b; // 1 1 2 3 5 8
			System.out.println(c);
			a = b;
			b = c; // b=b+a

		}

	}

	public void prinStar(int n) {
		int i = 0; // i = 1
		while (i < n) {
			me31(i + 1); // me31(i)
			i++; //
		}
	}

	public void me31(int n) {

		int i = 0;
		while (i < n) {
			i = i + 1;
			System.out.print('*');

		}

	}

	public void me3() {
		int i = 0;
		while (i < 10) {
			System.out.print('*');
			i++;
		}
		System.out.println("||||||||||||||");
	}

	public void me21() {
		int i = 101;
		while (i >= 23) {
			i = i - 2; // i -= 2;
			System.out.println(i);

			i--;
		} // 99,97,95,93,91, ...21

	}

	public void me2() {
		// 0, 2, 4, 6, 8, 10 , . 46출력

//		 i =0;
//		
//		while(i<24) {
//			i= i*2;
//			System.out.println(a);
//			i++; 
//			// 0부터46까지의 짝수출력
//		}
		int i = 0;
		while (i < 47) {
			System.out.println(i);
			i = i + 1;
			i++;
		}

	}

	public void me11() {
		int i = 100;

		while (i >= 0) {

			System.out.println(i);
			i--;
		}

	}

	public void me1() {
		int i = 0;
		// 조건문 or 반복회전수
		while (i < 101) {
			System.out.println(i);
			i++;

		}
	}
}