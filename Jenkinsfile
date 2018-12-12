pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh 'rm -rf /home/jenkins/lama1'
                sh 'mkdir -p /home/jenkins/lama1'
            }
        }
        stage('Build02') {
            steps {
                /* `make check` returns non-zero on test failures,
                * using `true` to allow the Pipeline to continue nonetheless
                */
                sh 'rm -rf /home/jenkins/lama1/dupa2'
                sh 'touch /home/jenkins/lama1/dupa2'
            }
        }
        stage('Apache2 install') {
            steps {
                sh 'apt-get remove -y apache2'
                sh 'apt-get purge -y apache2'
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
