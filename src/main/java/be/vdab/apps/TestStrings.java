package be.vdab.apps;

import be.vdab.parameters.StringsParameters;

public class TestStrings {
    public static void main(String[] args) {
        StringsParameters s1 = new StringsParameters("Lepel");
        StringsParameters s2 = new StringsParameters("http://www.smartdeveloper.be");
        StringsParameters s3 = new StringsParameters("De mooie zeeman nam Anna mee zei oom Ed");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

     }
}
