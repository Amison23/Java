public class String_Bean {
    // Assignment TASK 1 & 2 
    public static void main(String[] args) {
        String mySentence = "The Qu1ck Br0wn Fox jumps over,the,Lazy,D*g";
        // Change to lower case
        String lowerCase = mySentence.toLowerCase();
        System.out.println("Lowercase String is "+lowerCase);
        // Replace "1" with "i"
        String mySentence1 = lowerCase.replaceFirst("1", "i");
        System.out.println("Replacing 1 with i: "+mySentence1);
        // Replacing * with o
        String mySentence2 = mySentence1.replaceAll("[0*]", "o");
        System.out.println("Replacing * and 0 with o: "+mySentence2);

        // TOKENIZING
        // First replace "," with a space where applicable
        System.out.println("Current String format is: " + mySentence2);
        String punctuated = mySentence2.replace(",", " ");
        System.out.println("Completed Sentence is: "+punctuated);

    }
} 

















        // String[] Punctuated = punctuated.split(" ");
        // for(String Punctuate : Punctuated){
        //     System.out.println(Punctuate);
        // }
        // String mySentence3 = Punctuate.toString();
        // System.out.println(mySentence3);