pipeline {
    agent any 
    stages {
        stage ('Build') {
            environment {
                // This directive supports a special helper method credentials() 
               GITHUB_CREDS = credentials('i27devopsb2_git_creds') // username and passwd
               SONAR_CREDS = credentials('sonar_creds')
            }
            steps {
                echo "My Github Credentials are ${GITHUB_CREDS}"
                echo "My UserName is: ${GITHUB_CREDS_USR}"
                echo "My Password is: ${GITHUB_CREDS_PSW}"
                // mvn sonar:sonar -D ${SONAR_CREDS}
            }
        }
    }
}


// can this be achived manually... 
// any mnaual taks can be achievable in jenkins 
// mail ===> 




/*
jenkins > credentials > usernmae/passwoord > id

docker login -u usernmae -p password 



withCredentials([usernamePassword(credentialsId: 'i27devopsb2_docker_creds', passwordVariable: 'DOCKER_PASSWORD', usernameVariable: 'DOCKER_USERNAME')]) {
    // some block
    docker login -u ${DOCKER_USERNAME} -p ${DOCKER_PASSWORD}
}
*/