import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        method1();
//
//
//    }
//    public static void method1() {
//        System.out.println("***METHOD2 STARTED***");
//        method2();
//        System.out.println("***METHOD2 ENDED***");
//    }
//
//    public static void method2(){
//        System.out.println("***METHOD2 STARTED***");
//        Scanner sc = new Scanner(System.in);
//
//        try {
//            String[] vect = sc.nextLine().split("");
//            int position = sc.nextInt();
//
//            System.out.println(vect[position]);
//        }
//        catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("End of program");
//            e.printStackTrace();
//        }catch (InputMismatchException e){
//            System.out.println("Input error");
//        }
//        sc.close();
//        System.out.println("***METHOD2 ENDED***");

        File file = new File("C:\\temp\\in.txt");
        Scanner sc = null;
        try{
            sc = new Scanner(file);
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        }
        catch (FileNotFoundException e){
            System.out.println("Error opening file: " + e.getMessage());
        }
        finally {
            if (sc != null){
                sc.close();
            }
            System.out.println("Finally block execute!");
        }


   }

}