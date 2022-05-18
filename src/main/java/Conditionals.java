public class Conditionals {

    private static final String WARNING = "Zu viele Personen";
    private static final String ALLOWED_MESSAGE = "Maximale Personenzahl nicht überschritten";

    public static void main(String[] args) {
        System.out.println(checkForTooManyCustomers(34));
    }

    public static String checkForTooManyCustomers(int numberOfCustomers) {
        if (numberOfCustomers < 0) {
            return "Keine negativen Zahlen möglich";
        } else if (numberOfCustomers > 30) {
            return getAlertMessage(numberOfCustomers, 30);
        } else if (numberOfCustomers == 30) {
            return "keine Personen mehr erlaubt";
        } else {
            return getAlertMessage(numberOfCustomers, 30);
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
                return getAlertMessage(numberOfCustomers, 30);
            case "grün":
                return getAlertMessage(numberOfCustomers, 60);
            default:
                return "keine valide Alarmstufe angegeben";
        }
    }

    private static String getAlertMessage(int numberOfCustomer, int maxNumberOfCustomers ) {

        if(numberOfCustomer > maxNumberOfCustomers) {
            return WARNING;
        } else {
            return ALLOWED_MESSAGE;
        }

    }

}