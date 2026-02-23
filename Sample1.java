pipeline {
    agent any

    stages {

        stage('Checkout') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/23p61a05e6/devops.git',
                    credentialsId: 'github-token'
            }
        }

        stage('Build') {
            steps {
                sh 'javac Sample1.java'
            }
        }

        stage('Run') {
            steps {
                sh 'java sample'
            }
        }

        stage('Deploy') {
            steps {
                echo 'Deploying the job'
            }
        }
    }
}
