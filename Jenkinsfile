pipeline {
    agent any
    tools {
        docker "docker_home"
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