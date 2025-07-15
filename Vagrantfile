
Vagrant.configure("2") do |config|
  config.vm.box = "ubuntu/focal64"
  config.vm.hostname = "jenkins-server"
  config.vm.network "private_network", ip: "192.168.56.20"

  config.vm.provider "virtualbox" do |vb|
    vb.memory = "2048"
    vb.cpus = 2
  end

  config.vm.provision "shell", inline: <<-SHELL
    # Éviter les prompts bloquants
    export DEBIAN_FRONTEND=noninteractive

    # Mise à jour du système
    sudo apt-get update -y
    sudo apt-get upgrade -y

    # Installer Java 17 (requis par Jenkins)
    sudo apt-get install -y openjdk-17-jdk curl gnupg2

    # Ajouter la clé et le dépôt Jenkins (version sécurisée et récente)
    curl -fsSL https://pkg.jenkins.io/debian-stable/jenkins.io-2023.key | sudo tee /usr/share/keyrings/jenkins-keyring.asc > /dev/null
    echo "deb [signed-by=/usr/share/keyrings/jenkins-keyring.asc] https://pkg.jenkins.io/debian-stable binary/" | sudo tee /etc/apt/sources.list.d/jenkins.list > /dev/null

    # Installer Jenkins
    sudo apt-get update -y
    sudo apt-get install -y jenkins

    # Activer et démarrer Jenkins
    sudo systemctl enable jenkins
    sudo systemctl start jenkins

    # Autoriser le port 8080 (si pare-feu actif, sinon ignore)
    sudo ufw allow 8080 || true
  SHELL
end
