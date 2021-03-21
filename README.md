# java-console-sale-2

This project is in console mode.
This project using Maven.

## Prerequisites 🔨

1. Install Windows 10 or linux.

## Installation 🔧

1. Install windows or linux.
2. Install java 8 (1.8.0_201)
3. Install Maven

## Deploy 🚀

1. Clone project.
```
git clone https://github.com/10micky10/java-console-sale-2.git
```

Enter to project and execute the followings commands:

2. Compile:

```
mvn compile
```

3. Generate jar:

```
mvn package
```

4. Init program:

```
java -jar target/java-console-sale-2-1.0-SNAPSHOT.jar
```

5. Login:

```
Enter with: userName = micky password = micky123
```

### checkstyle

Execute:

```
mvn checkstyle:check
```

### Command to Generate a Maven Project:

```
mvn archetype:generate -DgroupId="nombre de carpeta".com."nombre de carpeta" -DartifactId="nombre de la carpeta principal" -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false
```

## Documentation

## Diagrams

### Class Diagram

<p align="center">
  <img src="documentation/class-diagram.jpg">
</p>

### Use Case Diagram

<p align="center">
  <img src="documentation/use-case-diagram.jpg">
</p>
