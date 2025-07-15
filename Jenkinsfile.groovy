pipeline {
    agent any

    environment {
        PROJECT_NAME = "Jenkins-CI-CD-Pipeline"
    }

    stages {
        stage('Checkout') {
            steps {
                echo "🔄 Clonage du dépôt ${env.PROJECT_NAME}"
                checkout scm
            }
        }

        stage('Build') {
            steps {
                echo "🏗️ Compilation / Build du projet"
                sh 'echo "Build terminé avec succès."'
            }
        }

        stage('Test') {
            steps {
                echo "🧪 Exécution des tests"
                sh 'echo "Tous les tests sont OK ✅"'
            }
        }

        stage('Deploy') {
            steps {
                echo "🚀 Déploiement simulé"
                sh 'echo "Application déployée avec succès sur le serveur de test 🎉"'
            }
        }
    }

    post {
        success {
            echo "🎯 Pipeline terminé avec succès."
        }
        failure {
            echo "❌ Échec du pipeline !"
        }
    }
}
