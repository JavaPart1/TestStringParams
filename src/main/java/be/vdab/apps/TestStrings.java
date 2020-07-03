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

     }
}
