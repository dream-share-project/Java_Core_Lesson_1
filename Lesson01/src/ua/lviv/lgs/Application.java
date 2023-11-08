package ua.lviv.lgs;

public class Application {

	public static void main(String[] args) {
		
		// Завдання 1:
		
		boolean a = true;
		char b = 6;
		byte c = 71;
		short d = 325;
		int e = 4981;
		long f = 147683;
		float g = 3.5F;
		double h = -5.165;
		String x = "Hello, World!";
		
		// Завдання 2:
		System.out.println("Завдання 2:");
		System.out.println("Byte MIN VALUE = " + Byte.MIN_VALUE);
		System.out.println("Byte MAX VALUE = " + Byte.MAX_VALUE);
		System.out.println();
		System.out.println("Short MIN VALUE = " + Short.MIN_VALUE);
		System.out.println("Short MAX VALUE = " + Short.MAX_VALUE);
		System.out.println();
		System.out.println("Integer MIN VALUE = " + Integer.MIN_VALUE);
		System.out.println("Integer MAX VALUE = " + Integer.MAX_VALUE);
		System.out.println();
		System.out.println("Long MIN VALUE = " + Long.MIN_VALUE);
		System.out.println("Long MAX VALUE = " + Long.MAX_VALUE);
		System.out.println();
		System.out.println("Float MIN VALUE = " + Float.MIN_VALUE);
		System.out.println("Float MAX VALUE = " + Float.MAX_VALUE);
		System.out.println();
		System.out.println("Double MIN VALUE = " + Double.MIN_VALUE);
		System.out.println("Double MAX VALUE = " + Double.MAX_VALUE);
		System.out.println();
		
		// Завдання 3:
		System.out.println("Завдання 3:");
		int [] array = {5, 2, 9, 1, 7, 3, 8, 10, 4, 6};
		
		int max = array[0];
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Максимальне значення в масиві: " + max);
        System.out.println("Мінімальне значення в масиві: " + min);
	}

}