package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printErrorChars() {
        System.out.println("Error is active: " + active);
        System.out.println("Error status code: " + status);
        System.out.println("Error message: " + message);
    }

    public static void main(String[] args) {
        Error firstError = new Error();
        Error secondError = new Error(true, 10, "Error code 404");
        Error thirdError = new Error(false, 30, "Oops, something went wrong!");
        Error fourthError = new Error(true, 30, "This programm does not working right now!");

        firstError.printErrorChars();
        secondError.printErrorChars();
        thirdError.printErrorChars();
        fourthError.printErrorChars();
    }
}
