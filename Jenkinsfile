
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

    parameters {
             booleanParam(name: 'RELEASE_FLAG', defaultValue: false, description: 'Release new version.')
    }

    stages {
        stage('Install') {
            when {
                expression {
                    params.release == false
                }
            }
            steps {
                script {
                    sh "mvn -B clean install -DskipTests"
                }
            }
        }
        stage('Deploy') {
            when {
                expression {
                    params.release == true
                }
            }
            steps {
                script {
                        sh "mvn -B clean deploy -P TPF -DskipTests"
                    }
                }
            }
    }
}
