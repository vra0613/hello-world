job('Project Build-DSL') {
  description("Maven Build Project using Job DSL")
  scm {
    git("https://github.com/vra0613/hello-world.git", master)
  }
  trigger {
    scm('*****')
  }
  steps {
    maven('clean package install', 'hello-world/pom.xml')
  }
  publishers {
    archiveArtifacts '**/*.jar'
  }
}
