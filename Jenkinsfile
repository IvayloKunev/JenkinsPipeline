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
                                sh("docker-compose -f docker-compose.yml up -d")

                            }
                        }
                stage('Executing Tests')
                        {
                            steps {
                                echo "Testing the Project.........."
                            }
                        }
                stage('docker-compose DOWN')
                        {
                            steps {
                                sh("/usr/local/bin/docker stop jenkiinspipelinekunata_firefox_1 jenkiinspipelinekunata_chrome_1 jenkiinspipelinekunata_hub_1")
                                sh("/usr/local/bin/docker rm jenkiinspipelinekunata_firefox_1 jenkiinspipelinekunata_chrome_1 jenkiinspipelinekunata_hub_1")


                            }
                        }
            }
}