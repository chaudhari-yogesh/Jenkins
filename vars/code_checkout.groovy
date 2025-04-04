def call(String GitUrl, String GitBranch){
    git url: "${GitUrl}" branch: "${GitBranch}"
}


// Jenkins Pipeline Code
// stage('Git: Code Checkout'){
//     steps{
//         script{
//             code_checkout("repo-url", "main")
//         }
//     }
// }