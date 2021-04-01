public class Main {
    public static void main(String[] args) {
        byte x = 120;
        short y = 25070;
        int z = 58310;
        long q = 67594L;
        float t = 5.8f;
        double m = 4.775;
        char k = 'u';
        boolean xTrue = true;
        boolean xFalse = false;
        prove(null);


    }

    public static float task3(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    public static boolean task4(int m, int n) {
        int sum = m + n;
        if (10 < sum && sum < 20) {
            return true;
        } else {
            return false;
        }

    }

    public static void task5(int i) {
        if (i < 0) {
            System.out.println("Отрицательное число");
        } else {
            System.out.println("Положительное число");

        }
    }

    public static boolean task6(int j) {
        if (j < 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void task7(String name) {
        System.out.println("Привет," + name + "!");
    }

    public static void task8(int year) {
        if (year % 4 != 0 || year % 100 == 0 && year % 400 != 0) {
            System.out.println("Год не високосный");
        } else {
            System.out.println("Год високосный");
        }

    }


    public static void prove(String[] args) {
        System.out.println(task3(12.44f, 17.11f, 16.6f, 2.2f));
        System.out.println(task4(12, 5));
        task5(-5);
        System.out.println(task6(9));
        task7("Юлия");
        task8(4);
        task8(5);
        task8(100);
        task8(400);

    }
}
