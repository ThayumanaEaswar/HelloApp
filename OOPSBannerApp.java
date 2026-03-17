import java.util.HashMap;
import java.util.Map;

/**
 * @author ThayumanaEaswar
 * @version 8.0
 */
public class OOPSBannerApp {

    // Centralized Map for pattern management
    private static final Map<Character, String[]> patternMap = new HashMap<>();

    static {
        // Initializing the Map with character patterns
        patternMap.put('O', new String[]{
            " ****", " * *", " * *", " * *", " * *", " * *", " ****"
        });
        patternMap.put('P', new String[]{
            " ****", " * *", " * *", " ****", " * ", " * ", " * "
        });
        patternMap.put('S', new String[]{
            " ****", " * ", " * ", " ****", "    *", "    *", " ****"
        });
    }

    public static void main(String[] args) {
        // UC8: Using a Map for efficient retrieval and a rendering function
        renderBanner("OOPS");
    }

    /**
     * Renders a word as a banner using patterns stored in the Map.
     * Uses nested loops and StringBuilder for professional efficiency.
     */
    public static void renderBanner(String word) {
        for (int row = 0; row < 7; row++) {
            StringBuilder lineResult = new StringBuilder();
            for (char c : word.toCharArray()) {
                String[] pattern = patternMap.get(c);
                if (pattern != null) {
                    lineResult.append(pattern[row]).append(" ");
                }
            }
            System.out.println(lineResult.toString());
        }
    }
}