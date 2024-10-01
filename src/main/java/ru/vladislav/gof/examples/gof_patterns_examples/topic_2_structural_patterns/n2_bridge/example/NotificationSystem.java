package ru.vladislav.gof.examples.gof_patterns_examples.topic_2_structural_patterns.n2_bridge.example;

/**
 * @author Vladislav
 */
public class NotificationSystem {

    // Интерфейс для отправки уведомлений через разные каналы
    public interface NotificationSender {
        void send(String message);
    }

    // Реализация отправки СМС
    public static class SmsSender implements NotificationSender {
        @Override
        public void send(String message) {
            System.out.println("Sending SMS: " + message);
        }
    }

    // Реализация отправки email
    public static class EmailSender implements NotificationSender {
        @Override
        public void send(String message) {
            System.out.println("Sending Email: " + message);
        }
    }

    // Реализация отправки пуш-уведомлений
    public static class PushNotificationSender implements NotificationSender {
        @Override
        public void send(String message) {
            System.out.println("Sending Push Notification: " + message);
        }
    }

    // Абстракция для уведомлений
    public abstract static class Notification {
        protected NotificationSender sender;

        public Notification(NotificationSender sender) {
            this.sender = sender;
        }

        public abstract void notifyUser(String message);
    }

    // Важное уведомление
    public static class ImportantNotification extends Notification {
        public ImportantNotification(NotificationSender sender) {
            super(sender);
        }

        @Override
        public void notifyUser(String message) {
            sender.send("IMPORTANT: " + message);
        }
    }

    // Обычное уведомление
    public static class RegularNotification extends Notification {
        public RegularNotification(NotificationSender sender) {
            super(sender);
        }

        @Override
        public void notifyUser(String message) {
            sender.send("Regular: " + message);
        }
    }

    // Пример использования
    public static void main(String[] args) {
        // Отправка важного уведомления через СМС
        Notification importantSms = new ImportantNotification(new SmsSender());
        importantSms.notifyUser("Server is down!");

        // Отправка обычного уведомления через Email
        Notification regularEmail = new RegularNotification(new EmailSender());
        regularEmail.notifyUser("Your order has been shipped.");

        // Отправка важного уведомления через пуш-уведомление
        Notification importantPush = new ImportantNotification(new PushNotificationSender());
        importantPush.notifyUser("Security breach detected!");
    }
}
