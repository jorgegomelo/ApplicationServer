package ws;

import java.util.List;

import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebService;

import classes.Book;
import classes.Format;
import ejbs.MyEJBRemote;

@WebService
public class MyWebService {
	@EJB
	private MyEJBRemote myEJB;

	@WebMethod
	public List<Book> getBooks()	{
		return myEJB.getBooks();
	}

	@WebMethod
	public List<String> geTitles()
	{
		return myEJB.getTitles();
	}

	@WebMethod
	public Book getBookByTitle(String title)
	{
		return myEJB.getBookByTitle(title);
	}

	@WebMethod
	public List<String> getAuthors()
	{
		return myEJB.getAuthors();
	}

	@WebMethod
	public String getWeightByTitles(List<String> titles)
	{
		return myEJB.getWeightByTitles(titles);
	}

	@WebMethod
	public List<Format> getFormatsByTitles(String title){
		return myEJB.getFormatsByTitle(title);
	}
}
