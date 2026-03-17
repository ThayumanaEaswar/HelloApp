/**
 * @author ThayumanaEaswar
 * @version 6.0
 */
public class OOPSBannerApp {
    public static void main(String[] args) {
        // UC6: Invoking static methods to build the banner array
        String[] banner = {
            buildLine(0),
            buildLine(1),
            buildLine(2),
            buildLine(3),
            buildLine(4),
            buildLine(5),
            buildLine(6)
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }

    /**
     * Helper method to compose a single horizontal line of the "OOPS" banner.
     * Reuses character patterns to follow the DRY principle.
     */
    public static String buildLine(int row) {
        String o = getO(row);
        String p = getP(row);
        String s = getS(row);
        // Composing the line: O + O + P + S
        return String.join(" ", o, o, p, s);
    }

    public static String getO(int row) {
        String[] patterns = {
            " ****", " * *", " * *", " * *", " * *", " * *", " ****"
        };
        return patterns[row];
    }

    public static String getP(int row) {
        String[] patterns = {
            " ****", " * *", " * *", " ****", " * ", " * ", " * "
        };
        return patterns[row];
    }

    public static String getS(int row) {
        String[] patterns = {
            " ****", " * ", " * ", " ****", "    *", "    *", " ****"
        };
        return patterns[row];
    }
}