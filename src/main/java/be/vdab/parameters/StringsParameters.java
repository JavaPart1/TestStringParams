package be.vdab.parameters;

public class StringsParameters {
    private String strContent;

    public StringsParameters(String strContent) {
        this.strContent = strContent;
    }

    public static boolean isPalindrome(String nwStr) {
        // zet string in lowercase
        String lcStr = nwStr.toLowerCase();
        // bepaal de palidrome
        char[] strPal = lcStr.toCharArray();
        char[] strPal2 = new char[1000];
        for (int i = strPal.length-1; i >= 0; i--) {
            strPal2[strPal.length-1 - i] = strPal[i];
        }
        String strPal3 = new String(strPal2);
        // controleer
        if (lcStr.equals(strPal3)){
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
            //boolean klinkerfound =  false;
            do {
                if (charIn[i] == charklink[j]){
                    //klinkerfound = true;
                    nbrKlink++;
                }
                j++;
            } while ((j < charklink.length));
        }
        return nbrKlink;
    }

    public String getStrContent() {
        return strContent;
    }

    @Override
    public String toString() {
        return "StringsParameters{" +
                "strContent= '" + strContent + '\'' + " " +
                ", Palindrome ? '" + isPalindrome(this.getStrContent()) + '\'' + " " +
                ", Url ? '" + isUrl(this.getStrContent()) + '\'' + " " +
                ", Aantal klinkers : '" + isVowel(this.getStrContent()) + '\'' +
                '}';
    }
}
