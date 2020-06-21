package contact;
import java.io.FileNotFoundException;
import java.util.*;
public class ServiceFile {

		Scanner value = new Scanner(System.in);
		private static List<Contact> list;
		Contact enter = new Contact();
		AdData valid = new AdData();


		ServiceFile() throws CustomerException {
	

			ServiceFile.list = new ArrayList<Contact>();
		
			Contact no1 = new Contact("veena", "reddy", "8787812345", "918888888", "veenareddy@gmail.com", true);
			Contact no2 = new Contact("sara", "sharma", "9777923456", "7354444444", "sarasharma@yahoo.com", false);
			Contact no3 = new Contact("arya", "rao", "6789034521", "8999356234", "arya.rao@gmail.com", true);
			list.add(no1);
			list.add(no2);
			list.add(no3);
		}

		void display() {
			try {
			for (Contact key : list) {
				System.out.println(key.toString());
			}
		
		} catch(Exception e)
		 {
			 System.out.println("exception occurs");
			 
		 }
		}

		void addContact() throws CustomerException {
		try {
			boolean val = true;
				while(val) {
			System.out.println("Enter First Name");
			String firstName = value.next();
			
			if (valid.isValid(firstName)) {
				enter.setFirstName(firstName);
				break;
			} else {
	            throw new CustomerException("invalid name"); 
				//System.out.println("Invalide Name");
				//val =true;
			}}
			while(val) {
			System.out.println("Enter Last Name");
			String lastName = value.next();
			if (valid.isValid(lastName)) {
			enter.setLastName(lastName);
			break;
			} else {
	            throw new CustomerException("invalid last name"); 

	            //System.out.println("Invalide Name");
				//val =true;
			}}
			while(val) {
				boolean same = false;			
				System.out.println("Enter Mobile Number");
				String mobileNumber = value.next();
				for(Iterator<Contact> itr = list.iterator();itr.hasNext();) { 
					  Contact key =itr.next(); 
					  if(key.getMobileNumber().equals(mobileNumber)) { 
						  System.out.println("Already exist:"); 
						  same =true;
						  }
					  }
					if (valid.isValidNo(mobileNumber)) { 
						if(same==false){
							enter.setMobileNumber(mobileNumber);
							break;
						  }else {
							val =true;
							System.out.println("invalid");
						  }
					}
				}
			System.out.println("Enter Home Number");
			String homeNumber = value.next();
			if (valid.isValid(homeNumber)) {
				enter.setHomeNumber(homeNumber);
			} else {
	            throw new CustomerException("invalid home no"); 

				//System.out.println("Invalide Home No");
				//enter.setHomeNumber(null);
			}
			System.out.println("Enter EmailId");
			String emailId = value.next();
			if (valid.isValid(emailId)) {
				enter.setEmailId(emailId);
			} else {
				
	            throw new CustomerException("invalid home no"); 

				//System.out.println("Invalid Email Id");
				//enter.setEmailId(null);
			}
			System.out.println("Favourites yes or no");
			String fav = value.next();
			if (fav.equals("yes")) {
				list.add(new Contact(enter.getFirstName(), enter.getLastName(), enter.getMobileNumber(),
						enter.getHomeNumber(), enter.getEmailId(), true));
			} else {
				list.add(new Contact(enter.getFirstName(), enter.getLastName(), enter.getMobileNumber(),
						enter.getHomeNumber(), enter.getEmailId(), false));
		
			}
			display();
			}

		 catch(Exception m){
			 System.out.println("Exception occured: "+m);}  
		}


		void deleteContact() {
			try {
			System.out.println("Enter the Delete Number");
			String num = value.next();
			
			boolean status = false;
			  for(Iterator<Contact> itr = list.iterator();itr.hasNext();) { 
				  Contact key =itr.next(); 
				  if(key.getMobileNumber().equals(num)) { 
					  itr.remove(); 
					  status =true; 
					  } 
				  }
			  if (status == false) {
				System.out.println("Invalid No");
			}
		}
		 catch(Exception m){
			 System.out.println("Exception occured: "+m);}  
		}
		
		void replace() throws CustomerException {
			try {	
				System.out.println("Enter the replace number");
				   String number = value.next();
				boolean status = false;
				for(Iterator<Contact> itr = list.iterator();itr.hasNext();) { 
					  Contact key =itr.next(); 
					  if(key.getMobileNumber().equals(number)) { 
						  itr.remove(); 
						  status =true; 
						  } 
					  }
				if (status == false) {
					System.out.println("no valid");
				}else {
					addContact();
				}

			} catch(Exception m){
					 System.out.println("Exception occured: "+m);}  
				}
		

		String search(String number) {
			try {
				boolean status = false;
				for (Contact key : list) {
					if (key.getMobileNumber().equals(number)) {
					status = true;
						return key.toString();
					}
				
				}	if (status == false) {
					return "invalid";
				}
			return null;
	}catch(Exception m){
		 System.out.println("Exception occured: "+m);
		 return number;}  
	}
		
		 
		void sortData() {
			try {
			Collections.sort(list, new Order());
			display();
		}
			 catch(Exception m){
				 System.out.println("Exception occured: "+m);}  
			}
		
		void favourite() {
			try {
			for(Contact key : list) {
 
			if(key.isFavourite()) {
					System.out.println(key.toString());
			}
		}
      }
			 catch(Exception m){  
			 System.out.println("Exception occured: "+m);}  
		}  
	

    
		catch(FileNotFoundException m)  
      {  
    System.out.println("ArrayIndexOutOfBounds Exception occurs");  
   }
}

      
  


 

	class Order implements Comparator<Contact> {

		public int compare(Contact o1, Contact o2) {
			if (o1.getFirstName().equals(o2.getFirstName())) {
				return o1.getLastName().compareTo(o2.getLastName());
			} else {
				return o1.getFirstName().compareTo(o2.getFirstName());
			}
		}
	}


