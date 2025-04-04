def call(){
    sh "trivy fs ."
}

// Jenkins Pipeline Code
// stage('Trivy: Filesystem Scan'){
//     steps{
//         script{
//             trivy_scan()
//         }
//     }
// }