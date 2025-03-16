pipeline {
    agent any

    tools {
        maven "MAVEN3"  // Ensure Maven is configured in Jenkins Global Tool Configuration
        				
    }

    stages {
        stage('Build') {
            steps {
                // Checkout the code from your GitHub repository
                git branch: 'main', url: 'https://github.com/awaypotato123/ci-cd-pipe-app.git'

                // Run Maven build
                sh "mvn -Dmaven.test.failure.ignore=true clean package"
            }

            post {
                success {
                    // Record test results
                    junit '**/target/surefire-reports/TEST-*.xml'

                    // Archive the built jar file
                    archiveArtifacts 'target/*.jar'
                }
            }
        }
    }
}

