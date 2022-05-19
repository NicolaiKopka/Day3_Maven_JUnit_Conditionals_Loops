public class Schleifen {

    public static void main(String[] args) {
        System.out.println(faculty(6));
        System.out.println(faculty(3));
    }

    public static int forFaculty(int number) {
        int resultNumber = 1;
        
        for (int i = 1; i <= number ; i++) {
            resultNumber *= i;
        }
        return resultNumber;
    }

    public static int faculty(int number) {
        int resultNumber = 1;
        int counter = 1;
        while(counter < (number + 1)) {
            resultNumber *= counter;
            counter++;
        }
        return resultNumber;
    }
}
