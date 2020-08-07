pipelineJob('Pipeline Basic Job') {

  def repo = 'https://github.com/px-male/devops_sample_nodejs_2.git'

  description("Pipeline for $repo")

  triggers {
    scm('H/5 * * * *')
  }

  definition {
    cpsScm {
      scm {
        git {
          remote { url(repo) }
          branches('master')
          scriptPath('misc/Jenkinsfile')
          extensions { }
        }
      }
    }
  }
}
