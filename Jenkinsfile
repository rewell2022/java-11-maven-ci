pipeline{
    agent any
    stages {
        stage ("build"){
            steps{
                sh "./mvnw clean install package -DskipTests"
            }
        }

    }
}
