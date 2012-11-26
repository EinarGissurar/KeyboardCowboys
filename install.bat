@ECHO OFF

:: Hugb�na�arfr��i
:: 2012 (c) Keyboard Cowboys


ECHO The install execution is under the assumption that
ECHO JDK 1.6 or higher is installed along with Ant version 1.8.2

pause

ECHO 
ECHO Building project...

ant -buildfile Project2/build.xml build

ECHO Building system is complete
pause
