
pipeline {
    agent any

    options {
        skipDefaultCheckout(true)
    }

    stages {
        stage('get') {
            steps {
                checkout scm
                echo 'Code downloaded'
            }
        }

        stage('build') {
            steps {
                sh 'mvn -B -DskipTests package'
            }
        }

        stage('test') {
            steps {
                sh 'mvn -B test'
            }
        }
    }

    post {
        always {
            junit allowEmptyResults: true,
                  testResults: '**/target/surefire-reports/*.xml'
        }

        success {
            echo 'CI success'
        }

        failure {
            echo 'CI failed'
        }
    }
}

