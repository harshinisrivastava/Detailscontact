package contact;
import java.util.*;
public class PhoneList {
		public static void main(String[] args) throws Exception {
			ServiceFile service = new ServiceFile();
			@SuppressWarnings("resource")
			Scanner value = new Scanner(System.in);
			try {
			 do {
				System.out.println("1.Add Contact \n2.Delete Contact \n3.Replace \n4.Search \n5.Sort \n6.favourite");
				int choose = value.nextInt();
				switch (choose) {
				case 1:
					service.addContact();
					 break; 
				case 2:
					service.deleteContact();
					 break; 
				case 3:
					service.replace();
					 break;
				case 4:
					System.out.println("Searching enter phone  no");
					String number = value.next();
					System.out.println(service.search(number));
					break;
				case 5:
					service.sortData();
					 break;
				case 6:
					service.favourite();
				     break; 
				default:
					System.out.println("Wrong option");
					System.exit(0);
				}
			 } while(true);
			}catch(Exception e) {
				System.out.println("Chosse correct option and run");
				}
			}
	}
