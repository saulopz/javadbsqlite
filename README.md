# Utilização

## Download e Instalação do SQLite

### Windows

<https://www.sqlite.org/download.html>

### Linux Debian/Ubuntu

sudo apt-get install sqlite

## Download do Driver

<https://github.com/xerial/sqlite-jdbc>

É importante usar a mesma versão do sqlite e do driver.

## Importar

import java.sql.*;

## Compilar

javac Programa.java

## Executar

java -classpath .;sqlite-jdbc-(VERSION).jar Programa

Substitua (VERSION) pela versão do driver que você fizer download.
