package africa.semicolon.lumexpress.services.notification;

public interface EmailSender {
    String sendHtmlMail(EmailDetails emailDetails);
}
