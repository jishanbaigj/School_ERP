@echo off
REM Simple local Maven wrapper that uses a known local Maven installation if present.
SET MAVEN_HOME=C:\Users\HP\.maven\maven-3.10.0-rc-1
IF EXIST "%MAVEN_HOME%\bin\mvn.cmd" (
  "%MAVEN_HOME%\bin\mvn.cmd" %*
) ELSE (
  mvn %*
)
