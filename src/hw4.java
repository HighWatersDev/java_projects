import java.util.Scanner;

public class hw4 {




        public static void main(String[] args) {

            ScanNumber double_num = new ScanNumber();
            System.out.println("Enter decimal number: ");
            double_num.useScanner();

            Product product = new Product();
            double numbers = product.getProduct(2.3, 4.5);
            System.out.println("The product of two decimals is: " + numbers);
            System.out.println();

            new hw4().printLoopData();


        }


        public static void printLoopData() {
            System.out.println("Printing loops");
            int outerloop = 0;
            int innerloop = 0;
            for (outerloop = 1; outerloop <= 10; outerloop += 2) {
                for (innerloop = 1; innerloop <= 10; innerloop++) {
                    System.out.print(outerloop);
                }
                //System.out.println();
            }
        }


        static class Product {
            public double getProduct(double x, double y) {
                double product = x * y;
                return product;
            }
        }


        static class ScanNumber

        {
            public void useScanner() {


                Scanner prompt = new Scanner(System.in);

                double decimal = prompt.nextDouble();
                System.out.println("Your decimal number is: " + decimal);
                System.out.println();

            }
        }

    }




















