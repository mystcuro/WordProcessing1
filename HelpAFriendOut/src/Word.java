import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
/**
 * Word represents a word and displays the
 * word using the ideas discussed in the 
 * Reibadailty article from New Scientist.
 * 
 * @author (..........................) 
 * @version (..........................)
 */
public class Word{
    String word;
    public Word(String w){
        word=w;
    }

    public String toString(){
        if (word.length()<6) {
            return word;
        }
        else {
            String first = word.substring(0,2);
            int length = word.length();
            String middle = word.substring(2,length-2);
            
            // change this next line so it randomizes 
            ArrayList<Character> shuffle = new ArrayList<Character>();
            for(int i=0;i<middle.length();i++) {
            	shuffle.add(middle.charAt(i));
            }
            Collections.shuffle(shuffle, new Random());
            
            if (shuffle != null)
            {
            	middle = shuffle.toString().replaceAll("[\\[\\]]" ,"").replaceAll(", ", "");
            	//middle = shuffle.toString();
                //middle = middle.substring(1, middle.length()-1);
            }
            
            
            // the middle letters of the word
            String scrambled=middle;
            String last = word.substring(length-2);
            return first+scrambled+last;
        }
    }

}