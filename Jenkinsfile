pipeline {
    agent any
    stages
            {
                stage('docker-compose UP')
                        {
                            steps {
                                sh ("docker compose -f docker-compose.yml")

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