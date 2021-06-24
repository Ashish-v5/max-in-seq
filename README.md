## Find the maximum integer in sequence

You are given an integer sequence represented as **values inputted from console**. 
The task is to **find maximum value** of the given sequence. 

The correctness of the task will be checked using tests.

There are two classes:

1) [`com.epam.rd.autotasks.sequence.FindMaxInSeq`](src/main/java/com/epam/rd/autotasks/sequence/FindMaxInSeq.java) - class for you to write code. Contains methods:
    - `max` - **returns** the result of the multiplication of the given matrices integer array (matrix). You must provide the functionality to input values from the console, using `Scanner.class`:
        ```java
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        ```
    - `main` - method for you to run your code locally.
    
2) [`com.epam.rd.autotasks.sequence.FindMaxInSeqTests`](src/test/java/com/epam/rd/autotasks/sequence/FindMaxInSeqTests.java) - class for testing your code. It contains several tests you can run using:
    ```console
    $ mvn clean test
    ```
    To run particular test go to the [`FindMaxInSeqTests.class`](src/test/java/com/epam/rd/autotasks/sequence/FindMaxInSeqTests.java), choose the test and run command:
    ```console
    $ mvn clean test -Dtest=MultiplyMatrixTests#<test_name>
    ```

> **Note:** 
>- You can't use third-party libraries to solve this task;
>- The sequence guaranteed to contain at least one value;
>- You have to install Maven locally to run tests. You can download Maven from [download page][maven-download].

Example

    Input: 2 4 6 9 2 4 5 0 (0 - is the end of sequence)

    Output: 9 (max)
    
[maven-download]: https://maven.apache.org/download.cgi