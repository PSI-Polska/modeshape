
pipeline {
    agent any

    options {
        disableConcurrentBuilds(abortPrevious: true)
        timeout(activity: true, time: 10, unit: 'MINUTES')
    }

    tools {
        maven 'DEFAULT'
        jdk 'JDK 8 Corretto'
    }

    stages {
        stage('Install') {
            steps {
                script {
                    sh "mvn -B clean install"
                }
            }
        }
    }
}
