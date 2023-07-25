import java.util.Scanner;

public class Main2 {
    public static boolean shouldWakeUP(boolean isBarking, int clock) {
        //Guarding
        if (clock < 0 || clock > 23) return false;
        if (!isBarking) return false;
        return clock < 8 || clock >= 20;
    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
        return (firstAge >= 13 && firstAge <= 19) ||
                (secondAge >= 13 && secondAge <= 19) ||
                (thirdAge >= 13 && thirdAge <= 19);
    }

    public static boolean hasTeen2(int... ages) {
        for (int age : ages) {
            if (age >= 13 && age <= 19) {
                return true;
            }
        }
        return false;
    }

    public static double area(double x, double y) {
        if (x < 0 || y < 0) {
            System.out.println("Kenarlar 0'in üzerinde olmalıdır.");
            return -1;
        }
        return x * y;
    }

    public static double area(double radius) {
        if (radius < 0) {
            System.out.println("Yaricap degeri 0'dan buyuk olmali");
            return -1;
        }
        return radius * radius * Math.PI;
    }
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("shouldWakeUp------");
        System.out.println(shouldWakeUP(true, 1));
        System.out.println(shouldWakeUP(false, 2));
        System.out.println(shouldWakeUP(true, 8));
        System.out.println(shouldWakeUP(true, -1));
        System.out.println("hasTeen------");
        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));
        System.out.println("hasTeen2------");
        System.out.println(hasTeen2(9, 99, 19, 22, 45, 23));
        System.out.println("RectangleArea------");
        Scanner scanner = new Scanner(System.in);
        boolean isValid = true;
        while (isValid) {
            try {
                System.out.println("Enter first side:");
                double x = scanner.nextDouble();
                System.out.println("Enter second side");
                double y = scanner.nextDouble();
                double result = area(x, y);
                System.out.println("Area = " + result);
                isValid=false;
            } catch (Exception ex) {
                isValid = false;
                System.out.println("Invalid Input");
            }

        }
        isValid=true;
        if (isValid) {
            System.out.println("Circle Area -----");
            try {
                System.out.println("Enter radius of circle: ");
                double radius = scanner.nextDouble();
                System.out.println("Result = " + area(radius));
                isValid=false;
            } catch (Exception ex) {
                System.out.println("Invalid Input");
                isValid=false;
            }


        }
        System.out.println("isPrime----------------");
        System.out.println(isPrime(1));
        System.out.println(isPrime(2));
        System.out.println(isPrime(4));
        System.out.println(isPrime(-2));
        System.out.println(isPrime(17));
        System.out.println(isPrime(18));



    }
}