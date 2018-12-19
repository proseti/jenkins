pipeline {
    agent {    
        label 'eeacms'
    }
//    agent any

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
                sh 'whoami'
            }
        }
        stage('mkdir permissions') {
            steps {
                sh 'mkdir /test'
            }
        }
//        stage('Apache2 install') {
//            steps {
//                script {
//                    if (sh ('find /etc/init.d/* apache2') ) {
//                        sh 'apt-get remove -y apache2'
//                        sh 'apt-get purge -y apache2'
//                    } else {
//                        sh 'apt-get install -y apache2'
//                    }
//                }
//            }
//        }
        stage('Sleep') {
           steps {  
               sleep 1   
//                   sh '/etc/init.d/apache2 start'
           }
        }
        stage('Test') {
            steps {
//                script {
                    sh  ''' #!/bin/bash
                        if [[ `ss -tlpn | grep 335` ]]; then
                            echo 'wygrales' 
                        else 
                            echo 'przegrales usluga jeszcze nie zostala zainstalowana'
                        fi
                    '''
//                }   
            }
        }
    }
}
