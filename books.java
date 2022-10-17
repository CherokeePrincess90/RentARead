package library;
//import needed files
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.Color;	

public class books {
//variables used (integers and strings)
	public int serNum;
	public String bookName;
	public String authName;
	public int bookQty;
	public int bookQtyCopy;
	
public books (int no, String title, String author, int quantity) {
	serNum = no;
	bookName = title;
	authName = author; 
	bookQty = quantity;
	bookQtyCopy = bookQty;
}

//ask for user input to add book
public books () {
	System.out.println("Enter Serial Number of book: ");
	this.serNum = input.nextInt();
	System.out.println("Enter the Title of book: ");
	this.bookName = input.nextLine();
	System.out.println("Enter the Author’s Name: ");
	this.authName = input.nextLine();
	System.out.println("Enter the number of books: ");
	this.bookQty = input.nextInt();
	bookQtyCopy = this.bookQty;
}

//set limit for inventory to 100 books
static books theBooks[] = new books[100];
public static int count;
Scanner input = new Scanner(System.in);

//set up to check for duplicate enteries
public int compareBookObjects (books B1, books B2){
	if (B1.bookName.equalsIgnoreCase(B2.bookName)){
		System.out.println("Book with this name already exists.");
		return 0;
}
	if (B1.serNum==B2.serNum){
		System.out.println("Book with this Serial Number already exists.");
		return 0;
}
	return 1;
}
public void addBook(books b){
	if (find (b.bookName) != null){
		System.out.println("Book with this title already exists.");
	}
	if ((b.serNum)!=0){
		System.out.println("Book with this serial number already exists.");
}
	if (count<100){
		theBooks[count] = b;
		count++;
}
	else{
		System.out.println("Not enough space to add more books.");
}
}

//searching through inventory by serial number,author's name, and book title
private Object find(String bookName2) {
	// TODO Auto-generated method stub
	return null;
}
public void findByTitle(String title){
	System.out.println("\\t\\t\\t\\SEARCH BY TITLE\\n");

	int bookName;
	System.out.println("Enter the title of book: ");
	bookName = input.nextInt();
	int flag = 0;
	System.out.println("Ser.Num\\t\\tName\\t\\tAuthor\\t\\tAvailable Qty\\t\\tTotalQty ") ;

	for (int i=0; i<count; i++){
		if (theBooks[i].bookName.equalsIgnoreCase (title)){
			return;
}
}
	if (flag==0)
		System.out.println(" No book found that title: " + bookName);

}
public void searchBySerNum(){
	System.out.println("\\t\\t\\t\\SEARCH BY SERIAL NUMBER\\n");

	int serNum;
	System.out.println("Enter the Serial Number of book: ");
	serNum = input.nextInt();
	int flag = 0;
	System.out.println("Ser.Num\\t\\tName\\t\\tAuthor\\t\\tAvailable Qty\\t\\tTotalQty ") ;
	for (int i=0 ; i<count; i++){
		if (serNum == theBooks[i].serNum){
			System.out.println(theBooks[i].serNum + "\t\t" + theBooks[i].bookName + "\t\t" + theBooks[i].authName + "\t\t" + theBooks[i].bookQtyCopy + "\t\t"  + theBooks[i].bookQty);
		flag++;
		return;
}
}
	if (flag==0)
		System.out.println(" No book found with Serial Number: " + serNum);
}

public void searchByAuthName(){
	System.out.println("\\t\\t\\t\\tSEARCH BY AUTHOR’S NAME");
	input.nextLine();
	System.out.println("Enter Author’s Name: ");
	String authName = input.nextLine();
	int flag = 0;
	System.out.println("Ser.Num\\t\\tName\\t\\tAuthor\\t\\tAvailable Qty\\t\\tTotalQty ") ;
	for (int i=0 ; i<count; i++){
		if (authName.equalsIgnoreCase(theBooks[i].authName)){
			System.out.println(theBooks[i].serNum + "\t\t" + theBooks[i].bookName + "\t\t" + theBooks[i].authName + "\t\t" + theBooks[i].bookQtyCopy + "\t\t"  + theBooks[i].bookQty);
			flag++;
}
}
		if (flag==0)
			System.out.println(" No theBooks were found by Author: " + authName);
}

//show books available to rent in inventory
public static void bookInventory(){
	System.out.println("\\t\\t\\t\\tSHOWING ALL BOOKS\\n");
	System.out.println("Ser.Num\\t\\tName\\t\\tAuthor\\t\\tAvailable Qty\\t\\tTotalQty ") ;
	for  (int i=0 ; i<count; i++){
		System.out.println (theBooks[i].serNum + "\t\t" + theBooks[i].bookName + "\t\t" + theBooks[i].authName + "\t\t" + theBooks[i].bookQtyCopy + "\t\t" + theBooks[i].bookQty);
}
}

//upgrade quantity of books
public void newBookQty (){
	System.out.println("\\t\\t\\t\\tUPGRADE BOOK QUANTITY\\n ") ;
	System.out.println("Enter the Serial Number of book: ");
	int serNum = input.nextInt();
	for (int i=0; i<count; i++){
		if (serNum == theBooks[i].serNum){
			System.out.println("Enter number of books added: ");
			int addingQty = input.nextInt();
			theBooks[i].bookQty += addingQty;
			theBooks[i].bookQtyCopy += addingQty;
			return;
}
}
}

//check to see if book is available to rent
public int isAvailable (int serNum){
	for (int i=0 ; i<count; i++){
		if (serNum == theBooks[i].serNum){
			if (theBooks[i].bookQtyCopy > 0){
				System.out.println("Book is Available for Rent.");
				return i;
}
		System.out.println("Books is Unavailable.");
		return -1;
}
}
	System.out.println("No Book with Serial Number "+serNum+ "Available in Inventory.");
	return -1;
}

//rent book
public books rentBook(){
	System.out.println("Enter the Serial Number of the book to be rented: ");
	int serNum = input.nextInt();
	int bookIndex = isAvailable(serNum);
	if (bookIndex!=-1){
		return theBooks[bookIndex];
	}
	return null;
}

//return book
public static void returnBook (books b){
	for (int i=0; i<count; i++){
		if (b.equals(theBooks[i])){
			theBooks[i].bookQtyCopy++;
			return;
}
}
}

public void actionPerformed(ActionEvent e) {
	JFrame viewBooksUserFrame = new JFrame("Books Available");

//Creating Table for book data
    JTable book_list = new JTable();
    String[] bookColumnNames = {"Book ID", "Book ISBN", "Book Name", "Book Publisher", "Book Edition", "Book Genre", "Book price", "Book Pages"};
    book_list.setBackground(new Color(255,255,0));
    book_list.setForeground(Color.white);
    book_list.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
    book_list.setFillsViewportHeight(true);
    book_list.setFocusable(false);

//Creating scrollbars
    JScrollPane scrollBook = new JScrollPane(book_list);
    scrollBook.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
    scrollBook.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
    viewBooksUserFrame.add(scrollBook);
    viewBooksUserFrame.setSize(850, 450);
    viewBooksUserFrame.setVisible(true);

//Creating Button.
    JButton view_user_issued_books_btn = new JButton("Issued Books");
    view_user_issued_books_btn.setBackground(new Color(0,0,0));
    view_user_issued_books_btn.setForeground(Color.white);
}
}
