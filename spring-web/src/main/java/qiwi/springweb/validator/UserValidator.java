package qiwi.springweb.validator;

import org.springframework.validation.Errors;
import qiwi.springweb.model.User;

public class UserValidator implements org.springframework.validation.Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return User.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        User user = (User) target;

        if (user.getDateOfBirth() == null) {
            errors.reject("dateOfBirth", "Date of birth must not be empty.");
        }
    }
}
