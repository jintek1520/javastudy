package com.naver;

public class Test {

	public void me05() {

	}
//	public void fibo() {
//	//	int[] arr = new int[];
//		
//	
//	
//	}

	public void me5() {
		int[][] arr = new int[3][];
		/// 0 : 1,2,3,4
		// 1 : 0, 2, 4
		// 2 : 1, 3, 5, 7, 9
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0; j<arr[i].length;j++) {
//				{
//					if(i==0) {
//						
//						
//					}
//				}
//			
//				
//			}
//		}

		arr[0] = new int[] { 1, 2, 3, 4 };
		arr[1] = new int[] { 5, 6, 7, 8 };
		arr[2] = new int[] { 1, 3, 5, 7, 9 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.println(arr[i][j]);
			}
		}

	}

	public void me4() {
		int[][] arr = new int[3][10];
		// 0: 0,1,2,3,4,5,6,7..9,10
		// 1: 0,2,4,6,8,10...,16,18
		// 2: 1,3,5,7,9,11..17,19

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i == 0) {

					arr[i][j] = i + 1;
				}

				else if (i == 1) {

					arr[i][j] = i * 2;

				} else {
					arr[i][j] = i * 2 + 1;
				}
			}
		}

	}

	public void me3() {
		// 3x3
		int[][] arr1 = { { 4, 1, 8 }, { 4, 1, 0 }, { 5, 7, 1 }

		};
		// 2x3
		String[][] arr2 = { { "good", "oh", "my" }, { "god", "thank", "you" },

		};
		// 5~0 이 순환되면서 ㅓ배열에 들어감
		// int형 3차원 arr3은 3x1x4크기이다.
		// 3x4x1은?
		int[][][] arr3 = { { { 5, 6, 7, 8 } },

				{ { 9, 0, 1, 2 } },

				{ { 3, 4, 5, 6 } } };
		/*
		 * arr3의 마지막 index의 요소값에 1번째 요소값을 출력하시오
		 */
		int[] sub2 = arr3[arr3.length - 1][0];

		System.out.println(sub2);

		// int 2차원 배열 arr4는 5x3크기를 갖는다.
		// 5x1 은?
		int[][] arr4 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 0, 1, 2 }, { 3, 4, 5 } };
		// arr4[2][1]의 요솟값을 100으로 수정하여라
		arr4[2][1] = 100;
		// arr4의 3번 째 요솟값의 모든 최종 요솟값을 구하라
		int[] sub1 = arr4[2];
		for (int i = 0; i < arr4.length; i++) {
			System.out.println(sub1[0]);
		}

	}

	public void me22() {
		int[][] arr = new int[5][4];
		// arr의 모든 요솟값을 출력
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			// 2.최종 요솟값
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
			// 3.arr 최종 요솟값의 인덱스가 2인 요솟값을출력
			// arr[0][2]
			System.out.println(arr[0][2]);
		}
		// 4.arr의 가장 큰 요솟값의 가장 작은 요솟값 100으로 설정하시오
		arr[arr.length - 1][0] = 100;
		// 5.arr의 가장 큰 인덱스의 요솟값을 가장 작은 인덱스의 요소값을 출력0
		System.out.println(arr[arr.length - 1][0]);
	}

	public void me21() {
		// 최종 요솟값의 자료형이 Dog인 2차원 배열 arr의 크기는 10이고,
		//// 그 안에 있는 배열의 크기 2이다.
		Dog[][] arr = new Dog[10][2];
		// Arr의 모든 요솟값(1.Dog 2. Dog[])을 출력하시오
		for (int i = 0; i < arr.length; i++) {
			Dog[] dogs = arr[i];
			System.out.println(dogs);

			// arr의 최종요솟값을 모두 출력하시오
			for (int j = 0; j < dogs.length; j++) {
				System.out.println(dogs[j]);//
			}

		}

	}

	public void me2() {
		// 2차원 배열 StringBuffer의 1차원 배열의 개수는 5이다
		// 그리고 그 안에 있는 1차원 배열의 크기는 3이다.
		StringBuffer[][] arr = new StringBuffer[5][3];
		System.out.println(arr.length);

		StringBuffer[] arr1 = arr[0];
		System.out.println(arr[0]);
		// arr[0].length
	}

	public void me1() {

		int[][] arr;

	}
}I