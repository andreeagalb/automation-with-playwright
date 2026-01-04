# Here is the system setup

I started with installing Java
https://wiki.archlinux.org/title/Java

Then I run some installing Java commands using the terminal for Arch Linux endevour
1. Update your system:
Bash

sudo yay -Syu

2. Check installed versions
archlinux-java status

3. Verify the installation:

java -version
javac -version

Install Build Tools (Maven & Gradle)

sudo yay -S maven
mvn -version
java -version

 Create Your Project Folder in VS
It is best to keep your code organized.
1. Open your terminal and create a folder: mkdir ~/java_projects && cd ~/java_projects
2. Open this folder in VS Code: code .
In Java, the compiler is very strict about organization. Unlike some other languages (like Python or C), Java has a "One Public Class per File" rule.
Here is exactly what that means in practice:
1. The Rule
If your code inside the file looks like this:
public class MyFirstProgram { // ... code ... }

Then your file must be named: MyFirstProgram.java


Playwright

Maven projects follow a specific structure. The pom.xml is like the "instruction manual" for your project. If you run a Maven command outside of the folder containing that manual, Maven gets confused because it doesn't know which dependencies or settings to use.

In a Maven project, the pom.xml (Project Object Model) is the most important file. It’s where you tell Java:
1. What libraries you need (like Playwright).
2. What version of Java you are using.
3. How to build your project.
By running code pom.xml, you are quickly jumping from the terminal into the editor so you can paste the Playwright settings we discussed.

 How to run this on your Arch Linux

Save the code in: src/test/java/com/example/class_name.java

Open your terminal in the playwright-demo folder.

 Run:
mvn test


