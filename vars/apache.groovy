call(Map pipelineParams){
  pipeline{
    agent {
      label pipelineParams.agent
    }
    stages {
        stage('Build Process') {
         steps {
              script {
              gitUtils.checkout(pipelineParams.infrastructureManagementUri, pipelineParms.infrastructureMangementBranch)

              }

            script {
         sh " echo hello world"
         }
         }
        }
    }
  }
