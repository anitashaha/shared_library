def call(){

pipeline {
    agent any

    stages {
        
            
        stage('terraform init') {
            steps {
                sh 'cd test; terraform init'
            }
        }
        
        stage('terraform apply') {
            steps {
                sh 'cd test; terraform apply -auto-approve'
            }
        }
    }
}
}