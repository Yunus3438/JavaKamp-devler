package ucuncuHaftaOdev;

public class InstructorManager extends UserManager{

	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		System.out.println(user.getName()+" Adl� E�itmen Sisteme Eklendi");		}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		System.out.println(user.getName()+" Adl� E�itmen Sistemden Silindi");	
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		System.out.println(user.getName()+" Adl� E�itmen Sistemden G�ncellendi");	
	}

	@Override
	public void getAll() {
		// TODO Auto-generated method stub
		System.out.println(" B�t�n E�itmenler Listelendi");
	}

	@Override
	public void getByID(int id) {
		// TODO Auto-generated method stub
		System.out.println(id+"'li  E�itmen Listelendi");
	}

	@Override
	public void login(User user) {
		// TODO Auto-generated method stub
		System.out.println(user.getName()+"Adl� E�itmen Giri� Yapt�");
	}

	@Override
	public void logout(User user) {
		// TODO Auto-generated method stub
		System.out.println(user.getName()+"Adl� E�itmen ��k�� Yapt�");
	}

}
