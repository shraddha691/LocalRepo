pipeline {
    agent any
    stages {
        stage('Clone') {
            steps {
                git 'https://github.com/your-username/your-repo.git'
            }
        }
        stage('Build') {
            steps {
                echo 'This is where the build would happen if you had one.'
            }
        }
        stage('Test') {
            steps {
                echo 'Pretend tests are running here.'
            }
        }
    }
}
