import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Book Code:");
        String code = input.nextLine().trim().toLowerCase();

        switch(code) {
            case "a":
                Book a = new Book();
                a.setCode("a");
                a.setAuthor("Kathy Sierra and Bert Bates");
                a.setPrice(47.99);
                a.setDescription("Easy to read Java workbook");
                System.out.println(a.toString());
                break;

            case "java1002":
                Book b = new Book();
                b.setCode("Java1002");
                b.setAuthor("Bruce Eckel");
                b.setPrice(20.00);
                b.setDescription("Details about Java under the hood");
                System.out.println(b.toString());
                break;

            case "program1234":
                Software software = new Software();
                software.setCode("Program1234");
                software.setProgrammer("Fi");
                software.setOs("Windows");
                software.setPlatform("PC");
                software.setPrice(999.99);
                System.out.println(software.toString());
                break;

            default:
                System.out.println("Invalid code");
        }

    }
}
