import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ConditionalsTest {

    @Test
    void shouldReturnAlertStringIfMoreThan30CustomersInStore() {
        int numberOfCustomers = 31;
        String actualString = Conditionals.checkForTooManyCustomers(numberOfCustomers);
        Assertions.assertEquals("Zu viele Personen", actualString);
    }

    @Test
    void shouldReturnCorrectStringIfLessThan30CustomersInStore() {
        int numberOfCustomers = 29;
        String actualString = Conditionals.checkForTooManyCustomers(numberOfCustomers);
        Assertions.assertEquals("Maximale Personenzahl nicht überschritten", actualString);
    }

    @Test
    void shouldReturnNullIfExactly30CustomersInStore() {
        int numberOfCustomers = 30;
        String actualString = Conditionals.checkForTooManyCustomers(numberOfCustomers);
        Assertions.assertNull(actualString);
    }

    @Test
    void shouldReturnWarningIfParsedNumberIsLess0() {
        int numberOfCustomers = -3;
        String actualString = Conditionals.checkForTooManyCustomers(numberOfCustomers);
        Assertions.assertEquals("Keine negativen Zahlen möglich", actualString);
    }

    @Test
    void shouldReturnWarningIfNoPeopleAllowedInStore() {
        int numberOfCustomers = 10;
        String resultString = Conditionals.checkForTooManyCustomers("rot", numberOfCustomers);
        Assertions.assertEquals("keine Personen erlaubt", resultString);
    }

    @Test
    void shouldReturnWarningIfNoPeopleIsEqualOrGreater30() {
        int numberOfCustomers = 30;
        String resultString = Conditionals.checkForTooManyCustomers("gelb", numberOfCustomers);
        Assertions.assertEquals("keine Personen mehr erlaubt", resultString);
    }

    @Test
    void shouldReturnMessageIfNoPeopleIsLess30() {
        int numberOfCustomers = 29;
        String resultString = Conditionals.checkForTooManyCustomers("gelb", numberOfCustomers);
        Assertions.assertEquals("Maximale Personenzahl nicht erreicht", resultString);
    }

    @Test
    void shouldReturnWarningIfNoPeopleIsEqualOrGreater60() {
        int numberOfCustomers = 60;
        String resultString = Conditionals.checkForTooManyCustomers("grün", numberOfCustomers);
        Assertions.assertEquals("keine Personen mehr erlaubt", resultString);
    }

    @Test
    void shouldReturnMessageIfNoPeopleIsLess60() {
        int numberOfCustomers = 59;
        String resultString = Conditionals.checkForTooManyCustomers("grün", numberOfCustomers);
        Assertions.assertEquals("Maximale Personenzahl nicht erreicht", resultString);
    }

    @Test
    void shouldReturnInvalidIfNumberOfPeopleLess0 () {
        int numberOfCustomers = -5;
        String resultString = Conditionals.checkForTooManyCustomers("grün", numberOfCustomers);
        Assertions.assertEquals("keine negativen Zahlen möglich", resultString);
    }

    @Test
    void shouldReturnWarningIfWrongColorWasGiven () {
        int numberOfCustomers = 10;
        String resultString = Conditionals.checkForTooManyCustomers("blau", numberOfCustomers);
        Assertions.assertEquals("keine valide Alarmstufe angegeben", resultString);
    }





}