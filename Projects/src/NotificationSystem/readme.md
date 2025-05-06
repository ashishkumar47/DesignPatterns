Requirements

1. Singleton design pattern -> NotificationConfig
Holds system wide config like sender name, default priority
2. Factory design pattern -> NotificationFactory
Returns correct notification implementation based on input
a. EmailNotification
b. SMSNotification
c. pushNotification
3. Builder design pattern -> MessageBuilder
Build message based on
a. title
b. body
c. Priority