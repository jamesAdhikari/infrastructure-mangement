call(Map param){
  pipeline{
    agent {
      label params.agent
    }
    stages {
        stage('Build Process') {
         steps {
              script {
              gitUtils.checkout(params.url, params.branch)

              }

            script {
         sh " echo hello world"
         }
         }
        }
    }
  }
