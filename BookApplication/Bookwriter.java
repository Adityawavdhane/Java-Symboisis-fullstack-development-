package BookApplication;

public class Bookwriter implements Runnable{
	Book book;
	public Bookwriter(Book book) {
		super();
		this.book=book;

	}
	public void run() {
		synchronized(book) {
			System.out.println("Writew")
		}
	}

}
