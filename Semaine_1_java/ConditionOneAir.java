import java.util.ArrayList;
import java.util.HashMap;

public class ConditionOneAir {

    public static String sport(String name) {
        String sport = "";
        switch (name) {
            case "Toto":
                sport = "tennis";
                break;

            case "Jean":
                sport = "vélo";
                break;

            case "Sigismond":
                sport = "joute";
                break;

            case "Gontrand":
                sport = "bridge";
                break;

            case "Titi":
                sport = "ski";
                break;

            default:
                sport = "aucun sport";
                break;
        }

        return sport;
    }

    static HashMap<String, String> sports = new HashMap<String, String>() {
        {
            put("Toto", "tennis");
            put("Jean", "velo");
            put("Sigismond", "joute");
            put("Gontrand", "bridge");
            put("Titi", "ski");
        }
    };

    public static String sport2(String name) {
        return sports.get(name);
    }

    public static void main(String[] args) {

        String name = "Titi";
        String sport = sport(name);
        System.out.println(String.format(" %s pratique ce sport : %s ", name, sport));

        name = "Gontrand";
        sport = sport2(name);
        System.out.println(String.format(" %s pratique ce sport : %s ", name, sport));

    }
}

/*
 *
 * toto -> tennis
 * jean -> velo
 * Sigismond -> joute
 * Gontrand -> bridge
 * titi -> ski
 *
 *
 */
