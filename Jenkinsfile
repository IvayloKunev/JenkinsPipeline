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
                                sh ("/usr/local/bin/docker-compose -d -f docker-compose.yml up")

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
                                echo "Testing the Project.........."
                            }
                        }
            }
}