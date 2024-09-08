#! /usr/bin/bash

echo "Copy libs and files";
cp logo.png target/;
cp -r lib/ target/;
mkdir output
echo "Using Jpackage...";
jpackage --type deb --input ./target --dest ./output --main-jar ./MaoPass-1.0.jar --main-class Main --module-path "/home/maosmani/Lib/javafx-jmods-21.0.4/" --add-modules javafx.controls,javafx.fxml --name MaoPass  --linux-shortcut --install-dir /opt --linux-menu-group Utility  --icon ./target/logo.png --name "MaoPass";
