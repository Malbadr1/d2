import java.io.*;
import java.util.LinkedList;
import java.util.Scanner;

public class fileReaderAndWriter {

    public static void makeFile() {

        File file = new File("/Users/mohanadalbadri/Desktop/j.txt");

        boolean b = false;
        try {
            b = file.createNewFile();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        if (b == true) {
            System.out.println("done");
        } else
            System.out.println(" it is already created");

    }


    public static void writOnFile() {
        File file = new File("/Users/mohanadalbadri/Desktop/j.txt");
        try {
            PrintWriter fileWriter = new PrintWriter(file);
            Scanner scanner = new Scanner(System.in); // نستخدم الـ System.in للحصول على النص من المستخدم
            System.out.println("Enter text (type 'exit' to finish):");
            String inputText;

            // نقوم بقراءة النص الذي يدخله المستخدم ونحفظه في الملف حتى يدخل كلمة 'exit'
            while (!(inputText = scanner.next()).equalsIgnoreCase("exit")) {
                fileWriter.println(inputText);
            }

            fileWriter.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void readText() {
        File file = new File("/Users/mohanadalbadri/Desktop/j.txt");

        Scanner fileScanner = null;
        try {
            fileScanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Contents of the file:");
        while (fileScanner.hasNext()) {
            System.out.println(fileScanner.nextLine());
        }


    }

    public static void linked_List () {
        LinkedList<String> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter element ");
        String input ;
        while (!(input = scanner.next()).equalsIgnoreCase("exit")){
            list.add(input);
        }
        for ( String i:list
             ) {
            System.out.println(i);
        }
        System.out.println("_______________________________");

        list.addFirst("aaaaaa");
        list.addLast("lllllll");

        for (String i:list
             ) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        linked_List();
    }
}