package wsn;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import javax.jws.WebMethod;
import javax.jws.WebService;

import artifacts.Book;
import artifacts.MyWebService;
import artifacts.MyWebServiceService;

@WebService
public class MyNewWebService {
	private MyWebService MyWeb;
	
	@WebMethod
	public List<String> getBookTitlesByAuthor(String name) {
		this.MyWeb = new MyWebServiceService().getMyWebServicePort();
		List<Book> books = MyWeb.getBooks();
		List<String> titlesByAuthor = new ArrayList<String>();
		
		for (Book book:books) {
			for (String author: book.getAuthor()) {
				if (author.toLowerCase().equals(name.toLowerCase())) {
					titlesByAuthor.add(book.getTitle());
				}
			}
		}
		return titlesByAuthor;
		
	}
	
	@WebMethod
	public String getAvgRatingByPublisher(String publisher) {
		this.MyWeb = new MyWebServiceService().getMyWebServicePort();
		List<Book> books = MyWeb.getBooks();
		List<BigDecimal> ratings = new ArrayList<BigDecimal>();
		for (Book book:books) {
			if (book.getPublisher().toLowerCase().equals(publisher.toLowerCase())) {
				ratings.add(book.getRating());
			}
		}
		BigDecimal sum = ratings.parallelStream().map(Objects::requireNonNull).reduce(BigDecimal.ZERO, BigDecimal::add);
		return sum.divide(new BigDecimal(ratings.size()), RoundingMode.HALF_UP).toString();
	}
	
	@WebMethod
	public String getNumBooksByPublisherAndCategories(String publisher, List<String> categories) {
		this.MyWeb = new MyWebServiceService().getMyWebServicePort();
		List<Book> books = MyWeb.getBooks();
		List<String> titles = new ArrayList<String>();
		for(Book book:books) {
			if (book.getPublisher().toLowerCase().equals(publisher.toLowerCase())) {
				for (String category: book.getCategory()) {
					for (String trim: categories) {
						if (trim.toLowerCase().equals(category.toLowerCase())) {
							titles.add(book.getTitle());
						}
					}
				}
			}
		}
		List<String> distinctTitles = titles.stream().distinct().collect(Collectors.toList());
		return String.valueOf(distinctTitles.size());
	}
	
	@WebMethod
	public List<Book> getBooksByRatingAndNumRatings (double rating, int votes)
	{
		this.MyWeb = new MyWebServiceService().getMyWebServicePort();
		List<Book> books = MyWeb.getBooks();
		List<Book> output_books = new ArrayList<Book>();

		for (Book book : books) {
			if (book.getRating().doubleValue()==rating && book.getVotes().intValue()>=votes)
			   {
				output_books.add(book);
			}
		}
		return output_books;
	}
	
	@WebMethod
	public List<Book> getBookByCategory (List<String> categories, String op)
	{
		this.MyWeb = new MyWebServiceService().getMyWebServicePort();
		List<Book> books = MyWeb.getBooks();
		List<Book> output_books = new ArrayList<Book>();
		
		for (Book book : books) 
		{
			if (op.toUpperCase().equals("OR")) 
			{
				for (String book_category: book.getCategory()) 
				{
					for(String category: categories)
					{
						if (book_category.toLowerCase().equals(category.toLowerCase())) {
							output_books.add(book);
						}
					}
				}
			}
			
			else if (op.toUpperCase().equals("AND"))
			{
				int count = 0;
				for (String category: categories)
				{
					for (String book_category: book.getCategory()) {
						if (book_category.toLowerCase().equals(category.toLowerCase())) {
							count += 1;
						}
					}
					
				}
				if (count == categories.size()) {
					output_books.add(book);
				}
			}				
		}
		return output_books;
	}
	
}
