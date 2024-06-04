package L_Three;

class Document{
	void open() {}
}

class WordDocument extends Document{
	public void open() {
		System.out.println("Opening Word Document");
	}
}

class PDFDocument extends Document{
	public void open() {
		System.out.println("Opening PDF Document");
	}
}

class SpreadSheet extends Document{
	public void open() {
		System.out.println("Opening Spread Sheet Document");
	}
}

public class DocsDemo {

	public static void main(String[] args) {
		
		Document xyz = new WordDocument();
		xyz.open();
		
		Document abc = new PDFDocument();
		abc.open();
		
		Document mno = new SpreadSheet();
		mno.open();
		
	}

}
