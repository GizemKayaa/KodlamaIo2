package kodlamaIo2;

public class UserManager {

	public void add(User user) {
		System.out.println(user.getFirstName() + " "+ user.getLastName() + " üye olma işleminiz gerçekleşmiştir.");
	}
	
	public void cancel(User user) {
		System.out.println(user.getFirstName() +" " + user.getLastName() + " üyelik iptal işleminiz gerçekleşmiştir");
	}
}
