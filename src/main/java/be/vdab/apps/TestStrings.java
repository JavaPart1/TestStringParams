package be.vdab.apps;

import be.vdab.parameters.StringsParameters;

import java.util.Scanner;

public class TestStrings {
    public static void main(String[] args) {
        //Scanner input = new Scanner(System.in);
        //Invoer vn strings
        /*for (int i = 0; i < 4; i++) {
            String inStr = input.nextLine();
        }*/
        StringsParameters s1 = new StringsParameters("Lepel");
        StringsParameters s2 = new StringsParameters("http://www.smartdeveloper.be");
        StringsParameters s3 = new StringsParameters("De mooie zeeman nam Anna mee zei oom Ed");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        /* Teststrings
        StringsParameters strParms = new StringsParameters();
        if (strParms.isPalindrome(s1)){
            System.out.println(s1 + " is een palidrome");
        } else {
            System.out.println(s1 + " is geen palindrome");
        }
        if (strParms.isUrl(s1)){
            System.out.println(s1 + " is een url");
        } else {
            System.out.println(s1 + " is geen url");
        }
        System.out.println(s1 + " heeft "+ strParms.isVowel(s1) +
                " klinkers.");
        strParms = new StringsParameters();
        if (strParms.isPalindrome(s2)){
            System.out.println(s2 + " is een palidrome");
        } else {
            System.out.println(s2 + " is geen palindrome");
        }
        if (strParms.isUrl(s2)){
            System.out.println(s2 + " is een url");
        } else {
            System.out.println(s2 + " is geen url");
        }
        System.out.println(s2 + " heeft "+ strParms.isVowel(s2) +
                " klinkers.");
        strParms = new StringsParameters();
        if (strParms.isPalindrome(s3)){
            System.out.println(s3 + " is een palidrome");
        } else {
            System.out.println(s3 + " is geen palindrome");
        }
        if (strParms.isUrl(s3)){
            System.out.println(s3 + " is een url");
        } else {
            System.out.println(s3 + " is geen url");
        }
        System.out.println(s3 + " heeft "+ strParms.isVowel(s3) +
                " klinkers.");*/

    }
}
