package Students;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class StudentMarksManagement {
	
	
	//initializing every value
	public static int finalRank = 0;
	public static String position;
    public static int i = 0;
    public static int j = 0;
    public static String[] s_name = new String[100];
    public static String[] s_id = new String[100];
    public static Integer[] prf_marks = new Integer[100];
    public static Integer[] dbm_marks = new Integer[100];
    public static Float[] average = new Float[100];
    public static Float[] rank = new Float[100];
    public static Float[] temp_average = new Float[100];
    public static Integer[] best_Dbm_marks = new Integer[100];
    public static Integer[] temp_Dbm_marks = new Integer[100];
    public static Integer[] best_prf_marks = new Integer[100];
    public static Integer[] temp_prf_marks = new Integer[100];
     

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    	for(int k =0; k<100; k++) {
    		prf_marks[k] = -1;
    		dbm_marks[k] = -1;
    		s_name[k] = "";
    		s_id[k] = "";
    		average[k] = (float) -1;
    		rank[k] = (float)-1;
    		temp_average[k] = (float)-1;
    		best_Dbm_marks[k] = -1;
    	}
        int choice;
        do {
        	System.out.println("----------------------------------------------------------------");
            System.out.println("|           WELCOME TO GDSE MARK MANAGEMENTT SYSTEM            |");
            System.out.println("----------------------------------------------------------------");
        	System.out.println("1. Add new student");
            System.out.println("2. Add new student with marks");
            System.out.println("3. Add marks");
            System.out.println("4. Update student details");
            System.out.println("5. Update Marks");
            System.out.println("6. Delete Student");
            System.out.println("7. Print Student Details");
            System.out.println("8. Print Student Ranks");
            System.out.println("9. Best in programming Fundementals");
            System.out.println("10. Best in Database Management");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addNewStudent();
                    break;
                case 2:
                	addNewStudentWithMarks();
                    break;
                case 3:
                    addMarks();
                    break;
                case 4:
                    updateDetails();
                    break;
                case 5:
                    updateMarks();
                    break;
                case 6:
                    deleteStudent();
                    break;
                case 7:
                	printStudentDetails();
                	break;
                case 8:
                	printRanks();
                	break;
                case 9:
                	bestOfPrf();
                	break;
                case 10:
                	bestOfDbm();
                	break;
                case 11:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 12);
    }


	public static void addNewStudent() {
		System.out.println("----------------------------------------------------------------");
        System.out.println("|                         Add new stuent                       |");
        System.out.println("----------------------------------------------------------------");
		
		boolean contain = true;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student ID: ");
        String id = scanner.nextLine();
        
        
        //checking for previous enter student id 
        for (int j = 0; j < i+1; j++) {  
        	if (s_id[j].equals(id)) {
        		System.out.println("The student ID already exsists");
        		contain = false;
        		break;
        		}
        	}
        
        // if not contain entered student id then get the name as well 
        if (contain) {
        	s_id[i] = id;
            System.out.print("Enter student name: ");
            String name = scanner.nextLine();
            s_name[i] = name;
            System.out.println("Student added successfully!");
            i++;
        }
        
        
        System.out.print("Do you want to add another student (Y/N)? ");
        String answer = scanner.next();
        if (answer.equals("Y")) {
            addNewStudent();
        } else {
            System.out.println("Going back to main menu...");
        }
        
    }

    public static void addNewStudentWithMarks() {
    	
    	
    	System.out.println("----------------------------------------------------------------");
        System.out.println("|                  Add ne student with marks                   |");
        System.out.println("----------------------------------------------------------------");
    	
    	
    	boolean contain = true;
    	Scanner scanner = new Scanner(System.in);
    	System.out.print("Enter student ID: ");
        String id = scanner.nextLine();
        
        
        //below lines are same like previous
        
        for (int j = 0; j < i+1; j++) {
        	if (s_id[j].equals(id)) {
        		System.out.println("The student ID already exsists");
        		contain = false;
        		break;
        		}
        	}
        
        if (contain) {
        	s_id[i] = id;
            System.out.print("Enter student name: ");
            String name = scanner.nextLine();
            s_name[i] = name; 
            
            
            
            //below two do- while loops getting integer numbers less than 100 & greater than 0
            int marks;
	        do {
	            System.out.print("\nProgramming Fundements Marks : ");
	            marks = scanner.nextInt();
	            if (marks < 0 || marks > 100 ) {
	                System.out.println("Invalid marks! Marks should be between 0-100.");
	            }
	            prf_marks[i] = marks;
	        } while (marks < 0 || marks > 100);
	        
	        do {
	            System.out.print("Database management system Marks : ");
	            marks = scanner.nextInt();
	            if (marks < 0 || marks > 100) {
	                System.out.println("Invalid marks! Marks should be between 0-100.");
	            }
	            dbm_marks[i] = marks;
	        } while (marks < 0 || marks > 100);
	        System.out.println("Marks added successfully!");
	        i++;
	        }
	        
        
        
	        System.out.print("Do you want to add another student with marks (Y/N)? ");
	        String answer = scanner.next();
	        if (answer.equals("Y")) {
	        	addNewStudentWithMarks();
	            } else {
	        	System.out.println("Going back to main menu...");
	        	}
	        }

    public static void addMarks() {
    	
    	System.out.println("----------------------------------------------------------------");
        System.out.println("|                         Add marks                            |");
        System.out.println("----------------------------------------------------------------");
    	
    	
    	boolean contain2 = false;
    	Scanner scanner = new Scanner(System.in);
    	System.out.print("Enter student ID: ");
        String id = scanner.nextLine();
        
        for (j = 0; j < i; j++) {
        	if (s_id[j].equals(id)) {
        		contain2 = true;
        		break;
        		}
        	}
        
        
        //Checking whether marks are entered previously 
        if (prf_marks[j] != -1) {
        	System.out.println("The student's marks have been alrady added."+"\n" + "If you want update the marks, please use [4] Update mark Option");
        }
        
        
        //if not entered previously now enter
        else if (contain2) {
            System.out.print("Student name:	 " + s_name[j] );
            
            int marks;
	        do {
	            System.out.print("\nProgramming Fundements Marks : ");
	            marks = scanner.nextInt();
	            if (marks < 0 || marks > 100 ) {
	                System.out.println("Invalid marks! Marks should be between 0-100.");
	            }
	            prf_marks[j] = marks;
	        } while (marks < 0 || marks > 100);
	        
	        do {
	            System.out.print("Database management system Marks : ");
	            marks = scanner.nextInt();
	            if (marks < 0 || marks > 100) {
	                System.out.println("Invalid marks! Marks should be between 0-100.");
	            }
	            dbm_marks[j] = marks;
	        } while (marks < 0 || marks > 100);
	        System.out.println("Marks added successfully!");
	        }
        else {
        	System.out.print("Invalid Student ID. ");
        }
        
	        System.out.print("Do you want to add marks for another student (Y/N)? ");
	        String answer = scanner.next();
	        if (answer.equals("Y")) {	        	
	        	addMarks();
	            } else {
	        	System.out.println("Going back to main menu...");
	        	}
	}
    
    public static void updateDetails() {
    	
    	System.out.println("----------------------------------------------------------------");
        System.out.println("|                   Update student Details                     |");
        System.out.println("----------------------------------------------------------------");
    	
    	
    	boolean contain = false;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student ID: ");
        String id = scanner.nextLine();
        
        for (int j = 0; j < i; j++) {
        	if (s_id[j].equals(id)) {
        		System.out.println("Student Name :"+ s_name[j]);
        		contain = true;
        		break;
        		}
        	}
        
        if (contain) {
        	s_id[i] = id;
            System.out.print("Enter the new student name: ");
            String name = scanner.nextLine();
            s_name[i] = name;
            System.out.println("Student details has been updated successfully!");
        }
        else {
        	System.out.print("Invalid student ID. ");
        }
        
        System.out.print("Do you want to update details for another student (Y/N)? ");
        String answer = scanner.next();
        if (answer.equals("Y")) {
        	updateDetails();
        } else {
            System.out.println("Going back to main menu...");
        }
    }

    public static void updateMarks() {
    	boolean contain = false;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student ID: ");
        String id = scanner.nextLine();
        
        for ( j = 0; j < i; j++) {
        	if (s_id[j].equals(id)) {
        		System.out.println("Student Name :"+ s_name[j]);
        		contain = true;
        		break;
        		}
        	}
        
        if (contain) {
        	
        	
        	// whether marks added previously  
        	if (dbm_marks[j].equals(-1)) {
        		System.out.println("This student's mark yet to be added. ");
        	}
        	
        	
        	// if marks are not added previously 
        	else {
        		System.out.println("Programming Fundemental Marks" + prf_marks[j]);
        		System.out.println("Database Management System Marks" + dbm_marks[j]);
        		int marks;
    	        do {
    	            System.out.print("\nProgramming Fundements Marks : ");
    	            marks = scanner.nextInt();
    	            if (marks < 0 || marks > 100 ) {
    	                System.out.println("Invalid marks! Marks should be between 0-100.");
    	            }
    	            prf_marks[j] = marks;
    	        } while (marks < 0 || marks > 100);
    	        
    	        do {
    	            System.out.print("Database management system Marks : ");
    	            marks = scanner.nextInt();
    	            if (marks < 0 || marks > 100) {
    	                System.out.println("Invalid marks! Marks should be between 0-100.");
    	            }
    	            dbm_marks[j] = marks;
    	        } while (marks < 0 || marks > 100);
        		System.out.println("Marks have been updated successfully!");
        		}
        	}
        else {
        	System.out.print("Invalid student ID. ");
        }
        
        System.out.print("Do you want to update marks for another student (Y/N)? ");
        String answer = scanner.next();
        if (answer.equals("Y")) {
        	updateMarks();
        } else {
            System.out.println("Going back to main menu...");
        }
    }

    public static void deleteStudent() {
    	
    	System.out.println("----------------------------------------------------------------");
        System.out.println("|                 Delete student from database                 |");
        System.out.println("----------------------------------------------------------------");
    	
    	boolean contain = true;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student ID: ");
        String id = scanner.nextLine();
        
        
        //making every array value to initial array value
        for ( j = 0; j < i; j++) {
        	if (s_id[j].equals(id)) {
        		s_id[j] = "";
        		s_name[j] = "";
        		prf_marks[j] = -1;
        		dbm_marks[j] = -1;
        		System.out.println("Student has been deleted successfully.");
        		contain = false;
        		break;
        		}
        	}
        
        if (contain) {
        	System.out.print("Invalid student ID. ");
        }
        
        System.out.print("Do you want to delete another student (Y/N)? ");
        String answer = scanner.next();
        if (answer.equals("Y")) {
            deleteStudent();
        } else {
            System.out.println("Going back to main menu...");
        }
        
    }

    public static float average(int n) {
    	//making average array
    	
    	for ( j = 0; j < i; j++) {
        	if (prf_marks[j] != -1 ) {
        		average[j] = (float)(prf_marks[j]+ dbm_marks[j])/2;
        		}
        	}
    	//returning average for given n number 
		return average[n] ;
    	}
    
    public static void rank(int n) {
    	
    	
    	
    	//Transmitting all average values for new array call rank
    	int k = 0; 
    	for ( j = 0; j < i; j++) {
        	if (average[j] !=(float)-1);
        		rank[k] = average[j];
        		k++;
        		}
    	
    	
    	// now sort the new rank array 
    	float temp=0;
		for(int k1 = 0; k1< i ; k1++) {
			for(int k2 = k1 + 1 ; k2 < i ; k2++) {
				if(rank[k1]<rank[k2]) {
					temp=rank[k1];
					rank[k1]=rank[k2];
					rank[k2]=temp;
					}
				}
			}
		
		// getting pistons with comparing the average and rank for given nth average value
		for (int k3 = 0; k3 < i+1 ; k3++) {
			if (rank[k3].equals(average(n))) {
			
				finalRank=k3;
				if (finalRank == 1) {
					position = "First" ;
					break;
				}
				else if(finalRank == 2){
					position = "second" ;
					break;
				}
				else if(finalRank == 3) {
					position = "third";
					break;
				}
				else if(rank[k3+1] == (float)-1) {
					position = "last";
					break;
				}
			}
		}
		
    }
    
    public static void printStudentDetails() {
    	
    	System.out.println("----------------------------------------------------------------");
        System.out.println("|                    Print student details                     |");
        System.out.println("----------------------------------------------------------------");
    	
    	//getting id for details need to be print 
    	boolean contain = false;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student ID: ");
        String id = scanner.nextLine();
        
        for ( j = 0; j < i; j++) {
        	if (s_id[j].equals(id)) {
        		System.out.println("Student Name :"+ s_name[j]);
        		contain = true;
        		break;
        		}
        	}
        
        
        if (contain) {
        	if (dbm_marks[j].equals(-1)) {
        		System.out.println("This student's mark yet to be added. ");
        	}
        	else {
        		 System.out.println("+------------------------------------------+---------------+");
        	        System.out.printf("| %-40s | %12d  | %n", "Programming fundamental marks", prf_marks[j]);
        	        System.out.printf("| %-40s | %12d  | %n", "Database management system marks", dbm_marks[j]);
        	        System.out.printf("| %-40s | %12d  | %n", "Total marks", prf_marks[j] + dbm_marks[j]);
        	        System.out.printf("| %-40s | %12d  | %n", "Programming fundamental marks", prf_marks[j]);
        	        System.out.printf("| %-40s | %12.2f  | %n", "Avg. marks", (average(j)));
        		
        	        rank(j);
        	        System.out.printf("| %-40s | %4d(%6s)  | %n", "Rank", finalRank, position);
        	        System.out.println("+------------------------------------------+---------------+");
        		}
        	}
        else {
        	System.out.print("Invalid student ID. ");
        }
        
        System.out.print("Do you want to print this again(Y/N)? ");
        String answer = scanner.next();
        if (answer.equals("Y")) {
        	printStudentDetails();
        } else {
            System.out.println("Going back to main menu...");
        }
    }
    
    public static void printRanks() {
    	
    	System.out.println("----------------------------------------------------------------");
        System.out.println("|                      Print Students' Rank                    |");
        System.out.println("----------------------------------------------------------------");
		
    	
    	
    	rank(i); //calling for rank method
    	rank(i);// calling for rank method
    	
    	
    	for(int l = 0 ; l < i; l++ ) {
			temp_average[l] = average[l];
		}
		
    	//making table 
    	
    	System.out.println("+-------+------------+-------------+-------------+------------+");
        System.out.printf("| %-5s | %-10s | %-12s| %10s | %10s |%n","Rank","ID","Name","Total marks","Avg. marks");
    	System.out.println("+-------+------------+-------------+------------+------------+");
		for (int l = 0 ; l < i; l++  ) {
			for (int l1 = 0 ; l1 < i+1; l1++ ) {
				if (rank[l1].equals((float)-1)){
					break;
				}
				if (rank[l].equals(temp_average[l1]) ) {
					temp_average[l1] =(float) -1;
					
			        System.out.printf("| %-5d | %-10s | %-12s| %10d | %10.2f |%n",(l+1), s_id[l1],s_name[l1],(prf_marks[l1]+dbm_marks[l1]),average[l1]);
			        
					break;
				}
			} 
		}
		System.out.println("+-------+------------+-------------+------------+------------+");
    
		System.out.print("Do you want to print this again(Y/N)? ");
        String answer = scanner.next();
        if (answer.equals("Y")) {
        	printStudentDetails();
        } else {
            System.out.println("Going back to main menu...");
        }
    }
    
    	
    public static void bestOfDbm() {
    	
    	
    	System.out.println("----------------------------------------------------------------");
        System.out.println("|             Best In DataBase management System               |");
        System.out.println("----------------------------------------------------------------");
		
    	
        	
        	int k = 0 ; 
        	for ( j = 0; j < i; j++) {
            	if (dbm_marks[j] != -1) {
					best_Dbm_marks[k] = dbm_marks[j];
            		k++;
            		}
        	}
        	int temp=0;
    		for(int k1 = 0; k1< i ; k1++) {
    			for(int k2 = k1 + 1 ; k2 < i ; k2++) {
    				if(best_Dbm_marks[k1]<best_Dbm_marks[k2]) {
    					temp=best_Dbm_marks[k1];
    					best_Dbm_marks[k1] = best_Dbm_marks[k2];
    					best_Dbm_marks[k2] = temp;
    					}
    				}
    			}
    	
    	
    	
    	for ( j = 0; j < i; j++) {
    		temp_Dbm_marks[j] = dbm_marks[j];
    		}
    	
    	System.out.println("+-------------+------------+------------+------------+");
        System.out.printf("| %-10s | %-12s| %10s | %10s |%n","ID","Name","DBM marks","PRF marks");
        System.out.println("+-------------+------------+------------+------------+");
        
    	
    	for (int l = 0 ; l < i; l++  ) {
			for (int l1 = 0 ; l1 < i+1; l1++ ) {
				if (best_Dbm_marks[l1].equals(-1)){
					break;
				}
				if (best_Dbm_marks[l].equals(temp_Dbm_marks[l1]) ) {
					temp_Dbm_marks[l1] = -1;
					System.out.printf("| %-10s | %-11s | %-10d | %-10d |%n",s_id[l1],s_name[l1],dbm_marks[l1],prf_marks[l1]);
					break;
				}
			} 
		}
    	System.out.println("+-------------+------------+------------+------------+");
    	System.out.print("Do you want to print this again(Y/N)? ");
        String answer = scanner.next();
        if (answer.equals("Y")) {
        	printStudentDetails();
        } else {
            System.out.println("Going back to main menu...");
        }
    	
    }
    
    public static void bestOfPrf() {
    	
    	System.out.println("----------------------------------------------------------------");
        System.out.println("|              Best In Programming Fundementals                |");
        System.out.println("----------------------------------------------------------------");
    	
    	
    	int k = 0 ; 
    	for ( j = 0; j < i; j++) {
        	if (prf_marks[j] != -1)
				best_prf_marks[k] = prf_marks[j];
        		k++;
        		}
    	System.out.println("+-------------+------------+------------+------------+");
        System.out.printf("| %-10s | %-12s| %10s | %10s |%n","ID","Name","PRF marks","DBM marks");
        System.out.println("+-------------+------------+------------+------------+");
    	int temp=0;
		for(int k1 = 0; k1< i ; k1++) {
			for(int k2 = k1 + 1 ; k2 < i ; k2++) {
				if(best_prf_marks[k1]<best_prf_marks[k2]) {
					temp=best_prf_marks[k1];
					best_prf_marks[k1] = best_prf_marks[k2];
					best_prf_marks[k2] = temp;
					}
				}
			}

	
	
	for ( j = 0; j < i; j++) {
		temp_prf_marks[j] = prf_marks[j];
		}
	
	for (int l = 0 ; l < i; l++  ) {
		for (int l1 = 0 ; l1 < i+1; l1++ ) {
			if (best_prf_marks[l1].equals(-1)){
				break;
			}
			if (best_prf_marks[l].equals(temp_prf_marks[l1]) ) {
				temp_prf_marks[l1] = -1;
				System.out.printf("| %-10s | %-11s | %-10d | %-10d |%n",s_id[l1],s_name[l1],prf_marks[l1],dbm_marks[l1]);
				break;
			}
		} 
	}
	
	System.out.println("+-------------+------------+------------+------------+");
	
	
	System.out.print("Do you want to print this again(Y/N)? ");
    String answer = scanner.next();
    if (answer.equals("Y")) {
    	printStudentDetails();
    } else {
        System.out.println("Going back to main menu...");
    }
    
    
    
    }
    
}
