public class DecoratorDriver {
    public static void main(String[] args) {
        // Create a simple EmailNotifier
        Notifier emailNotifier = new EmailNotifier();

        // Decorate the EmailNotifier with SMSNotifier
        Notifier smsAndEmailNotifier = new SMSNotifierDecorator(emailNotifier);

        // Decorate the SMSNotifier with SlackNotifier
        Notifier allNotifier = new SlackNotifierDecorator(smsAndEmailNotifier);

        // Send notification using the decorated notifier
        allNotifier.send("This is a test notification.");
    }
}
