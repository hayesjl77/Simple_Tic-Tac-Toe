import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int three = 3;
        final int four = 4;

        switch (scanner.nextInt()) {
            case 0:
                System.out.print("do not move");
                break;
            case 1:
                System.out.print("move up");
                break;
            case 2:
                System.out.print("move down");
                break;
            case three:
                System.out.print("move left");
                break;
            case four:
                System.out.print("move right");
                break;
            default:
                System.out.print("error!");
                break;
        }
    }
}