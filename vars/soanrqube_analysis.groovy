
def call(String SonarQubeAPI, String ProjectName, String ProjectKey){
    withSonarQubeEnv("${SonarQubeAPI}"){
        sh "$SONAR_HOME/bin/sonar-scanner -Dsonar.projectName=${ProjectName} -Dsonar.projectKey=${ProjectKey} -X"
    }
}



// Jenkins Pipeline Code
// stage('SonarQube: Code Analysis'){
//     steps{
//         script{
//             sonarqube_analysis("Sonar", "wanderlust", "wanderlust")
//         }
//     }
// }