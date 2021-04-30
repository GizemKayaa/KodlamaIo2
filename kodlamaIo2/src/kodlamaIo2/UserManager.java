package kodlamaIo2;

public class UserManager {

	public void add(User user) {
		System.out.println(user.getFirstName() + " "+ user.getLastName() + " üye olma iþleminiz gerçekleþmiþtir.");
	}
	
	public void cancel(User user) {
		System.out.println(user.getFirstName() +" " + user.getLastName() + " üyelik iptal iþleminiz gerçekleþmiþtir");
	}
}
