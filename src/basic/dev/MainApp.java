package basic.dev;

import java.util.Random;

public class MainApp {
	public static void main(String[] args) {
		int[] arr = new int[10];
		input(arr);
		print(arr);
		System.out.println();
		tong(arr);
		System.out.println();
		tongChanLe(arr);
		System.out.println();
		sapXep(arr);
		System.out.println();
		print(arr);
		demSoNguyenTo(arr);

	}

	static boolean isPrimary(int n) {
		if (n == 2)
			return true;
		for (int i = 2; i < n; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	private static void demSoNguyenTo(int[] arr) {
		System.out.println();
		int dem = 0;
		for (int i = 0; i < arr.length; i++) {
			if (isPrimary(arr[i]))
				dem++;
		}
		System.out.format("co %d so nguyen to", dem);
	}

	private static void sapXep(int[] arr) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
			System.out.print(arr[i] + " ");

		}

	}

	private static void tongChanLe(int[] arr) {
		int tongChan = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0)
				tongChan++;
		}
		System.out.format("co %d so chan, %d so le", tongChan, arr.length - tongChan).println();
	}

	private static void tong(int[] arr) {
		int tong = 0;
		for (int i = 0; i < arr.length; i++) {
			tong++;
		}
		System.out.format("co %d phan tu trong mang", tong);
		if (tong % 2 == 0) {
			System.out.format(" %d la so chan", tong);
		} else {
			System.out.format(" %d la so le", tong);
		}
	}

	private static void input(int[] arr) {
		// TODO Auto-generated method stub
		int min = 1;
		int max = 100;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = randomInteger(min, max);
		}
	}

	private static int randomInteger(int min, int max) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		return rand.nextInt(max + 1 - min) + min;
	}

	private static void print(int[] arr) {
		System.out.println("Mang arr");
		for (int i = 0; i < arr.length; i++) {
			System.out.format("%d", arr[i]).print("\t");
		}
	}

}
