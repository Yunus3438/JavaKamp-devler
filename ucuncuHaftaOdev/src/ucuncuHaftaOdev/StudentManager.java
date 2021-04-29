package ucuncuHaftaOdev;

public class StudentManager extends UserManager {

	@Override
	public void add(User user) {
		
		System.out.println(user.getName()+" Adl� ��renci Sisteme Eklendi");	
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		System.out.println(user.getName()+" Adl� ��renci Sistemden Silindi");		}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		System.out.println(user.getName()+" Adl� ��renci Sistemden G�ncellendi");
	}

	@Override
	public void getAll() {
		// TODO Auto-generated method stub
		System.out.println(" B�t�n ��renciler Listelendi");
	}

	@Override
	public void getByID(int id) {
		// TODO Auto-generated method stub
		System.out.println(id+"'li  ��renci Listelendi");
	}

	@Override
	public void login(User user) {
		// TODO Auto-generated method stub
		System.out.println(user.getName()+"Adl� ��renci Giri� Yapt�");
	}

	@Override
	public void logout(User user) {
		// TODO Auto-generated method stub
		System.out.println(user.getName()+"Adl� ��renci ��k�� Yapt�");
	}

}
