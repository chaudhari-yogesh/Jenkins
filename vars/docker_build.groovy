def call(String DockerHubUser, String ProjectName, String ImageTag){
    sh "sudo docker build -t ${DockerHubUser}/${ProjectName}:${ImageTag} ."
}

// Jenkins Pipeline Code
// stage('Docker: Build Image'){
//     steps{
//         script{
//             docker_build("Yogesh", "MyProject", "lastest")
//         }
//     }
// }