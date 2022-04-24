import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int three = 3;
        final int four = 4;

        switch (scanner.nextInt()) {
            case 1:
                System.out.print("You have chosen a square");
                break;
            case 2:
                System.out.print("You have chosen a circle");
                break;
            case three:
                System.out.print("You have chosen a triangle");
                break;
            case four:
                System.out.print("You have chosen a rhombus");
                break;
            default:
                System.out.print("There is no such shape!");
                break;
        }

    }
}