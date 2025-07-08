public class MailService {
    public static void sendEbook(String email, String title, String fileType) {
        System.out.println("Sending " + title + " (" + fileType + ") to " + email);
    }
}