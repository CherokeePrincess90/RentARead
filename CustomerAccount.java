package library;

//import needed files
import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import javax.swing.*;
import java.io.*;
import java.net.*; 
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Window;	

//variables used
public class CustomerAccount {
String custName;
String accNum;
String username;
String password;


books rentedBooks[] = new books[4];
public int booksCount = 0;
Scanner input = new Scanner(System.in);

//create customer account
public CustomerAccount(){
	System.out.println("Enter Name: ");
	this.custName = input.nextLine();
	System.out.println("Enter Account Number: ");
	this.accNum = input.nextLine();
	System.out.println("Enter Username: ");
	this.username = input.nextLine();
	System.out.println("Enter Password: ");
	this.password = input.nextLine();
}

CustomerAccount theCustomers[] = new CustomerAccount [60];

//check for duplicate customer account
public static int count = 0;
public void addCust (CustomerAccount s){
	for (int i=0; i<count; i++){
		if(s.accNum.equalsIgnoreCase(theCustomers[i].accNum)){
			System.out.println("Customer with Account number " + s.accNum + "already exists.");
			return;
}
}

//set to 60 customers
	if (count<=60){
		theCustomers[count] = s;
		count++;
}
}

//show all customer accounts
public void showAllCust(){
	System.out.println("Customer Name\\t\\tAccount Number");
	for (int i=0; i<count; i++){
		System.out.println(theCustomers[i].custName + "\\t\\t" + theCustomers[i].accNum);
}
}

//search by account number
public int isCustomer(){
	System.out.println("Enter Account Number: ");
	String accNum = input.nextLine();
	for (int i=0; i<count; i++){
		if (theCustomers[i].accNum.equalsIgnoreCase(accNum)){
			return i;
}
}
	System.out.println("Customer has no account.");
	System.out.println("Create Account First.");
	return -1;
	}

//rent a book
public void rentBook (books book){
	int customerIndex =this.isCustomer();
	if (customerIndex!=-1){
		System.out.println("Renting");
		books.bookInventory();
		books b = book.rentBook();
		System.out.println("Renting");
		if (b!= null){
			if (theCustomers[customerIndex].booksCount<=4){
				System.out.println ("Adding book");
				theCustomers[customerIndex].rentedBooks.theCustomers[customerIndex].booksCount = b;
				theCustomers[customerIndex].booksCount++;
				return;
			}			
				else {
					System.out.println("Student cannot rent more than 4 books.");
					return;
	}
		}
			else {
			System.out.println("Book is not Available.");
			return;
			}
	}
		else {
			System.out.println("Book is not Available.");
			return;
		}
}

//return a book
public void returnBook(books book){
	int customerIndex = this.isCustomer();
	if (customerIndex!= -1){
		System.out.println("Serial No\\t\\t\\tBook Title\\t\\t\\tAuthor Name");
	}
	
		CustomerAccount s = theCustomers[customerIndex];
		for (int i=0; i<s.booksCount; i++){
			System.out.println(s.rentedBooks[i].serNum+ "\\t\\t\\t" + s.rentedBooks[i].bookName + "\t\t\t" + s.rentedBooks[i].authName);
}
		System.out.println("Enter the Serial Number of book being returned: ");
		int serNum = input.nextInt();
		for (int i=0; i<s.booksCount; i++){
			if (serNum == s.rentedBooks[i].serNum){
				books.returnBook(s.rentedBooks[i]);
				s.rentedBooks[i]=null;
				return;
}
}
		System.out.println("Enter the Serial Number of book being returned: "+serNum+ "not found.");
}		

private JLabel passwordTF;{		
//If username is empty
    if (username.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Please enter username! "); 
    } 
//If password is empty
    else if(password.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Please enter password!"); 
    }
    else {
        JOptionPane.showMessageDialog(null, "Invalid Username/Password! "); }
    }

public static void user_frame(String UID) {

//Creating Frame and button student
JFrame customerFrame = new JFrame("Customer Functions");
JButton view_books_btn = new JButton("View Books");
view_books_btn.setBackground(new Color(255,255,0));
view_books_btn.setForeground(Color.white);}

	 
public static void main(String[] args) {
	    	
	        login();
	    }
public static void login() {
//create buttons and text fields for menu
	        JFrame f=new JFrame("Login");
	        JLabel l1,l2;  
	        l1=new JLabel("Username");  
	        l1.setBounds(40,25, 100,40); 
	        l1.setSize(330, 180);
	        l2=new JLabel("Password");  
	        l2.setBounds(40,60, 100,40);    
	        l1.setLayout(new GridLayout(3, 2));
	        l1.setVisible(true);
	            
	        l1.setOpaque(true);
	        l1.setBackground(new Color(0,0,255));
	        l1.setForeground(Color.white);
            Color.white.brighter();

            l2.setOpaque(true);
            l2.setBackground(new Color(0,0,255));
            l2.setForeground(Color.white);
            Color.white.brighter();
	      
//Create textfield for username
	        JTextField usernameTF = new JTextField();
	        usernameTF.setBackground(new Color(51, 35, 85));
	        usernameTF.setForeground(Color.white);
	        Color.white.brighter();
	        usernameTF.setBounds(100, 15, 200, 30);
	        
//Create textfield for password
	            JPasswordField passwordTF = new JPasswordField();
	            passwordTF.setBackground(new Color(51, 35, 85));
	            passwordTF.setForeground(Color.white);
	            Color.white.brighter();
	            passwordTF.setBounds(100, 50, 200, 30);
		        
//Create buttons
	            JButton loginBtn = new JButton("Login");
	            loginBtn.setBackground(new Color(0,255,0));
	            Color.green.brighter();
	            loginBtn.setForeground(Color.white);
	            loginBtn.setBounds(140,100,90,35);
	            
	            JButton cancelBtn = new JButton("Cancel");
	            cancelBtn.setBackground(new Color(0,255,0));
	            Color.green.brighter();
	            cancelBtn.setForeground(Color.white);}
}