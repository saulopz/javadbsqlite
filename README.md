# USO

## DOWNLOAD E INSTALAÇÃO DO SQLITE

### Windows

https://www.sqlite.org/download.html

### Linux Debian/Ubuntu

sudo apt-get install sqlite

## DOWNLOAD DRIVER

https://github.com/xerial/sqlite-jdbc

É importante usar a mesma versão do sqlite e do driver.

## IMPORTAR

import java.sql.*;

## COMPILAR

javac Programa.java

## EXECUTAR

### Windows

java -classpath ".;sqlite-jdbc-(VERSION).jar" Programa

### Linux

java -classpath ".:sqlite-jdbc-(VERSION).jar" Programa
