
public class ValidationManager implements ValidationService {

	@Override
	public boolean Validate(Gamer gamer) {
		if(gamer.getIdentityNumber().length() == 11 && !gamer.getIdentityNumber().startsWith("0")
			       && gamer.getBirthYear()<= 2014) {
			 
			return true;
	     }
			    
	     else {
			
	    	 return false;
			    
	     }
	}


}
