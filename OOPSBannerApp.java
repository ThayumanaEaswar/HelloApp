/**
 * @author ThayumanaEaswar
 * @version 7.0
 */
public class OOPSBannerApp {

    // UC7: Encapsulating character data into a dedicated class structure
    static class CharacterPattern {
        private final char character;
        private final String[] pattern;

        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public String getRow(int row) {
            return pattern[row];
        }
    }

    public static void main(String[] args) {
        // Defining patterns once in objects
        CharacterPattern charO = new CharacterPattern('O', new String[]{
            " ****", " * *", " * *", " * *", " * *", " * *", " ****"
        });
        CharacterPattern charP = new CharacterPattern('P', new String[]{
            " ****", " * *", " * *", " ****", " * ", " * ", " * "
        });
        CharacterPattern charS = new CharacterPattern('S', new String[]{
            " ****", " * ", " * ", " ****", "    *", "    *", " ****"
        });

        // Building the banner using the objects
        for (int i = 0; i < 7; i++) {
            System.out.println(String.join(" ", 
                charO.getRow(i), 
                charO.getRow(i), 
                charP.getRow(i), 
                charS.getRow(i)
            ));
        }
    }
}