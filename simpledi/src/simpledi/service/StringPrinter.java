package simpledi.service;

public class StringPrinter implements Printer {

	private StringBuilder sb = new StringBuilder();
	
	
	@Override
	public void print(String messge) {
		this.sb.append(messge);
	}

	@Override
	public String toString() {
		return this.sb.toString();
	}
	
	
}
