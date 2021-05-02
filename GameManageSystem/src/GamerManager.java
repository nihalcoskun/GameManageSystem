
public class GamerManager implements GamerService  {

	ValidationService _validationManager;
	
	public GamerManager(ValidationService validationManager)
    {
        _validationManager = validationManager;
    }
	
	@Override
	public void add(Gamer gamer) {
		if(_validationManager.Validate(gamer) == true) {
			System.out.println("Baþarýyla giriþ yapýldý!");
		}
		else {
			System.out.println("Doðrulama Baþarýsýz! Lütfen bilgilerinizi kontrol ediniz.");
		}	}

	
	@Override
	public void delete(Gamer gamer) {
		if(_validationManager.Validate(gamer) == true) {
			System.out.println("Baþarýyla silindi!");
		}
		else {
			System.out.println("Doðrulama Baþarýsýz! Lütfen bilgilerinizi kontrol ediniz.");
		}
		
	}

	
	@Override
	public void update(Gamer gamer) {
		if(_validationManager.Validate(gamer) == true) {
			System.out.println("Baþarýyla güncellendi!");
		}
		else {
			System.out.println("Doðrulama Baþarýsýz! Lütfen bilgilerinizi kontrol ediniz.");
		}
		
	}

	
	
}
