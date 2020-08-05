job('NodeJS Job') {
    scm {
        git('https://github.com/px-male/devops_sample_nodejs_2.git') {  node ->
            node / gitConfigName('DSL User')
            node / gitConfigEmail('jenkins-dsl@example.com')
        }
    }
    triggers {
        scm('H/5 * * * *')
    }
    wrappers {
        nodejs('nodejs_v11')
    }
    steps {
        shell("npm install")
        shell("npm test")
    }
}
