
def call(String SonarQubeAPI, String ProjectName, String ProjectKey){
    timeout(time: 1, unit: "MINUTES"){
        waitForQualityGate abortPipeline: False
    }
}



// Jenkins Pipeline Code
// stage('SonarQube: Code Quality Gates'){
//     steps{
//         script{
//             sonarqube_code_quality()
//         }
//     }
// }