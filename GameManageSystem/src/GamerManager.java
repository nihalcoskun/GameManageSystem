
public class GamerManager implements GamerService  {

	ValidationService _validationManager;
	
	public GamerManager(ValidationService validationManager)
    {
        _validationManager = validationManager;
    }
	
	@Override
	public void add(Gamer gamer) {
		if(_validationManager.Validate(gamer) == true) {
			System.out.println("Ba�ar�yla giri� yap�ld�!");
		}
		else {
			System.out.println("Do�rulama Ba�ar�s�z! L�tfen bilgilerinizi kontrol ediniz.");
		}	}

	
	@Override
	public void delete(Gamer gamer) {
		if(_validationManager.Validate(gamer) == true) {
			System.out.println("Ba�ar�yla silindi!");
		}
		else {
			System.out.println("Do�rulama Ba�ar�s�z! L�tfen bilgilerinizi kontrol ediniz.");
		}
		
	}

	
	@Override
	public void update(Gamer gamer) {
		if(_validationManager.Validate(gamer) == true) {
			System.out.println("Ba�ar�yla g�ncellendi!");
		}
		else {
			System.out.println("Do�rulama Ba�ar�s�z! L�tfen bilgilerinizi kontrol ediniz.");
		}
		
	}

	
	
}
