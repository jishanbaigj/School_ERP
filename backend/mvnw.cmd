@echo off
REM Simple local Maven wrapper that forces a known local JDK (Java 25) and uses a known local Maven installation if present.
SET JAVA_HOME=C:\Users\HP\AppData\Local\jdks\jdk-25.0.2
SET MAVEN_HOME=C:\Users\HP\.maven\maven-3.10.0-rc-1
SET PATH=%JAVA_HOME%\bin;%MAVEN_HOME%\bin;%PATH%
IF EXIST "%MAVEN_HOME%\bin\mvn.cmd" (
  "%MAVEN_HOME%\bin\mvn.cmd" %*
) ELSE (
  mvn %*
)
