pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        withGradle() {
          sh 'gradle -b build'
        }

      }
    }

    stage('Test') {
      steps {
        withGradle() {
          sh 'gradle -b test'
        }

      }
    }

  }
}