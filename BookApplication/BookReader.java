package BookApplication;

public class BookReader {
Book book;

public BookReader(Book book) {
	this.book = book;
}
public void run() {
	synchronized(book) {
		System.out.println(Thread.currentThread());
		try {
			book.wait();
		}
		catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Book ")
	}
}

}
