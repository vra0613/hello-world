job('Project Build-DSL') {
  description("Maven Build Project using Job DSL")
  scm {
    git {
          branch('master')
          remote {
                  url ("https://github.com/vra0613/hello-world.git")
                  credentials ("GITHUB")
                }
            }
        }
  triggers {
    scm('* * * * *')
    }
  steps {
    maven('clean package', 'maven-samples/single-module/pom.xml')
    }
  publishers {
    //archive the war file generated
    archiveArtifacts '**/*.jar'
    }
}
