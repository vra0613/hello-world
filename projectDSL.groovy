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
   steps {
     maven ('clean install', 'hello-world/pom.xml')
   }
}
