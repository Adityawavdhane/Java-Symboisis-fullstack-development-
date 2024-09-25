package BookApplication;

public class Book {
String title;
boolean isComplete;
public Book(String title, boolean isComplete) {
	super();
	this.title = title;
	this.isComplete = isComplete;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public boolean isComplete() {
	return isComplete;
}
public void setComplete(boolean isComplete) {
	this.isComplete = isComplete;
}

}
class BookReader implements Runnable{
	Book book;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}

}
