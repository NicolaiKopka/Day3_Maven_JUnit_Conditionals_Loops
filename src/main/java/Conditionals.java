public class Conditionals {

    public static void main(String[] args) {
        System.out.println(checkForTooManyCustomers(34));
    }

    public static String checkForTooManyCustomers(int numberOfCustomers) {
        if (numberOfCustomers < 0) {
            return "Keine negativen Zahlen möglich";
        } else if (numberOfCustomers > 30) {
            return "Zu viele Personen";
        } else if (numberOfCustomers == 30) {
            return null;
        } else {
            return "Maximale Personenzahl nicht überschritten";
        }
    }

    public static String checkForTooManyCustomers(String alert, int numberOfCustomers) {

        if (numberOfCustomers < 0) {
            return "keine negativen Zahlen möglich";
        }

        switch (alert) {
            case "rot":
                return "keine Personen erlaubt";
            case "gelb":
                if (numberOfCustomers >= 30) {
                    return "keine Personen mehr erlaubt";
                } else {
                    return "Maximale Personenzahl nicht erreicht";
                }
            case "grün":
                if (numberOfCustomers >= 60) {
                    return "keine Personen mehr erlaubt";
                } else {
                    return "Maximale Personenzahl nicht erreicht";
                }
            default:
                return "keine valide Alarmstufe angegeben";
        }
    }

}
