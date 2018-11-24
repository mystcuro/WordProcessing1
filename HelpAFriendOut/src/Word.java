import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
/**
 * @author ( Sowrov  ) 
 * @version ( 0.1 )
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
             
            ArrayList<Character> shuffle = new ArrayList<Character>();
            for(int i=0;i<middle.length();i++) {
            	shuffle.add(middle.charAt(i));
            }
            Collections.shuffle(shuffle, new Random());
            
            if (shuffle != null)
            {
            	middle = shuffle.toString().replaceAll("[\\[\\]]" ,"").replaceAll(", ", "");
            }
            
            
            String scrambled=middle;
            String last = word.substring(length-2);
            return first+scrambled+last;
        }
    }

}