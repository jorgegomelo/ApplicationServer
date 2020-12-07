package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Client {
	

	public static void main(String[] args) {
		boolean menu = true;
		ClientFunctions functions = new ClientFunctions();

		while(menu)
		{

		String option_menu   = "0";
		
		System.out.println("[1] -> Obtain all data about books.");
		System.out.println("[2] -> Obtain all author names.");
		System.out.println("[3] -> Obtain all book titles.");
		System.out.println("[4] -> Given a book title, obtain all its data.");
		System.out.println("[5] -> Given a set of book titles, obtain their total weight.");
		System.out.println("[6] -> Given a book title, obtain its available formats (e.g., paperback, CD-Audio).");
		System.out.println("[7] -> Given a particular author name, obtain her/his respective book titles(s).");
		System.out.println("[8] -> Given a publisher, obtain the average rating of all its books.");
		System.out.println("[9] -> Given a publisher name and a set of categories obtain its total number of books that are classified in at least one of the categories provided.");
		System.out.println("[10] -> Given a rating value V and a number of ratings M, obtain all books with an average rating V and with at least M ratings.");
		System.out.println("[11] -> Given a set of categories and an operator (�AND� or �OR�), obtain all books classified under the categories.");

		
		System.out.println("[12] -> Quit");
		
		Scanner sc = new Scanner(System.in);
		option_menu = sc.nextLine();
		
		
			if(option_menu.equals("1"))
			{
				//all books
				functions.bookListDisplay(functions.viewAllBooks());

			}
			else if (option_menu.equals("2"))
			{
				functions.authors();
			}
			else if (option_menu.equals("3"))
			{
				functions.titles();

			}
			else if (option_menu.equals("4")) {
				//Search by title
				System.out.println("Title: ");
				String title = sc.nextLine();

				functions.searchByTitle(title);

			}
			else if (option_menu.equals("5")) {
				//Get weights by a list of titles
				System.out.println("Titles separated by ',':");
				String response = sc.nextLine();
				List<String> titles = new ArrayList<String>(Arrays.asList(response.split(",")));
				
				functions.getWeightByTitles(titles);

			}
			else if (option_menu.equals("6"))
			{
				//Get format types for a book
				System.out.println("Book title: ");
				String title = sc.nextLine();
				
				
				functions.getFormatByTitle(title);
			}
			else if (option_menu.equals("7"))
			{
				System.out.println("Author name: ");
				String author = sc.nextLine();
				
				functions.titlesByAuthor(author);
				
			}

			else if (option_menu.equals("8"))
			{
				//Get average rating for a publisher
				System.out.println("Publisher: ");
				String publisher = sc.nextLine();
				functions.ratingAverageByPublisher(publisher);
			}
			else if(option_menu.equals("9"))
			{
				System.out.println("Publisher: ");
				String publisher = sc.nextLine();
				System.out.println("Categories separated by ',': ");
				String response = sc.nextLine();
				List<String> categories = new ArrayList<String>(Arrays.asList(response.split(",")));

				functions.booksByPubOrCat(publisher, categories);
			}
			else if (option_menu.equals("10"))
				{
				boolean action = true;
				while (action) {
					System.out.println("Rating: ");
					if (sc.hasNextDouble()) {
						double rating = sc.nextDouble();
						sc.nextLine();
						System.out.println("Number of Votes: ");
						if (sc.hasNextInt()) {
							int votes = sc.nextInt();
							functions.getRatAndVot(rating, votes);
							action = false;
						}
						else {
							sc.nextLine();
							System.out.println("Invalid input. Must be integer.");
						}
					
					}
					else {
						sc.nextLine();
						System.out.println("Invalid input. Must be double.");
					}
				
				
				}
			}
			else if (option_menu.equals("11"))
			{
				System.out.println("Categories separated by ',': ");
				String response = sc.nextLine();
				List<String> categories = new ArrayList<String>(Arrays.asList(response.split(",")));
				System.out.println("Operator (AND/OR): ");
				String op = sc.nextLine();
				
				functions.getBooksByCat(categories, op);
			}
			else if(option_menu.equals("12"))
			{
				break;
			}
			else
			{
				System.out.println("Invalid Option.");
			}
			sc.hasNext();
			
		}
		
		
	}

}