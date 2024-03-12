class CustomValidationException extends Exception {
    public CustomValidationException(String message) {
        super(message);
    }
}

class Validator {
    public void validateNumber(int number) throws CustomValidationException {
        if (number < 0) {
            throw new CustomValidationException("Number cannot be negative");
        }
    }
}

public class CustomValidation {
    public static void main(String[] args) {
        Validator validator = new Validator();
        int inputNumber = -5; // Example input number

        try {
            validator.validateNumber(inputNumber);
            System.out.println("Number is valid");
        } catch (CustomValidationException e) {
            System.out.println("CustomValidationException: " + e.getMessage());
        }
    }
}
