# Jenkins CI/CD Pipeline with Shared Libraries


This repository contains a Jenkins pipeline (`Jenkinsfile`) and associated shared libraries for managing CI/CD automation workflows.

---

## 📂 Project Structure

    Jenkins-Shared-Library
    ├── CI-CD      # Main Jenkins pipeline definition 
        ├── CI-Pipeline
    ├── vars/      # Shared library custom steps
        ├── code_checkout.groovy 
        ├── docker_build.groovy 
        ├── docker_push.groovy 
        ├── wsclean.groovy
        └── docker_compose.groovy 
    ├── README.md  # Project documentation

---

## 🚀 Features

- **CI/CD automation** using Jenkins Declarative Pipeline
- **Modular Shared Libraries** for reusability
- **Docker build & push** steps integrated
- **Test & Deployment** stages included
- **Post build notifications** via email

---

## ⚙️ Jenkins Setup Instructions

1. ✅ Create a new pipeline job in Jenkins.
2. ✅ Point it to this repository (GitHub/GitLab/Bitbucket).
3. ✅ Make sure your Jenkins is configured with:
   - Docker installed and accessible
   - Required credentials (DockerHub, Git, etc.)
   - Email plugin configured for `emailext`

---

## 🛠️ How to Add a New Shared Library Step

1. Create a new Groovy file under `vars/`, for example:

2. Define your function:
```groovy
def call(String param1) {
    echo "Custom step executed with ${param1}"
}
```

## 📧 Notifications
Email notifications are sent on:

✅ Success

❌ Failure

## 📝 Author
Yogesh Chaudhari

Devloper | DevOps | Jenkins | Docker | CI/CD Enthusiast
