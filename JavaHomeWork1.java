class JavaHomeWork1 {
    public static void main(String[] args) {
        printThreeWords();
		checkSumSign();
		printColor();
		compareNumbers();
	}
	
	static void printThreeWords() {
		System.out.println("Orange");
		System.out.println("Banana");
		System.out.println("Apple");
	}
	static void checkSumSign() {
		int a = 13;
		int b = 31;
		int c = (a + b);
		if (c >= 0) {
			System.out.println ("Сумма положительная");
		} else {
			System.out.println ("Сумма отрицательная");
		}
	}
	static void printColor() {
		int value = 101;
		if (value <= 0) {
			System.out.println ("Красный");
		} else if (value >= 1 && value <= 100){
			System.out.println ("Жёлтый");
		} else {
			System.out.println ("Зелёный");
		}
	}
	static void compareNumbers() {
		int a = 31;
		int b = 13;
		if (a >= b) {
			System.out.println ("a >= b");
		} else {
			System.out.println ("a < b");	
		}
	}
	
}
