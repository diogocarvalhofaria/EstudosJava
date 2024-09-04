//import java.io.File;
//import java.io.IOException;
//import java.util.Scanner;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//    File file = new File("C:\\Projetos\\EstudosJava\\Trabalhando_com_arquivos\\doc.txt");
//    Scanner sc = null;
//
//    try{
//        sc = new Scanner(file);
//        while(sc.hasNextLine()){
//            System.out.println(sc.nextLine());
//        }
//    }catch(IOException e){
//        System.out.printf("Error: " + e.getMessage());
//    }
//    finally {
//        if (sc != null) {
//            sc.close();
//        }
//    }

        //AULA 2

//        String path = "C:\\Projetos\\EstudosJava\\Trabalhando_com_arquivos\\doc.txt";
//        FileReader fr = null;
//        BufferedReader br = null;
//
//        try {
//            fr = new FileReader(path);
//            br = new BufferedReader(fr);
//
//            String line = br.readLine();
//
//            while (line != null) {
//                System.out.println(line);
//                line = br.readLine();
//            }
//        } catch (IOException e) {
//            System.out.println("ERROR: " + e.getMessage());
//        } finally {
//            try {
//                if (br != null) {
//                    br.close();
//                }
//                if (fr != null) {
//                    fr.close();
//                }
//            }
//        catch(IOException e){
//            e.printStackTrace();
//        }
//    }

        //AULA 3
//        String path = "C:\\Projetos\\EstudosJava\\Trabalhando_com_arquivos\\doc.txt";
//
//        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
//            String line = br.readLine();
//
//            while (line != null) {
//                System.out.println(line);
//                line = br.readLine();
//            }
//        } catch (IOException e) {
//            System.out.println("ERROR: " + e.getMessage());
//        }


        //AULA 4
//        String[] lines = new String[]{
//                "good morning", "good dia", "good noite"
//        };
//
//        String path = "C:\\Projetos\\EstudosJava\\Trabalhando_com_arquivos\\teste.txt";
//
//        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
//            for (String line : lines){
//                bw.write(line);
//                bw.newLine();
//            }
//        }
//        catch (IOException e){
//            e.printStackTrace();
//        }

         // AULA 5
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Digita uma pasta: ");
//        String strPath = sc.nextLine();
//
//        File path = new File(strPath);
//        File[] folders = path.listFiles(File::isDirectory);
//        System.out.printf("PASTAS: ");
//        for (File folder : folders) {
//            System.out.println(folder);
//        }
//
//        File [] files = path.listFiles(File::isFile);
//        System.out.printf("ARQUIVOS: ");
//        for (File file : files) {
//            System.out.println(file);
//        }
//
//        boolean sucesso = new File(strPath + "\\subdir").mkdir();
//        System.out.printf("SUCESSO: %s", sucesso);
//        sc.close();

        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter a file path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        System.out.printf("Nome: " + path.getName());
        System.out.printf("Pasta: " + path.getParent());
        System.out.printf("Pasta: " + path.getParent());

    }
    }
