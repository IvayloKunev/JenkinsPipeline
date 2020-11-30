pipeline {
    agent any
    tools {
        maven "MAVEN_HOME"

    }
    stages
            {
                stage('docker-compose UP')
                        {
                            steps {
                                sh ("/usr/local/bin/docker-compose -f docker-compose.yml up -d")

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
                                sh ("/usr/local/bin/docker stop \\\$(docker ps -a -q)")
                            }
                        }
            }
}