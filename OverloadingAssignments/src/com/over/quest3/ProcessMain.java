package com.over.quest3;

public class ProcessMain {

	public static void main(String[] args) {
		Processor processor = new Processor();
		processor.calculate(100.0);
		processor.calculate(4, 6);
		processor.calculate(8.0, 2.0);
		processor.calculate(2, 4);
		processor.calculate(5);
	}

}
