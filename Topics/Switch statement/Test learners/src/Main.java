import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int three = 3;
        final int four = 4;

        switch (scanner.nextInt()) {
            case 1:
                System.out.print("Yes!");
                break;
            case 2:
            case four:
            case three:
                System.out.print("No!");
                break;
            default:
                System.out.print("Unknown number");
                break;
        }
    }
}