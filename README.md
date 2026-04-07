# Experiment 7: Role-Based Authorization using Spring Boot

## 🎯 Objective

To implement Role-Based Access Control (RBAC) in a Spring Boot application using Spring Security and test APIs using Postman.

---

## 🛠️ Technologies Used

* Java
* Spring Boot
* Spring Security
* Maven
* VS Code
* Postman

---

## 🔐 Features Implemented

### 1. Authentication

* Users login using Basic Authentication
* In-memory users:

  * user1 (ROLE_USER)
  * admin1 (ROLE_ADMIN)

### 2. Authorization

* Role-based API access control:

  * `/api/public/**` → Public
  * `/api/user/**` → USER, ADMIN
  * `/api/admin/**` → ADMIN only

---

## 🌐 API Endpoints

| Endpoint             | Method | Access      | Description              |
| -------------------- | ------ | ----------- | ------------------------ |
| /api/public/hello    | GET    | Public      | Accessible without login |
| /api/user/profile    | GET    | USER, ADMIN | Requires authentication  |
| /api/admin/dashboard | GET    | ADMIN       | Restricted access        |

---

## 🧪 Testing using Postman

### ✅ Case 1: Public API

* URL: `/api/public/hello`
* Result: 200 OK

### ✅ Case 2: USER accessing User API

* Login: user1 / user123
* URL: `/api/user/profile`
* Result: 200 OK

### ❌ Case 3: USER accessing Admin API

* Login: user1 / user123
* URL: `/api/admin/dashboard`
* Result: 403 Forbidden

### ✅ Case 4: ADMIN accessing Admin API

* Login: admin1 / admin123
* URL: `/api/admin/dashboard`
* Result: 200 OK

### ❌ Case 5: No Authentication

* URL: `/api/user/profile`
* Result: 401 Unauthorized

---

## 📸 Screenshots

Screenshots include:

* Public API response (Postman)
* USER access success
* USER access denied (403 Forbidden)
* ADMIN access success

---

## 📁 Project Structure

src/
├── main/
│   ├── java/com/example/experiment_7/
│   │   ├── config/
│   │   │   └── SecurityConfig.java
│   │   ├── controller/
│   │   │   ├── PublicController.java
│   │   │   ├── UserController.java
│   │   │   └── AdminController.java
│   │   └── Experiment7Application.java
│   └── resources/
│       └── application.properties

---

## 🧠 Conclusion

This experiment demonstrates how Spring Security can be used to implement authentication and role-based authorization. Postman was used to test APIs and verify access control.

---

## ❓ Viva Questions

### What is RBAC?

Role-Based Access Control restricts access based on user roles.

### Difference between 401 and 403?

* 401 Unauthorized → User not authenticated
* 403 Forbidden → User authenticated but not authorized

### What is Spring Security?

A framework used for securing applications by handling authentication and authorization.
