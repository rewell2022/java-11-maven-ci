pipeline{
    agent any
    stages {
        stage ("build"){

            steps{
                sh "./mvnw clean install package -DskipTests"
            
            }
        }
        stage("build docker image"){
            steps{
                sh "docker build -t serge ."
            }
        }

    }
}
