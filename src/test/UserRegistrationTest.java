package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import com.bridgelabz.UserRegistration;
import com.bridgelabz.UserRegistrationException;

class UserRegistrationTest {

	 @Test
	    public void validateFirstName() throws UserRegistrationException {
	        UserRegistration validate = new UserRegistration();
	        boolean result = validate.validateFirstName("Piyush");
	        Assertions.assertEquals(true, result);
	    }

	    @Test
	    public void validateLastName() throws UserRegistrationException {
	        UserRegistration validate = new UserRegistration();
	        boolean result = validate.validateLastName("Shaw");
	        Assertions.assertEquals(true, result);
	    }

	    @Test
	    public void Validate_Email() throws UserRegistrationException {
	        UserRegistration validate = new UserRegistration();
	        boolean result = validate.validateEmail("piyush.shaw@gmail.com");
	        Assertions.assertEquals(true, result);
	    }

	    @Test
	    public void Validate_MobileNumber() throws UserRegistrationException {
	        UserRegistration validate = new UserRegistration();
	        boolean result = validate.validatePhoneNumber("91 8584021446");
	        Assertions.assertEquals(true, result);
	    }

	    @Test
	    public void Validate_Password() throws UserRegistrationException {
	        UserRegistration validate = new UserRegistration();
	        boolean result = validate.validatePassword("Passward#123");
	        Assertions.assertEquals(true, result);
	    }

}
