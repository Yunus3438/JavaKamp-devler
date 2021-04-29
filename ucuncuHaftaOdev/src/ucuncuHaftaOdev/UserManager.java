package ucuncuHaftaOdev;

public class UserManager {

	public void add(User user) {
		System.out.println("Kullan�c� eklendi "+user.getName());
	}
	public void delete(User user) {
		System.out.println("Kullan�c� Silindi "+user.getName());
	}
	public void update(User user) {
		System.out.println("Kullan�c� G�ncellendi "+user.getName());
	}
	public void getAll() {
		System.out.println("Kullan�c�lar Listelendi");
	}
	public void getByID(int id) {
		System.out.println(id+"'li kullan�c� listelendi ");
	}
	public void login(User user) {
		System.out.println(user.getName()+" adli kullan�c� giri� yapt�...");
	}
	public void logout(User user) {
		System.out.println(user.getName()+" ��k�� Ba�ar�yla Yap�ld�   ");
	}
}
