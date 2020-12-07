package ejbs;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import classes.Book;
import classes.Format;


/**
 * Session Bean implementation class MyEJB
 */
@Stateless
@LocalBean
public class MyEJB implements MyEJBRemote {

	@PersistenceContext(name = "TestPersistence")
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	public List<Book> getBooks() {
		String jpql = "SELECT b FROM Book b";
		Query typedQuery = em.createQuery(jpql);
		List<Book> mylist = typedQuery.getResultList();
		return mylist;
	}
	@SuppressWarnings("unchecked")
	public List<String> getTitles() {
		String jpql = "SELECT b.title FROM Book b";
		Query typedQuery = em.createQuery(jpql);
		List<String> mylist = typedQuery.getResultList();
		return mylist;
	}
	public Book getBookByTitle(String title) {
		String jpql = "SELECT b FROM Book b WHERE lower(title)='" + title.toLowerCase() + "'";
		Query typedQuery = em.createQuery(jpql);
		Book book = (Book) typedQuery.getSingleResult();
		return book;
	}
	@SuppressWarnings("unchecked")
	public List<String> getAuthors(){
		String jpql = "SELECT b FROM Book b";
		Query typedQuery = em.createQuery(jpql);
		List<Book> books = typedQuery.getResultList();
		
		List<String> authors = new ArrayList<String>();
		for (Book book:books)
			authors.addAll(book.getAuthor());
		
		List<String> distinctAuthors = authors.stream().distinct().collect(Collectors.toList());
		return distinctAuthors;
	}
	@SuppressWarnings("unchecked")
	public String getWeightByTitles(List<String> titles) {
		String jpql = "SELECT b FROM Book b";
		Query typedQuery = em.createQuery(jpql);
		List<Book> books = typedQuery.getResultList();
		
		List<BigDecimal> weights = new ArrayList<BigDecimal>();
		for (Book book:books) {
			
			for (String title: titles) {
				
				if (book.getTitle().toLowerCase().equals(title.toLowerCase())) {
					
					for (Format format:book.getFormat())
						weights.add(format.getWeight());
				}
			}
		}
		BigDecimal totalWeight = weights.stream().reduce(BigDecimal.ZERO, BigDecimal::add);
		return totalWeight.toString();
	}
	@SuppressWarnings("unchecked")
	public List<Format> getFormatsByTitle(String title) {
		String jpql = "SELECT b FROM Book b";
		Query typedQuery = em.createQuery(jpql);
		List<Book> books = typedQuery.getResultList();
		
		List<Format> formats = new ArrayList<Format>();
		
		for (Book book:books) {
			
			if (book.getTitle().toLowerCase().equals(title.toLowerCase())) {
				
				for (Format format:book.getFormat())
					
					formats.add(format);
			}
		}
		return formats;
	}

}
