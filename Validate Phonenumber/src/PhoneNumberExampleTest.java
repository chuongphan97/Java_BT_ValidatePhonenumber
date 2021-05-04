import java.util.Scanner;

public class PhoneNumberExampleTest {
    public static void main(String[] args) {
        PhoneNumberExample phoneNumberExample = new PhoneNumberExample();
        String input;
        Scanner sc = new Scanner(System.in);
        input = sc.nextLine();
        System.out.println(phoneNumberExample.validate(input));
    }
}
