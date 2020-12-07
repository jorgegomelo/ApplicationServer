package ejbs;

import java.util.List;

import javax.ejb.Remote;

import classes.Book;
import classes.Format;

@Remote
public interface MyEJBRemote {

	public List<Book> getBooks();
	public List<String> getTitles();
	public Book getBookByTitle(String title);
	public List<String> getAuthors();
	public String getWeightByTitles(List<String> titles);
	public List<Format> getFormatsByTitle(String title);
}
