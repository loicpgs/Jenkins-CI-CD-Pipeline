#!/bin/bash
# setup/setup.sh
# Script d'installation pour Jenkins CI/CD Pipeline

echo "Début du script de setup pour Jenkins CI/CD Pipeline"

# Mise à jour des paquets
sudo apt-get update -y

# Installation Java 17 (OpenJDK)
sudo apt-get install -y openjdk-17-jdk

# Installation Jenkins (dépôt officiel)
wget -q -O - https://pkg.jenkins.io/debian-stable/jenkins.io.key | sudo apt-key add -
sudo sh -c 'echo deb https://pkg.jenkins.io/debian-stable binary/ > /etc/apt/sources.list.d/jenkins.list'
sudo apt-get update -y
sudo apt-get install -y jenkins

# Démarrage et activation de Jenkins
sudo systemctl start jenkins
sudo systemctl enable jenkins

echo "Setup terminé. Jenkins devrait être accessible sur le port 8080."
