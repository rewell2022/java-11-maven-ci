pipeline{
    agent any
    environment{
        DOCKERHUB=credentials("dockerhub")
    }
    stages {
        stage ("build"){

            steps{
                sh "./mvnw clean install package -DskipTests"
            
            }
        }
        stage("build docker image"){
            steps{
                sh "docker build -t djoum1983/serge ."
            }
        }
        stage("login to docker"){
            steps{
                sh 'echo $DOCKERHUB_PSW | docker login -u $DOCKERHUB_USR --password-stdin '
            }
        }
        stage("push image in docker"){
            steps{
                sh  "docker push djoum1983/serge"
            }
        }


    }
}
