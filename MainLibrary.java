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

public class MainLibrary{

//introduction to program
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("*****************Welcome to RentARead!*************");
	System.out.println("                        Please Select From the Following Options:          ");
	System.out.println("***********************************************************");
	books ob = new books();
	CustomerAccount obCustomer = new CustomerAccount();
	int choice; 
	int searchChoice;}

//main menu display
public void displayMenu(){
		System.out.println("---------------------------------------------------------------------------------------------");
		System.out.println("Enter 0 to Exit.");
		System.out.println("Enter 1 to Add a Book.");
		System.out.println("Enter 2 to Upgrade Quantity of a Book.");
		System.out.println("Enter 3 to Search for a Book.");
		System.out.println("Enter 4 to Show Inventory.");
		System.out.println("Enter 5 to Create Account.");
		System.out.println("Enter 6 to Show all Accounts.");
		System.out.println("Enter 7 to Rent Book.");
		System.out.println("Enter 8 to Return Book.");
		System.out.println("---------------------------------------------------------------------------------------------");
	}
{
	
//options from menu
	do{
		ob.displayMenu();
		choice = input.nextInt();

		switch(choice){
			case 1:
				books b = new books();
				ob.addBook(b);
				break;

			case 2:
				ob.newBookQty();
				break;

			case 3:
				System.out.println("Enter 1 to search using Serial Number.");
				System.out.println("Enter 2 to search using Author’s Name.");
				searchChoice = input.nextInt();

				switch(searchChoice){
					case 1:
						ob.searchBySerNum();
						break;
					case2:
						ob.searchByAuthName();
	}
				break;
		case 4:
			ob.bookInventory();
			break;
		
		case 5:
			customer s = new customer();
			obCustomer.addCustomer(s);
			break;
	
		case 6:
			obCustomer.showAllCust();
			break;

		case 7:
			obCustomer.rentBook(ob);
			break;

		case 8:
			obCustomer.returnBook(ob);
			break;
		default:
			System.out.println("CHOICE MUST BE BETWEEN 0 AND 8.");
		while (choice != 0);
			 
		}
	}
