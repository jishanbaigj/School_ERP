#!/usr/bin/env bash
set -e
cd "$(dirname "$0")"
echo "Running flutter clean..."
flutter clean
echo "Running flutter pub get..."
flutter pub get
echo "Starting Flutter app..."
flutter run
