package BookApplication;

public class BookDriver {
	public static void main(String[]args) {
		Book b1=new Book("My Book on java");
		BookReader readerA=new BookReader(b1);
		BookReader readerB=new BookReader(b1);
		
		Thread threadA=new Thread(readerA,"Aditya");
		Thread threadB=new Thread(readerB,"Yugaj");
		
		Athread.start();
		Bthread.start();
		
		try {
			Thread   
		}
		
	
}
}
