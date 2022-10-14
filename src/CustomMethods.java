public class CustomMethods
{
    public CustomMethods() { }

// WRITE AND TEST THE FOUR METHODS BELOW!

    public static boolean foundIn(String searchFor, String searchIn) {
        return searchIn.contains(searchFor);
    }


    public static boolean longerThan(String myString, int maxLength) {
        return myString.length() > maxLength;
    }


    public static String funnyString(String str, int idx, int len) {
        String fun = str.substring(idx, idx+len);
        return fun + str + fun;
    }


    public static String pigLatin(String orig) {
        return orig.substring(1) + orig.charAt(0) + "ay";
    }


    public static String starBetween(String str) {
        String finalstring = "";
        for (int i = 0; i < str.length(); i++) {
            finalstring += (str.charAt(i) + "*");
        }
        return finalstring;
    }


    public void alphabetical(String str1, String str2) {
        int comp = str1.compareTo(str2);
        if (comp < 0) {
            System.out.printf("%s comes before %s.\n", str1, str2);
        } else if (comp > 0) {
            System.out.printf("%s comes before %s.\n", str2, str1);
        } else {
            System.out.printf("%s and %s are the same string.\n", str1, str2);
        }
    }


    public static String halvesReversed(String myString) {
        int lengthHalf = (myString.length()/2);
        String firstHalf = myString.substring(0,lengthHalf);
        String secondHalf = myString.substring(lengthHalf);
        return secondHalf + firstHalf;

    }


    public static String yellOrWhisper(String myString) {
        return Character.isUpperCase(myString.charAt(0)) ? myString.toUpperCase() : myString.toLowerCase();
    }


    public static String endUp(String myString, int numToCap){
        int length = myString.length();
        if(numToCap>length) {
            return myString.toUpperCase();
        } else {
            String uppercaseSegment = myString.substring(length - numToCap);
            return myString.substring(0, length - numToCap) + uppercaseSegment.toUpperCase();
        }
    }


    public static String removeCharacter(String myString, int removeIdx) {
        return removeIdx < myString.length() ? new StringBuilder(myString).deleteCharAt(removeIdx).toString() : myString;
    }


    public static String insertAt(String orig, String insertText, String searchStr) {
        int index = orig.indexOf(searchStr);
        return new StringBuilder(orig).insert(index != -1 ? index : orig.length(), insertText).toString();
    }
}


