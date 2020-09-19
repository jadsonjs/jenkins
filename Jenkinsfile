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
          steps {
            sh 'echo'
          }
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