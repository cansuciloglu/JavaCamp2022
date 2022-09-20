public class Main {
    public static void main(String[] args) {
        char letter = 'U';

        switch (letter) {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("This letter is a bold vowel.");
                break;
            default:
                System.out.println("This letter is a thin vowel.");
        }
    }
}
