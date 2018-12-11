pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh 'mkdir /home/jenkins/lama1'
            }
        }
        stage('Test') {
            steps {
                /* `make check` returns non-zero on test failures,
                * using `true` to allow the Pipeline to continue nonetheless
                */
                sh 'touch /home/jenkins/lama1/dupa2'
            }
        }
        stage('Deploy') {
           steps {
                   echo 'wygrales' 
            }
            }
        }
    }

