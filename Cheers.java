// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {

        String s = args[0];
        s = s.toUpperCase();
        char letter;
        String vowels = "AEFHILMNORSX";

        for (int i = 0; i < s.length(); i++)    {                  //runs through letters of given word
                letter = s.charAt(i);
                if (vowels.indexOf(letter) == -1) {                   //if the letter is not one of the "vowel" letters
                        System.out.print("Give me a  "+letter+": " );
                }
                else {
                        System.out.print( "Give me an "+letter+": ");
                }
                System.out.println(letter + "!");
        }
        System.out.println("What does that spell?");
        for (int j = 0; j < Integer.parseInt(args[1]); j++) {
             System.out.println("RUNI!!!");
        }
        }    
}