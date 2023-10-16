pipeline {
    agent {
        kubernetes {
          yamlFile 'deploy/kubernetes-pod.yaml'
        }
    }
    stages {
        stage('Build') {
            steps {
                container('maven') {
                    sh 'mvn clean package -DskipTests'
                }
            }
        }
        stage('Test') {
            steps {
                container('maven') {
                    sh 'mvn test'
                }
            }
        }
        stage('Install') {
            steps {
                container('maven') {
                    sh 'mvn install'
                }
            }
        }
    }
}
