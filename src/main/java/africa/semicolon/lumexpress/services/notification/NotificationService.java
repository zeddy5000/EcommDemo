package africa.semicolon.lumexpress.services.notification;

import africa.semicolon.lumexpress.data.dtos.requests.NotificationRequest;

public interface NotificationService {
    String sendNotification(NotificationRequest request);
}
