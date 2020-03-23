# Word Length
Longest and Shortest words in a sentence.



## Prerequisites
* [Java 8](https://www.oracle.com/java/technologies/javase-jdk8-downloads.html)
* [Maven 3.6.3](https://maven.apache.org/download.cgi)

## How to
From project root

1. Run all tests
`mvn test`

2. Run longest word test
'mvn -Dtest=WordLengthTests#longestWordInSentence test'

3. Run shortest word test
'mvn -Dtest=WordLengthTests#shortestWordInSentence test'

## Assumptions
1. Asserting word and length in single assert statement.
2. No data protection required.

## Libraries and Plugins
* Test Framework - _Junit_
* Test execution and reporting - _Maven-Sure-Fire_