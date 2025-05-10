# Document Viewer App

## Overview

This project is a **Document Viewer App** designed using Object-Oriented Design Patterns to provide a flexible, extensible, and easy-to-use document viewing experience.

### Features

1. **Supports multiple file formats** – such as PDF and Word documents.
2. **Text formatting options** – including **Bold** and *Italic*.
3. **Simplified client interface** – via a `ViewerFacade`.

---

## Design Patterns Used

### ✅ Adapter Pattern

**Purpose**: Unifies access to different document formats (e.g., PDF, Word) through a common interface.

**Benefit**: Enables the app to support new document types without altering the core logic.

---

### ✅ Decorator Pattern

**Purpose**: Dynamically adds formatting options such as Bold and Italic to document content.

**Benefit**: Allows flexible and reusable formatting without modifying the base document structure.

---

### ✅ Facade Pattern

**Purpose**: Exposes a simple `ViewerFacade` interface to the client.

**Benefit**: Hides the complexity of document reading and formatting behind a single, easy-to-use API.