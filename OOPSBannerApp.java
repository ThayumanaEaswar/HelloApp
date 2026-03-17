/**
 * @author ThayumanaEaswar
 * @version 5.0
 */
public class OOPSBannerApp {
    public static void main(String[] args) {
        // UC5: Declaring and initializing the array in a single statement
        String[] banner = {
            String.join("", "  ****", " ****", " ****", " ****", " "),
            String.join("", " *", "    *", " *", "    *", " *", "    *", " *", "    *"),
            String.join("", " *", "    *", " *", "    *", " *", "    *", " *", "    *"),
            String.join("", " *", "    *", " *", "    *", " ****", " ****", " "),
            String.join("", " *", "    *", " *", "    *", " *", "     ", " *", "     "),
            String.join("", " *", "    *", " *", "    *", " *", "     ", " *", "     "),
            String.join("", "  ****", " ****", " *", "    ", " ****", " ")
        };

        // Use an enhanced for-loop to iterate and display
        for (String line : banner) {
            System.out.println(line);
        }
    }
}