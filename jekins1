node {

def IMAGE_NAME = params.IMAGE_NAME
def TAG_NAME = params.TAG_NAME
 def TAG_NAME_Latest = params.TAG_NAME_Latest
 def Jfog_Ip = params.Jfog_Ip
 def Jfog_Port = params.Jfog_Port
 def Repository_Key = params.Repository_Key
 def Docker_URL = params.Docker_URL
 
// def docker_login = params.docker_login
// def Dockerhub_URL = params.Dockerhub_URL

stage('Checkout') {
  git branch: 'master', credentialsId:'github', url: 'https://github.com/dpanigrahy2020/ADOK8.git'  
 }

stage('Build') {
    withMaven(jdk: 'java', maven: 'maven') {
        
        println "build is running"
        sh 'mvn -f pom.xml clean package -Dmaven.test.skip=true'
    }
}

stage('Build Image'){
    sh """        
        docker build -t ${IMAGE_NAME}:${TAG_NAME} .
        docker tag ${IMAGE_NAME}:${TAG_NAME} ${Docker_URL}:${TAG_NAME}
      """
} 
        
 /*stage('Test'){
            steps {
                 echo 'Empty'
            }
 }*/
 
 stage('predeploy'){
              withDockerRegistry(credentialsId: 'ecr:us-east-1:awsECRForeksdemo', url: 'https://670166063118.dkr.ecr.us-east-1.amazonaws.com') {
              sh "docker push ${Docker_URL}:${TAG_NAME}"
              sh "docker pull ${Docker_URL}:${TAG_NAME}"
              } 
 }
 
 stage('Deploy'){
              withKubeConfig(caCertificate: '', clusterName: '', contextName: '', credentialsId: 'kubeAWS', namespace: '', serverUrl: '') {
               sh """aws configure set aws_access_key_id $AWS_ACCESS_KEY_ID --profile default && aws configure set aws_secret_access_key $AWS_SECRET_ACCESS_KEY --profile default && aws configure set region "us-east-1" --profile default && aws configure set output "" --profile default
                     /usr/local/bin/aws eks update-kubeconfig --name eksdemo1 --region us-east-1  
                     kubectl config view --minify
                     echo check kubectl access
                     kubectl apply -f deployment.yml
                     kubectl apply -f service.yaml
                     kubectl rollout restart -f deployment.yml
                     """              
}
           
 }

/* stage("Deploy to EKS"){
  def dockerRun = "docker run -d -p 9999:9999 --name myapp ${IMAGE_NAME}:${TAG_NAME}"
    sshagent(['SSH-JENKINS']){
        sh "ssh -o StrictHostKeyChecking=no webapps@20.25.118.165 'docker rm -f `docker ps -a -q`'"
        sh "ssh -o StrictHostKeyChecking=no webapps@20.25.118.165 'docker rmi -f `docker images  -q`'"
         sh "rsync -avz /var/lib/jenkins/workspace/JOB/maven.tar webapps@20.25.118.165:/home/webapps"
         sh "ssh -o StrictHostKeyChecking=no webapps@20.25.118.165 'docker load -i maven.tar'"
         sh "ssh -o StrictHostKeyChecking=no webapps@20.25.118.165 'docker images'"
         sh "ssh -o StrictHostKeyChecking=no webapps@20.25.118.165 ${dockerRun}"
    }
 }*/
 }
