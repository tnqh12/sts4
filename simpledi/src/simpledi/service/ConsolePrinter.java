package simpledi.service;

public class ConsolePrinter implements Printer {

	@Override
	public void print(String messge) {
		System.out.println(messge);
	}

}
