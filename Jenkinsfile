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
        stage('Apache2 install') {
            steps {
                sh 'apt-get install -y apache2'
            }
        }
        stage('Start') {
           steps {     
                   sh '/etc/init.d/apache2 start'
           }
        }
        stage('Test') {
            steps {
                script {
                    if (sh ('ss -tlpn | grep 80') ) {
                        echo 'wygrales' 
                    } else {
                        echo 'przegrales usluga jeszcze nie zostala zainstalowana'
                    }
                }    
            }
        }
    }
}
