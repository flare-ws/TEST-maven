node('master') {

    step([$class: 'WsCleanup'])

    try {

        stage('Get sources') {
            SCMGetPlaybook: {
                dir ("app_deploy") {
                    git branch: "master", changelog: true, poll: true, url: 'https://github.com/flare-ws/TEST-maven.git'
                }
            }
        }

        currentBuild.result = 'SUCCESS'

    } catch(err) {
        currentBuild.result = 'FAILED'
    }
}
