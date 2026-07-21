# EduSphere – Smart School ERP

This workspace contains a starter full-stack foundation for a Smart School ERP system.

## Stack
- Frontend: Flutter
- Backend: Spring Boot 3 + Java 21
- Database: H2 (dev), MySQL-ready configuration
- Auth: Spring Security + JWT-ready foundation

## Structure
- backend/: Spring Boot backend
- mobile/: Flutter mobile app

## Run backend
```bash
cd backend
mvn spring-boot:run
```

Open:
- http://localhost:8080/swagger-ui.html
- http://localhost:8080/h2-console

## Run mobile app
```bash
cd mobile
flutter pub get
flutter run
```

## Planned modules
- Admin, Teacher, Student, Parent
- Attendance, results, homework, assignments, fees, library, transport
- Notifications, chat, complaints, leave management
- AI insights, analytics, QR attendance, PDF reports
