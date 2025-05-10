# Notification System

## Overview

This system is designed to send various types of notifications (Email, SMS, Push) using key object-oriented design patterns to promote scalability and maintainability.

---

## Design Patterns Used

### ✅ Singleton Pattern – `NotificationConfig`

**Purpose**: Ensures a single instance of configuration is used throughout the system.

**Responsibilities**:
- Holds global settings such as:
    - Sender name
    - Default priority

---

### ✅ Factory Pattern – `NotificationFactory`

**Purpose**: Returns the appropriate `Notification` implementation based on input.

**Notification Types**:
- `EmailNotification`
- `SMSNotification`
- `PushNotification`

**Benefit**: Decouples the client from specific notification classes.

---

### ✅ Builder Pattern – `MessageBuilder`

**Purpose**: Constructs a message step-by-step with customizable components.

**Message Components**:
- Title
- Body
- Priority

**Benefit**: Builds complex message objects with ease and readability.