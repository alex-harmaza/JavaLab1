Create .jar for Windows

1. Compile source code:
    command: cd /d <project folder path>/src/main/java/com/epam/lab1
    command: javac -d <compile result folder path> task9/entity/*.java
    command: javac -d <compile result folder path> -cp <compile result folder path> task9/*.java
    command: java -cp <compile result folder path> com/epam/lab1/task9/Task9Main

2. Create .jar file
    command: cd /d <compile result folder path>
    command: jar cvfe <Result jar file path> com/epam/lab1/task9/Task9Main com/epam/lab1/task9/entity/*.class com/epam/lab1/task9/*.class
    command: java -jar <result file path>