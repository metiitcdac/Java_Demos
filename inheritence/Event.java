package inheritence;

import java.util.Scanner;

public class Event {
	static int id;
	static {
		id = 1000;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size : ");
		int size = sc.nextInt();
		Person[] persons = new Person[size];
		int count = 0;
		boolean exit = true;
		while (exit) {
			System.out.println(
					"******* Welcome to XYZ Event *******\n1.Register Student. \n2.Register Teacher. \n3.Get all participants. \n4.Search Partcipent.\n0.Exit");
			int choice = sc.nextInt();
			switch (choice) {
			case 1: {
				if (count < size) {
					System.out.println("Enter first name:");
					String fName = sc.next();
					System.out.println("Enter last name:");
					String lName = sc.next();
					System.out.println("Enter college name:");
					String cName = sc.next();
					System.out.println("Enter roll Number:");
					int roll = sc.nextInt();
					System.out.println("Enter marks:");
					int marks = sc.nextInt();
					System.out.println("Enter course name:");
					String course = sc.next();
					int seatNo = id++;
					persons[count++] = new Student(fName, lName, cName, seatNo, roll, marks, course);
//				count++;
				} else {
					System.out.println("Event is full!!!!");
				}
				break;
			}
			case 2: {
				if (count < size) {
					System.out.println("Enter first name:");
					String fName = sc.next();
					System.out.println("Enter last name:");
					String lName = sc.next();
					System.out.println("Enter college name:");
					String cName = sc.next();
					System.out.println("Enter Empl id:");
					int empId = sc.nextInt();
					System.out.println("Enter Subject:");
					String sub = sc.next();
					System.out.println("Enter sal:");
					int sal = sc.nextInt();
					int seatNo = id++;
					persons[count++] = new Teacher(fName, lName, cName, seatNo, empId, sub, sal);
				} else {
					System.out.println("Event is full!!!!");
				}
				break;
			}
			case 3: {
				System.out.println("======= Students ==========");
				for (Person p : persons) {
					if (p instanceof Student) {
						System.out.println(p);
					}
				}
				System.out.println("======= Teacher ==========");
				for (Person p : persons) {
					if (p instanceof Teacher) {
						System.out.println(p);
					}
				}
				break;
			}
			case 4: {
				System.out.println("Enter seat Number: ");
				int seatNo = sc.nextInt();
				int flag = 0;
				for (int i = 0; i < persons.length; i++) {
						if (persons[i].seatNo == seatNo) {
							if(persons[i] instanceof Student) {
								((Student) persons[i]).toLearn();	
							}else {
								((Teacher) persons[i]).toTeach();
							}
						}
					else {
						flag = 1;
					}
				}
				if(flag == 1) {
					System.out.println("Not found");
				}
				break;
			}
			case 0: {
				System.out.println("Thank you!!!");
				exit = false;
				break;
			}

			default:
				System.out.println("Invalid choice!!! try again.");
				break;
			}
		}

	}

}

// Jack Patil MET 25 70 Dac
// Jill Mane VITA 45 80 Dbda

// Nilesh Kabra ACTS 501 Java 100000
// Nilesh Saheb MET 502 Kokani 500000
