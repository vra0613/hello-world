job('Project Build-DSL') {
  description("Maven Build Project using Job DSL")
  scm {
    checkout scmGit(branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[credentialsId: 'GITHUB', url: 'https://github.com/vra0613/hello-world.git']])
  }
}
