# calculator

Calculator API that allows to calculate different arithmetic operations.

# How to generate the JAR file of the application

I used IntelliJ to follow this guide.

1. Go to File -> Project structure
2. Go to the Artifacts section
3. Click on + -> JAR -> From modules with dependencies…
4. Finally, we will create the JAR file on Build -> Build artifacts
5. We will found the JAR file on out/artifacts/MakeReport_jar/MakeReport.jar

# How to execute the JAR file

First of all we need to execute our file using the following command: java -jar calculator.jar

After that, we can use the browser of Postman to try the calculator, an example of a valid call is:

http://localhost:8080/operations/calculate?value1=3&operator=add&value2=3



