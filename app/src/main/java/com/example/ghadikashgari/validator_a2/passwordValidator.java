package com.example.ghadikashgari.validator_a2;

/**
 * Created by GhadiKashgari on 2018-02-07.
 * B00674751
 */
import java.lang.String;
import java.lang.Character;
public class passwordValidator {
    private String password;

    public passwordValidator(){
        password = "";
    }
    public void setPassword(String str){
        password = str;
    }

    public String getPassword(){
        return password;
    }
    public boolean passwordLength(String password){
        if (password.length() >= 8){
            return true;
        }
        else {
            return false;
        }
    }
    public boolean compare(String password){
        boolean temp = password.toLowerCase().equals("password");
        if (!temp){
            return true;
        }
        else {
            return false;
        }
    }

    //A method that returns the number of the tests passed by the entered String.
    public int Validate(String password){

        boolean len = passwordLength(password);
        boolean compare = compare(password);


        if (len && compare){
            return 2;
        }


        else if ((len && !compare) || (!len && compare)){
            return 1;
        }


        else {
            return 0;
        }
    }
    //Rule1: Password must have at least two digits(numbers).
    public boolean numberOfDigits(String password){
        int count = 1;
        char ch;
        for (int i =0; i<password.length()-1; i++){
            ch = password.charAt(i);
            if (Character.isDigit(ch)){
                count++;
            }

        }
        if (count < 2){
            return false;
        }
        else {
            return true;
        }
    }

    //Rule2: Password must have at least 1 special character (e.g. -, _, ,, etc.)
    public boolean numberOfCharac(String password){
        int count =0;
        char  ch;
        for (int i =0; i<password.length()-1; i++){
            ch = password.charAt(i);
            if (!Character.isLetterOrDigit(ch)){
                count ++;
            }
        }
        if (count >= 1) {
            return true;
        }
        else {
            return false;
        }
    }

    //Rule3:Password must contain at least one upper case letter
    public static boolean numberOfUppercase(String password){
        int count =0;
        char ch;
        for (int i=0; i<password.length()-1; i++){
            ch = password.charAt(i);
            if (Character.isUpperCase(ch)){
                count ++;
            }
        }
        if (count >= 1){
            return true;
        }
        else {
            return false;
        }
    }
}