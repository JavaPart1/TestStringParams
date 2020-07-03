package be.vdab.apps;

import be.vdab.model.StringsParameters;

import java.util.Scanner;

public class TestStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Invoer vn strings
        /*for (int i = 0; i < 4; i++) {
            String inStr = input.nextLine();
        }*/
        String s1 = "Lepel";
        String s2 = "http://www.smartdeveloper.be";
        String s3 = "De mooie zeeman nam Anna mee zei oom Ed";

        // Teststrings
        StringsParameters strParms = new StringsParameters();
        strParms.isPalindrome(s1);

    }
}
