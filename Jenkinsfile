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
                sh "docker build -t djoum1983/serge ."
            }
        }
        stage("login to docker"){
            steps{
                sh 'echo dckr_pat_uoj3q_epmVruUblgnoKYSQo1emI | docker login -u djoum1983 --password-stdin '
            }
        }
        stage("push image in docker"){
            steps{
                sh  "docker push djoum1983/serge"
            }
        }


    }
}
