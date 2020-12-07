package main;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import artifacts.Book;
import artifacts.Format;

import artifacts.MyWebService;
import artifacts.MyWebServiceService;

import artifacts_new.MyNewWebService;
import artifacts_new.MyNewWebServiceService;


public class ClientFunctions {
	
	MyWebServiceService wsbs = new MyWebServiceService();
	MyWebService wsb = wsbs.getMyWebServicePort();
	MyNewWebServiceService wsns = new MyNewWebServiceService();
	MyNewWebService wsn = wsns.getMyNewWebServicePort();
	
	public void bookListDisplay(List<Book> books)
	{
		for (Book book: books) 
		{
			System.out.println("\nTitle: " + book.getTitle());
			System.out.printf("Author(s): ");
			for (String author: book.getAuthor())
				System.out.printf(author + ", ");
			System.out.println("\nRating: " + book.getRating().toString());
			System.out.println("Votes: " + book.getVotes().toString());
			System.out.println("Publisher: " + book.getPublisher());
			System.out.printf("Categories: ");
			for (String category: book.getCategory())
				System.out.printf(category + ", ");
			

			System.out.println("\n\nFormats Available:");

			List<Format> formats = book.getFormat();
			System.out.println();

			for (Format format: formats) 
			{
				System.out.println("Type: " + format.getType());
				System.out.println("Dimensions: " + format.getDimensions());
				System.out.println("Language: " + format.getLanguage());
				System.out.println("Publication City: " + format.getPublicationCity());
				System.out.println("Publication Date: " + format.getPublicationDate());
				System.out.println("Pages: " + format.getPages());
				System.out.println("Price: " + format.getPrice());
				System.out.println("Weight: " + format.getWeight() + "\n");
			}
		}
		
		}	
	public void newBookListDisplay(List<artifacts_new.Book> books)
	{
		for (artifacts_new.Book book: books) 
		{
			System.out.println("Title: " + book.getTitle());
			System.out.printf("Author(s): ");
			for (String author: book.getAuthor())
				System.out.printf(author + ", ");
			System.out.println("\nRating: " + book.getRating().toString());
			System.out.println("Votes: " + book.getVotes().toString());
			System.out.println("Publisher: " + book.getPublisher());
			System.out.printf("Categories: ");
			for (String category: book.getCategory())
				System.out.printf(category + ", ");
			
			System.out.println();
			System.out.println("Formats Available:");

			List<artifacts_new.Format> formats = book.getFormat();
			System.out.println();

			for (artifacts_new.Format format: formats) 
			{
				System.out.println("Type: " + format.getType());
				System.out.println("Dimensions: " + format.getDimensions());
				System.out.println("Language: " + format.getLanguage());
				System.out.println("Publication City: " + format.getPublicationCity());
				System.out.println("Publication Date: " + format.getPublicationDate());
				System.out.println("Pages: " + format.getPages());
				System.out.println("Price: " + format.getPrice());
				System.out.println("Weight: " + format.getWeight() + "\n");
			}
		}
		
		}
		
	public void searchByTitle(String title)
	{
		List<Book> books = wsb.getBooks();
		List<Book> book = new ArrayList<Book>();
		boolean exists = false;
		
		for (Book trim:books) {
			if (trim.getTitle().toLowerCase().equals(title.toLowerCase())) {
				exists = true;
			}
		}
		if (exists) {
			book.add(wsb.getBookByTitle(title));
			bookListDisplay(book);
		}
		else {
			System.out.println("Unknown title.\n");
		}
		
	}
	public void getWeightByTitles(List<String> titles)
	{
		List<Book> books = wsb.getBooks();
		List<Book> book = new ArrayList<Book>();
		boolean exists = false;
		
		for (Book trim:books)
			for (String title:titles)
				if (trim.getTitle().toLowerCase().equals(title.toLowerCase())) {
					exists = true;
				}
			
		if (exists) {
			String weight = wsb.getWeightByTitles(titles);
			System.out.println("Weight of selected books: " + weight + "\n");
		}
		else {
			System.out.println("Unknown title(s).\n");
		}

	}

	public void getFormatByTitle(String input) {
		boolean exists = false;
		List<Book> books = wsb.getBooks();
		for (Book book: books)
			if (book.getTitle().toLowerCase().equals(input.toLowerCase()))
				exists = true;
		if (exists) {
			List<Format> formats = wsb.getFormatsByTitles(input);
			System.out.println("\nFormats Available:");

			System.out.println();

			for (Format format: formats) 
			{
				System.out.println("Type: " + format.getType());
				System.out.println("Dimensions: " + format.getDimensions());
				System.out.println("Language: " + format.getLanguage());
				System.out.println("Publication City: " + format.getPublicationCity());
				System.out.println("Publication Date: " + format.getPublicationDate());
				System.out.println("Pages: " + format.getPages());
				System.out.println("Price: " + format.getPrice());
				System.out.println("Weight: " + format.getWeight() + "\n");
			}
		}
		else {
			System.out.println("Unknown title.\n");
		}
	}
	public List<Book> viewAllBooks()
	{
		List<Book> books = wsb.getBooks();
		
		return books;
	}
	public void titles()
	{
		List<String> titles = wsb.geTitles();
		
		System.out.println("-----------Titles-----------\n");
		for (String title: titles)
		{
			System.out.println(title);
		}
		System.out.println();
	}
	public void authors()
	{
		List<String> authors = wsb.getAuthors();
		
		System.out.println("-----------Authors-----------\n");
		for (String author: authors)
		{
			System.out.println(author);
		}
		System.out.println();
	}
	
	public void titlesByAuthor(String author) {
		
		List<String> titles = wsn.getBookTitlesByAuthor(author);
		if (titles.size() > 0) {
			System.out.println("-----------Titles-----------\n");
			for (String title: titles)
			{
				System.out.println(title);
			}
			System.out.println();
		}
		else {
			System.out.println("Unknown author.");
			System.out.println();
		}

	}
	public void ratingAverageByPublisher(String publisher)
	{
		List<Book> books = wsb.getBooks();
		boolean exists = false;
		for (Book book:books)
			if (book.getPublisher().toLowerCase().equals(publisher.toLowerCase())){
				exists = true;
			}
		if (exists) {
			String rating = wsn.getAvgRatingByPublisher(publisher);
			System.out.println("The average rating for publisher " + publisher + " : " + rating + ".\n");
		}
		else {
			System.out.println("Unkown publisher.\n");
		}
		
	}
	public void booksByPubOrCat(String publisher, List<String> categories)
	{
		List<Book> books = wsb.getBooks();
		boolean exists = false;
		
		for (Book book:books) {
			if (book.getPublisher().toLowerCase().equals(publisher.toLowerCase())) {
				exists = true;
			}
		}
		
		if (exists) {
			String n_books = wsn.getNumBooksByPublisherAndCategories(publisher, categories);
			System.out.println("For publisher " + publisher + " and those categories there are " + n_books + " book(s).\n");
		}
		else {
			System.out.println("Unknouwn publisher.\n");
		}
		
		
	}
	public void getRatAndVot(double rating, int votes)
	{

		List<artifacts_new.Book> books = wsn.getBooksByRatingAndNumRatings(rating, votes);
		if (books.size()>0) {
			newBookListDisplay(books);
		}
		else {
			System.out.println("No matches.\n");
		}
	}
	
	public void getBooksByCat(List<String> categories, String op)
	{
		if (op.toUpperCase().equals("AND") || op.toUpperCase().equals("OR")) {
			List<artifacts_new.Book> books = wsn.getBookByCategory(categories, op);
			if (books.size() > 0)
				newBookListDisplay(books);
			else {
				System.out.println("No matches.\n");
			}
		}
		else {
			System.out.println("Unknown operator.\n");
		}

	}
	
		

}