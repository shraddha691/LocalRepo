pipeline {
    agent any

    tools {
        jdk 'JDK17'
    }

    stages {
        stage('Build') {
            steps {
                sh 'javac -d out -cp "lib/*" $(find src -name "*.java")'
            }
        }
        stage('Test') {
            steps {
                sh 'javac -cp "lib/*:out" -d out $(find test -name "*.java")'
                sh 'java -cp "out:lib/*" org.junit.runner.JUnitCore com.example.MainTest'
            }
        }
    }
}

