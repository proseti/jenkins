- job:
    name: testowy-zseeda-job
    project-type: pipeline
    pipeline-scm:
      scm:
        - seti-jenkins:
            url: https://github.com/proseti/jenkins/blob/master/
            clean: true
      script-path: Jenkinsfile.groovy
      lightweight-checkout: true
