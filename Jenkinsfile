pipeline {
    agent any
    tools {
        maven "MAVEN_HOME"

    }
    environment {
        PATH = "$PATH:/usr/local/bin"
    }
    stages
            {
                stage('docker-compose UP')
                        {
                            steps {
                                sh ('docker ps -f name=jenkiinspipelinekunata_hub_1 -q | xargs --no-run-if-empty docker container stop')
                                sh ('docker container ls -a -fname=jenkiinspipelinekunata_hub_1 -q | xargs -r docker container rm')
                                sh("docker-compose -f docker-compose.yml up -d")

                            }
                        }
                stage('Executing Tests')
                        {
                            steps {
                                sh("mvn test")
                            }
                        }
                stage('docker-compose DOWN')
                        {
                            steps {
                                sh("docker stop jenkiinspipelinekunata_firefox_1 jenkiinspipelinekunata_chrome_1 jenkiinspipelinekunata_hub_1")
                                sh("docker rm jenkiinspipelinekunata_firefox_1 jenkiinspipelinekunata_chrome_1 jenkiinspipelinekunata_hub_1")


                            }
                        }
            }
}