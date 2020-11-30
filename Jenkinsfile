pipeline {
    agent any
    tools {
        maven "MAVEN_HOME"
        Docker "PATH"

    }
    stages
            {
                stage('docker-compose UP')
                        {
                            steps {
                                sh ("docker ps -a")

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