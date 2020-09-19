pipeline {
  agent any
  stages {
    stage('Clean') {
      steps {
        withGradle() {
          sh 'gradlew clean -b pipeline-demo/build.gradle'
        }

      }
    }

    stage('Bulild') {
      steps {
        withGradle() {
          sh 'gradlew build -b pipeline-demo/build.gradle'
        }

      }
    }

    stage('Test') {
      steps {
        sh 'gradlew test -b pipeline-demo/build.gradle'
      }
    }

  }
}