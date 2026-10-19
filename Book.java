public class Book extends TrangibleAseet{
	private String isbn;
	public Book (String name , int price , String color ,String isb){
		super (name,price,color);
		this.isbn = isbn;
	}
	public String getibsn(){return this.isbn;}
}
