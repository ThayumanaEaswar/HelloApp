/**
 * @author ThayumanaEaswar
 * @version 4.0
 */
public class OOPSBannerApp {
    public static void main(String[] args) {
        // UC4: Using a String array and a loop for modularity and reusability
        String[] banner = new String[7];

        // Populating the array using String.join() for memory efficiency
        banner[0] = String.join("", "  ****", " ****", " ****", " ****", " ");
        banner[1] = String.join("", " *", "    *", " *", "    *", " *", "    *", " *", "    *");
        banner[2] = String.join("", " *", "    *", " *", "    *", " *", "    *", " *", "    *");
        banner[3] = String.join("", " *", "    *", " *", "    *", " ****", " ****", " ");
        banner[4] = String.join("", " *", "    *", " *", "    *", " *", "     ", " *", "     ");
        banner[5] = String.join("", " *", "    *", " *", "    *", " *", "     ", " *", "     ");
        banner[6] = String.join("", "  ****", " ****", " *", "    ", " ****", " ");

        // Using an enhanced for-loop to print the banner lines
        for (String line : banner) {
            System.out.println(line);
        }
    }
}