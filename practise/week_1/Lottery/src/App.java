import java.util.Random;

public class App {
    static int numero = 2010;

    static void joku() {
        System.out.println(numero);
    }

    public static int getRandomNumber() {
        int randomNumber = (int) (Math.random() * 39) + 1;
        return randomNumber;
    }

    public static void randomNumber() {
        Random random = new Random();
        int randomNumber = random.nextInt(39) + 1;
        System.out.println(randomNumber);
    }

    public static void main(String[] args) throws Exception {
        // Create a function that return random number between 1-39

        System.out.println(getRandomNumber());
        randomNumber();

        while (true) {
            int randomNumber = getRandomNumber();
            System.out.println(randomNumber);
            if (randomNumber == 25) {
                break;
            }
        }

        // car
        Car car = new Car("Mazda", 2010);
        System.out.println(car.model);
        System.out.println(car.getYear());
        System.out.println(car.getModel());
        System.out.println(car.carAndYear());

        App.joku();
        System.out.println(App.numero);
    }
}
