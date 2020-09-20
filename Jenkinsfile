pipeline {
  agent any
  stages {
    stage('Clean') {
      steps {
        sh 'gradle clean -b pipeline-demo/build.gradle'
      }
    }

    stage('Bulild') {
      steps {
        withGradle() {
          sh 'gradle build -b pipeline-demo/build.gradle'
        }

      }
    }

    stage('Test') {
      parallel {
        stage('Unit Tests') {
          steps {
            sh 'gradle test -b pipeline-demo/build.gradle'
          }
        }

        stage('Code Quality') {
          environment {
            sonarUrl = 'http://localhost:9000'
            sonarToken = '0c0b3b61dddfd26b0b88d90aef908318951538fd'
          }
          steps {
            sh 'gradle sonarqube -b pipeline-demo/build.gradle -D sonarUrl=${sonarUrl} -D sonarToken=${sonarToken}'
          }
        }

        stage('Coverage') {
          steps {
            sh 'gradle jacocoTestReport -b pipeline-demo/build.gradle'
          }
        }

      }
    }

    stage('Promotion') {
      steps {
        timeout(time: 1, unit: 'DAYS') {
          input 'Deploy to Production?'
        }

      }
    }

    stage('Migration') {
      steps {
        sh 'echo'
      }
    }

    

    stage('Deploy') {
      steps {
        sh 'echo'
      }
    }

  }
}