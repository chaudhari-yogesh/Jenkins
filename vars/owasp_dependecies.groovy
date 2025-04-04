def call(){
    dependecyCheck additionalArguments: '--scan ./', odcInstallation: 'OWASP'
    dependecyCheckPublisher pattern: '**/dependecy-check-report.xml'
}



// Jenkins Pipeline Code
// stage('OWASP: Dependecies Check'){
//     steps{
//         script{
//             owasp_dependecies()
//         }
//     }
// }