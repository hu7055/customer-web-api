node {
    withMaven(
            // Maven installation declared in the Jenkins "Global Tool Configuration"
            maven: 'maven',
            mavenLocalRepo: '.repository') {
        stage('Build & Test') {
            mattermostSend message: "Build Started: ${env.JOB_NAME} ${env.BUILD_NUMBER}"
            checkout scm
            // Run the maven build
            sh "mvn clean install test"
            jacoco(execPattern: 'target/jacoco.exec')

        } // withMaven will discover the generated Maven artifacts, JUnit Surefire & FailSafe & FindBugs reports...
        stage('Publish') {
            sh "mvn deploy -DskipTests"
            mattermostSend "Build Finished - ${env.JOB_NAME} ${env.BUILD_NUMBER} (<${env.BUILD_URL}|Open>)"
        }
    }
}

