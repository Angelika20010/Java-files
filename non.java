package dip107;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;
public class non {


    public static void main(String args[]) throws Exception {
        Scanner number = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        String filename = "db.csv";
        int c;

        while (true) {
            System.out.println("1 - print");
            System.out.println("2 - add");
           
            c = number.nextInt();

            switch (c) {
                case 1:
                    ListView viewlist = new ListView();
                    viewlist.view(filename, sc);
                    break;
                case 2:
                    AddInList addlist = new AddInList();
                    addlist.add(filename, sc);
                    break;
            }
        }
    }

    public static class ListView {
        public void view(String filename, Scanner sc) {
            try {
                String s;
                sc = new Scanner(new FileReader(filename));
                while (sc.hasNextLine()) {
                    s = sc.nextLine();
                    System.out.println(s);
                }
                sc.close();

            } catch (Exception e) {
                System.out.print(e.getMessage());
            }
            System.out.println();
        }
    }

    public static class AddInList {
        public void add(String filename, Scanner sc) throws Exception {
            Scanner in = new Scanner(System.in);
            try {
                sc = new Scanner(new FileReader(filename));
                PrintWriter out = new PrintWriter(new FileWriter(filename, true));
                String data;
                boolean free = false;
                int i = 0;
                System.out.println("id, city, date, days, price, vehicle");
                System.out.print("\n");

                while (sc.hasNextLine()) {
                    i++;
                    data = in.nextLine();
                    if (i == 1) {
                        if (data.length() < 3) {
                            throw new Exception("Type in atleast 3 digit code");
                        }
                    }
                    if (i == 2) {
                        try {
                            Double.parseDouble(data);
                        } catch (NumberFormatException e) {
                            throw new Exception("wrong input");
                        }
                    }

                   
                   
                }
                System.out.close();
                sc.close();
            } catch (Exception e) {
                System.out.print(e.getMessage());
            }
            System.out.println();
        }
    }
}