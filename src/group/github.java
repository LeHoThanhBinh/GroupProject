package group;

import java.util.Scanner;

public class github {
 
	
		public static void main(String[] args) {
	        int aNumber, bNumber;
	        char kt;
	        Scanner scanner = new Scanner(System.in);
	     
	        System.out.println("Nhap so thu nhat: ");
	        aNumber = scanner.nextInt();
	        System.out.println("Nhap so thu hai: ");
	        bNumber = scanner.nextInt();
	        System.out.println("Nhap phep toan (+, -, *, /): ");
	        kt = scanner.next().charAt(0);
	         
	        switch (kt) {
	        case '+':
	            System.out.println(aNumber + " + " + bNumber + " = " + (aNumber + bNumber));
	            break;
	        case '-':
	            System.out.println(aNumber + " - " + bNumber + " = " + (aNumber - bNumber));
	            break;
	        case '*':
	            System.out.println(aNumber + " * " + bNumber + " = " + (aNumber * bNumber));
	            break;
	        case '/':
	            if (bNumber == 0) {
	                System.out.println("So bi chia phai khac 0.");
	            } else {
	                
	                System.out.println(aNumber + " / " + bNumber + " = " + (float) aNumber / bNumber);
	            }
	            break;
	        default:
	            System.out.println("Error!.");
	        }
	    }
	 
	}


