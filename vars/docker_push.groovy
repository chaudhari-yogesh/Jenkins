def call(String Project, String ImageTag, String DockerHubUser){
    withCredentials([usernamePassword(credentialsId: 'docker', passwordVariable: 'dockerhubpass', usernameVariable: 'dockerhubuser')]){
        sh "sudo docker login -u ${dockerhubuser} -p ${dockerhubpass}"
    }

    sh "sudo docker push ${dockerhubuser}/${Project}:${ImageTag}"
}

// Optimized Version
// def call(String Project, String ImageTag){
//     withCredentials([usernamePassword(credentialsId: 'docker', passwordVariable: 'dockerhubpass', usernameVariable: 'dockerhubuser')]){
//         sh "sudo docker login -u ${dockerhubuser} -p ${dockerhubpass}"
//         sh "sudo docker push ${dockerhubuser}/${Project}:${ImageTag}"
//     }
// }


// Jenkins Pipeline Code
// stage('Docker: Build Image'){
//     steps{
//         script{
//             docker_build("Yogesh", "MyProject", "lastest")
//         }
//     }
// }