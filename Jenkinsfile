pipeline {
  agent any
  stages {
    stage('Clean') {
      steps {
        withGradle() {
          sh 'gradle clean -b pipeline-demo/build.gradle'
        }

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
      steps {
        sh 'gradle test -b pipeline-demo/build.gradle'
      }
    }

  }
}