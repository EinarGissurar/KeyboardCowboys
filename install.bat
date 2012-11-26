@ECHO OFF

:: Hugbúnaðarfræði
:: 2012 (c) Keyboard Cowboys


ECHO The install execution is under the assumption that
ECHO JDK 1.6 or higher is installed.
ECHO The directory of ANT should be placed in the same
ECHO directory as the install file.

pause

ECHO 
ECHO Building project...

ant -buildfile Project2/build.xml build

ECHO Building system is complete
pause
