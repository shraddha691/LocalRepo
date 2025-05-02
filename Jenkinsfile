pipeline {
    agent any

    tools {
        jdk 'JDK17'
    }

    stages {
        stage('Build') {
            steps {
                echo 'Compiling Java code...'
                sh 'mkdir -p out && javac -cp "lib/*" -d out $(find src -name "*.java")'
            }
        }
        stage('Test') {
            steps {
                echo 'Running tests...'
                sh 'javac -cp "lib/*:out" -d out $(find test -name "*.java")'
                sh 'java -cp "out:lib/*" org.junit.runner.JUnitCore com.example.MainTest'
            }
        }
    }
}

