import java.util.Scanner;

public abstract class Shape implements Dimensions {
    double length;
    double width;

    public abstract void print();

    public void setLength() {
        int x = 1;

        do {


            try {
                Scanner scanner = new Scanner(System.in);

                System.out.println("enter the length");
                length = scanner.nextInt();
                if (length > 0) {
                    x = 3;
                    break;
                } else {
                    System.out.println(" Please enter Positive number  ");
                    x = 1;
                }

            } catch (Exception e) {
                System.out.println(" Please enter Positive number  ");
            }

        } while (true);


    }

    public void setWidth() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the width");
        width = scanner.nextInt();
    }

    @Override
    public String toString() {
        return "Shape = " +
                "length=" + length +
                ", width=" + width;
    }


}
