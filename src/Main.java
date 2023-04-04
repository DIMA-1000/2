import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println(getResult(25, 15));  // "Можно идти гулять"
        System.out.println(getResult(18, 5));   // "Можно идти гулять"
        System.out.println(getResult(50, 20));  // "Можно идти гулять"
        System.out.println(getResult(30, 35));  // "Оставайтесь дома"
        System.out.println(getResult(60, -15)); // "Оставайтесь дома"
    }

    public static String getResult(int age, int temperature) {
        if (age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) {
            return "Можно идти гулять";
        } else if (age < 20 && temperature >= 0 && temperature <= 28) {
            return "Можно идти гулять";
        } else if (age > 45 && temperature >= -10 && temperature <= 25) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }
    }


    public class main {
        public static void main(String[] args) {
            test(23, 10);
            test(generateRandomAge(), 10);
        }

        public static void test(int age, int temperature) {
            System.out.println("Возраст: " + age + ", температура: " + temperature);
            System.out.println(getResult(age, temperature));
            System.out.println();
        }

        public static String getResult(int age, int temperature) {
            if (age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) {
                return "Можно идти гулять";
            } else if (age < 20 && temperature >= 0 && temperature <= 28) {
                return "Можно идти гулять";
            } else if (age > 45 && temperature >= -10 && temperature <= 25) {
                return "Можно идти гулять";
            } else {
                return "Оставайтесь дома";
            }
        }

        public static int generateRandomAge() {
            Random random = new Random();
            return random.nextInt(100);
        }
    }


}

