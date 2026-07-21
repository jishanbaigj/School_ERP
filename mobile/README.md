# EduSphere Mobile

## Prerequisites

- Flutter SDK installed
- Android Studio or VS Code (with Flutter extension)
- Android SDK configured (for emulators/devices)

## Run

### Windows

```powershell
cd mobile
.\run_flutter.bat
```

### Linux / macOS

```bash
cd mobile
chmod +x run_flutter.sh
./run_flutter.sh
```

## Backend URL
- Android emulator: http://10.0.2.2:8080
- Physical device: http://<YOUR_PC_IP>:8080

## Notes

- Make sure `mobile/pubspec.yaml` uses valid package versions (e.g. `shared_preferences: ^2.5.5`).
- If `flutter pub get` fails, run `flutter --version` and `flutter doctor -v` to check your SDK installation.
- For emulator networking, use `10.0.2.2` to reach the host machine's `localhost`.

## Quick troubleshooting

- If you see "Waiting for another flutter command to release the startup lock", terminate other Flutter/Dart processes or restart VS Code.
