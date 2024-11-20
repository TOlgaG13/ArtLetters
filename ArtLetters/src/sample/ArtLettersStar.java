package sample;

import java.util.HashMap;
import java.util.Map;

public class ArtLettersStar {
	  private static final Map<Character, String[]> asciiMap = new HashMap<>();
	  static {
	        asciiMap.put('A', new String[]{
	            "  *  ",
	            " * * ",
	            "*****",
	            "*   *",
	            "*   *"
	        });
	        asciiMap.put('B', new String[]{
	                "**** ",
	                "*   *",
	                "**** ",
	                "*   *",
	                "**** "
	            });
	        asciiMap.put('C', new String[]{
	                " ****",
	                "*    ",
	                "*    ",
	                "*    ",
	                " ****"
	            });
	            
	            asciiMap.put('D', new String[]{
	                "**** ",
	                "*   *",
	                "*   *",
	                "*   *",
	                "**** "
	            });
	            
	            asciiMap.put('E', new String[]{
	                "*****",
	                "*    ",
	                "**** ",
	                "*    ",
	                "*****"
	            });
	            
	            asciiMap.put('F', new String[]{
	                "*****",
	                "*    ",
	                "**** ",
	                "*    ",
	                "*    "
	            });
	            
	            asciiMap.put('G', new String[]{
	                " ****",
	                "*    ",
	                "*  **",
	                "*   *",
	                " ****"
	            });
	            
	            asciiMap.put('H', new String[]{
	                "*   *",
	                "*   *",
	                "*****",
	                "*   *",
	                "*   *"
	            });
	            
	            asciiMap.put('I', new String[]{
	                " *** ",
	                "  *  ",
	                "  *  ",
	                "  *  ",
	                " *** "
	            });
	            
	            asciiMap.put('J', new String[]{
	                "  ***",
	                "   * ",
	                "   * ",
	                "*  * ",
	                " **  "
	            });
	            
	            asciiMap.put('K', new String[]{
	                "*   *",
	                "*  * ",
	                "***  ",
	                "*  * ",
	                "*   *"
	            });
	            
	            asciiMap.put('L', new String[]{
	                "*    ",
	                "*    ",
	                "*    ",
	                "*    ",
	                "*****"
	            });
	            
	            asciiMap.put('M', new String[]{
	                "*   *",
	                "** **",
	                "* * *",
	                "*   *",
	                "*   *"
	            });
	            
	            asciiMap.put('N', new String[]{
	                "*   *",
	                "**  *",
	                "* * *",
	                "*  **",
	                "*   *"
	            });
	            
	            asciiMap.put('O', new String[]{
	                " *** ",
	                "*   *",
	                "*   *",
	                "*   *",
	                " *** "
	            });
	            
	            asciiMap.put('P', new String[]{
	                "**** ",
	                "*   *",
	                "**** ",
	                "*    ",
	                "*    "
	            });
	            
	            asciiMap.put('Q', new String[]{
	                " *** ",
	                "*   *",
	                "* * *",
	                "*  **",
	                " ****"
	            });
	            
	            asciiMap.put('R', new String[]{
	                "**** ",
	                "*   *",
	                "**** ",
	                "*  * ",
	                "*   *"
	            });
	            
	            asciiMap.put('S', new String[]{
	                " ****",
	                "*    ",
	                " *** ",
	                "    *",
	                "**** "
	            });
	            
	            asciiMap.put('T', new String[]{
	                "*****",
	                "  *  ",
	                "  *  ",
	                "  *  ",
	                "  *  "
	            });
	            
	            asciiMap.put('U', new String[]{
	                "*   *",
	                "*   *",
	                "*   *",
	                "*   *",
	                " *** "
	            });
	            
	            asciiMap.put('V', new String[]{
	                "*   *",
	                "*   *",
	                "*   *",
	                " * * ",
	                "  *  "
	            });
	            
	            asciiMap.put('W', new String[]{
	                "*   *",
	                "*   *",
	                "* * *",
	                "** **",
	                "*   *"
	            });
	            
	            asciiMap.put('X', new String[]{
	                "*   *",
	                " * * ",
	                "  *  ",
	                " * * ",
	                "*   *"
	            });
	            
	            asciiMap.put('Y', new String[]{
	                "*   *",
	                " * * ",
	                "  *  ",
	                "  *  ",
	                "  *  "
	            });
	            
	            asciiMap.put('Z', new String[]{
	                "*****",
	                "   * ",
	                "  *  ",
	                " *   ",
	                "*****"
	            });
	        }
	  public static void printLettersArt(String text) {
	        text = text.toUpperCase();

	        for (int row = 0; row < 5; row++) {
	            for (char c : text.toCharArray()) {
	                String[] ascii = asciiMap.get(c);
	                if (ascii != null) {
	                    System.out.print(ascii[row] + "  ");
	                } else {
	                    System.out.print("     ");
	                }
	            }
	            System.out.println();
	        }
	    }
	
}
