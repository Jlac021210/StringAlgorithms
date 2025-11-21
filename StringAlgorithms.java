public class StringAlgorithms {

    /**
     * Challenge 1:
     * Write a method that takes a String 'word' and returns
     * a String where each character is placed on its own line.
     */
    public static String printCharacters(String word) {
      String newWord = "";
        for(int i=0;i<=word.length()-1;i++){
            newWord+=word.substring(i,i+1)+"\n";
        }
        return newWord;
    }


    /**
     * Challenge 2:
     * Write a method that takes a String 'word' and returns
     * a new String with the characters reversed.
     */
    public static String reverseWord(String word) {
        String wordNew="";
        for(int i=word.length()-1;i>=0;i--){
            wordNew+=word.substring(i,i+1);
        }
        return wordNew;
    }


    /**
     * Challenge 3:
     * Write a method that takes a String 'sentence' and returns
     * the sentence with the first letter of each word capitalized.
     */
    public static String capitalizeString(String sentence) {
        String sentenceNew="";
        String upper="";
        for(int i=0;i<=sentence.length()-1;i++){
        if(i!=0){
           if(sentence.substring(i-1,i).equals(" ")){
              upper=sentence.substring(i,i+1);
              upper=upper.toUpperCase();
              sentenceNew+=upper;
            }else{
              sentenceNew+=sentence.substring(i,i+1);
              }
         }else{
            upper=sentence.substring(i,i+1);
            upper=upper.toUpperCase();
            sentenceNew+=upper;
         }
         }
        return sentenceNew;
        }


    /**
     * Challenge 4:
     * Write a method that takes a String 'word' and returns true
     * if the word is a palindrome (ignoring case), false otherwise.
     */
    public static boolean detectPalindrome(String word) {
        String halfWord1 = "";
        String halfWord2 = "";
        halfWord1=word.substring(0,(word.length()/2));
        halfWord1=halfWord1.toLowerCase();
        halfWord2=word.substring((word.length()/2),word.length());
        halfWord2=halfWord2.toLowerCase();
        String halfWord2New = "";
        for(int i=halfWord2.length()-1;i>=0;i--){
            halfWord2New+=halfWord2.substring(i,i+1);
        }
        if((word.length()%2)!=0){
            halfWord2New=halfWord2New.substring(0,halfWord2New.length()-1);
        }
        if(halfWord1.equals(halfWord2New)){
            return true;
        }
        return false;
        
    }


    /**
     * Challenge 5:
     * Write a method that takes a String 'word' and returns the
     * first character that appears exactly once. If no such
     * character exists, return a space ' '.
     */
    public static char firstUniqueChar(String word) {
    String half1="";
    String half2="";
    String letter="";
    char myChar;
    for(int i=0; i<=word.length()-1;i++){
       half1=word.substring(0,i);
       half2=word.substring(i+1,word.length());
       letter=word.substring(i,i+1);
       if((half1.indexOf(letter)==-1)&&(half2.indexOf(letter)==-1)){
           myChar = letter.charAt(0);
           return myChar;
           }
           
    }
        
        return ' ';
    }


    /**
     * Main method:
     * Test each method at least once.
     */
    public static void main(String[] args) {

        // TODO: Add test calls for each challenge method
        
        System.out.println("Testing printCharacters:");
        System.out.println(printCharacters("hello"));

        System.out.println("\nTesting reverseWord:");
        System.out.println(reverseWord("hello"));

        System.out.println("\nTesting capitalizeString:");
        System.out.println(capitalizeString("the quick brown fox"));

        System.out.println("\nTesting detectPalindrome:");
        System.out.println(detectPalindrome("racecar"));

        System.out.println("\nTesting firstUniqueChar:");
        System.out.println(firstUniqueChar("swiss"));
    }
}
