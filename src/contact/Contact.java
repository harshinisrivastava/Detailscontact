package contact;

public class Contact {
		private String firstName;
		private String lastName;
		private String mobileNumber;
		private String homeNumber;
		private String emailId;
		private boolean favourite;

		public Contact() {
			
		}

		public Contact(String firstName, String lastName, String mobileNumber, String homeNumber, String emailId,
				boolean favourite)throws CustomerException {
			this.firstName = firstName;
			this.lastName = lastName;
			this.mobileNumber = mobileNumber;
			this.homeNumber = homeNumber;
			this.emailId = emailId;
			this.favourite = favourite;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getMobileNumber() {
			return mobileNumber;
		}

		public void setMobileNumber(String mobileNumber) {
			this.mobileNumber = mobileNumber;
		}

		public String getHomeNumber() {
			return homeNumber;
		}

		public void setHomeNumber(String homeNumber) {
			this.homeNumber = homeNumber;
		}

		public String getEmailId() {
			return emailId;
		}

		public void setEmailId(String emailId) {
			this.emailId = emailId;
		}

		public boolean isFavourite() {
			return favourite;
		}

		public void setFavourite(boolean favourite) {
			this.favourite = favourite;
		}

		@Override
		public String toString() {
			return "[firstName=" + firstName + ", lastName=" + lastName + ", mobileNumber=" + mobileNumber + ", homeNumber="
					+ homeNumber + ", emailId=" + emailId + ", favourite=" + favourite + "]";
		}
	}
