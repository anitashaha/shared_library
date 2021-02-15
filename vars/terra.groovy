def call () {

pipeline {
    agent any

    stages {
                    
        stage('terraform init') {
            steps {
                sh 'cd test1; terraform init'
            }
        }
        
        stage('terraform apply') {
            steps {
                sh 'cd test1; terraform apply -auto-approve'
            }
        }
    }
}
}