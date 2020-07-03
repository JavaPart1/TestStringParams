package be.vdab.model;

public class StringsParameters {
    public static boolean isPalindrome(String string) {
        // zet string in lowercase
        String nwStr = string.toLowerCase();
        //string = string.toLowerCase();
        // bepaal de palidrome
        char[] strPal = nwStr.toCharArray();
        char[] strPal2 = new char[1000];
        for (int i = strPal.length-1; i >= 0; i--) {
            strPal2[strPal.length-1 - i] = strPal[i];
        }
        String strPal3 = new String(strPal2);
        // controleer
        if (nwStr.contentEquals(strPal3)){
            return true;
        }else{
            return false;
        }
    }
    public static boolean isPhrasePalindrome (String string) {
        return false;
    }
    public static boolean isUrl(String string) {
        if (string.contains("http")){
            return true;

        }else {
            return false;
        }
    }
    public static int isVowel(String string) {
        int nbrKlink = 0;
        String nwStr = string.toLowerCase();
        String klinkers = "aeiouy";

        // Omzetten nr chars
        char[] charIn = nwStr.toCharArray();
        char[] charklink = klinkers.toCharArray();

        for (int i = 0; i < charIn.length; i++) {
            int j = 0;
            boolean klinkerfound =  false;
            do {
                if (charIn[i] == charklink[j]){
                    klinkerfound = true;
                    nbrKlink++;
                }
                j++;
            } while (!klinkerfound);
        }
        return nbrKlink;
    }
}
