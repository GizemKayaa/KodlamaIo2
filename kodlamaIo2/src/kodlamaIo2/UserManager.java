package kodlamaIo2;

public class UserManager {

	public void add(User user) {
		System.out.println(user.getFirstName() + " "+ user.getLastName() + " �ye olma i�leminiz ger�ekle�mi�tir.");
	}
	
	public void cancel(User user) {
		System.out.println(user.getFirstName() +" " + user.getLastName() + " �yelik iptal i�leminiz ger�ekle�mi�tir");
	}
}
