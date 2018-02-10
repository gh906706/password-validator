package com.example.ghadikashgari.validator_a2;

/**
 * Created by GhadiKashgari on 2018-02-10.
 */

/**
 * Created by GhadiKashgari on 2018-02-07.
 * B00674751
 */

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

        //true and true = true
        if (len && compare){
            return 2;
        }

        // (true and false) or (false and true)
        else if ((len && !compare) || (!len && compare)){
            return 1;
        }

        // false and false = false
        else {
            return 0;
        }
    }
}