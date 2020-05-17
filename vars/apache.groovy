call(Map param){
  pipeline{
    agent {
      label pipelineParams.agent
    }
    stages {
        stage('Build Process') {
         steps {
              script {
              gitUtils.checkout(params.url, pipelineParms.branch)

              }

            script {
         sh " echo hello world"
         }
         }
        }
    }
  }
