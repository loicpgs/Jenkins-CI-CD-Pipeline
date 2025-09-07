# 🚀 Jenkins CI/CD Pipeline

Ce projet propose un environnement de développement **automatisé via Vagrant** pour déployer un serveur **Jenkins LTS** sur une VM Ubuntu.  
Il est conçu comme **base de travail pour créer une pipeline CI/CD complète**, avec intégration continue, tests, et déploiement automatisé.

---

## 📦 Technologies utilisées

- 🐧 **Ubuntu 20.04 (focal64)**
- ☕ **OpenJDK 17**
- ⚙️ **Jenkins LTS**
- 📦 **Vagrant** & **VirtualBox**
- 🐙 **Git & GitHub**

---

## 🔧 Installation rapide

### 1. Cloner le dépôt

git clone https://github.com/<ton-user>/Jenkins-CI-CD-Pipeline.git
cd Jenkins-CI-CD-Pipeline

### 2. Démarrer la VM avec Jenkins**

vagrant up

Ce processus peut prendre quelques minutes selon ta connexion et ta machine.

### 3. Accéder à l'interface Jenkins

**Ouvre ton navigateur et rends-toi sur** :
➡️ http://192.168.56.20:8080

🔑 **Le mot de passe d’administration Jenkins se trouve dans ce fichier de la VM** :

/var/lib/jenkins/secrets/initialAdminPassword

###📁 Structure du projet :

**Jenkins-CI-CD-Pipeline/
├── Vagrantfile             # Provisionnement automatique : Ubuntu + Java + Jenkins
├── Jenkinsfile             # Définition de la pipeline Jenkins (multistage)
├── setup/                  # (optionnel) Scripts ou fichiers d'installation supplémentaires
├── .gitignore              # Fichiers exclus du contrôle de version
├── README.md               # Documentation du projet
└── notes.md                # Journal personnel (tests, erreurs, progression)**

**✅ Pipeline prévue (dans le Jenkinsfile)**

**🛠️ Build du projet**

**🧪 Lint & tests automatisés**

**🐳 (optionnel) Déploiement via Docker ou SSH**

**📦 Notifications ou reporting d'état**

**📌 Remarques**:

**Ce projet est destiné à l’apprentissage de Jenkins et des pipelines CI/CD.**

Une fois l’environnement fonctionnel, tu pourras ajouter des jobs, des intégrations GitHub, et des stages personnalisés à ta pipeline.

🙋‍♂️ Besoin d'aide ?

**N'hésite pas à consulter la documentation officielle de Jenkins :
🔗 https://www.jenkins.io/doc/**
