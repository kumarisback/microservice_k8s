# microservice_k8s


//commands 

docker run -p 8080:8080 dummy_image_docker_path

kubectl create deployment dummy_image --image=dummy_image_docker_path
kubectl expose deployment dummy_image --type=LoadBalancer --port=8080
kubectl scale deployment dummy_image --replicas=3
kubectl delete pod dummy_image-58ff5dd898-62l9d
kubectl autoscale deployment dummy_image --max=10 --cpu-percent=70
kubectl edit deployment dummy_image #minReadySeconds: 15
kubectl set image deployment dummy_image dummy_image=kumarisbeck/dummy_image:0.0.2.RELEASE

gcloud container clusters get-credentials kumarisbeckutes-cluster --zone us-central1-a --project solid-course-258105
kubectl create deployment dummy_image --image=dummy_image_docker_path
kubectl expose deployment dummy_image --type=LoadBalancer --port=8080
kubectl set image deployment dummy_image dummy_image=DUMMY_IMAGE:TEST
kubectl get events --sort-by=.metadata.creationTimestamp
kubectl set image deployment dummy_image dummy_image=kumarisbeck/dummy_image:0.0.2.RELEASE
kubectl get events --sort-by=.metadata.creationTimestamp
kubectl get componentstatuses
kubectl get pods --all-namespaces

kubectl get events
kubectl get pods
kubectl get replicaset
kubectl get deployment
kubectl get service

kubectl get pods -o wide

kubectl explain pods
kubectl get pods -o wide

kubectl describe pod dummy_image-58ff5dd898-9trh2

kubectl get replicasets
kubectl get replicaset

kubectl scale deployment dummy_image --replicas=3
kubectl get pods
kubectl get replicaset
kubectl get events
kubectl get events --sort.by=.metadata.creationTimestamp

kubectl get rs
kubectl get rs -o wide
kubectl set image deployment dummy_image dummy_image=DUMMY_IMAGE:TEST
kubectl get rs -o wide
kubectl get pods
kubectl describe pod dummy_image-85995ddd5c-msjsm
kubectl get events --sort-by=.metadata.creationTimestamp

kubectl set image deployment dummy_image dummy_image=kumarisbeck/dummy_image:0.0.2.RELEASE
kubectl get events --sort-by=.metadata.creationTimestamp
kubectl get pods -o wide
kubectl delete pod dummy_image-67c79fd44f-n6c7l
kubectl get pods -o wide
kubectl delete pod dummy_image-67c79fd44f-8bhdt

gcloud container clusters get-credentials kumarisbeckutes-cluster --zone us-central1-c --project solid-course-258105
docker login
docker push kumarisbeck/servicetwo:0.0.11-SNAPSHOT
docker push kumarisbeck/serviceone:0.0.11-SNAPSHOT

kubectl create deployment demo2 --image=kumarisbeck/servicetwo:0.0.11-SNAPSHOT
kubectl expose deployment demo2 --type=LoadBalancer --port=8000
kubectl get svc
kubectl get services
kubectl get pods
kubectl get po
kubectl get replicaset
kubectl get rs
kubectl get all

kubectl create deployment demo1 --image=kumarisbeck/serviceone:0.0.11-SNAPSHOT
kubectl expose deployment demo1 --type=LoadBalancer --port=8100

kubectl get svc --watch

kubectl get deployments

kubectl get deployment demo2 -o yaml >> deployment.yaml 
kubectl get service demo2 -o yaml >> service.yaml 

kubectl diff -f deployment.yaml
kubectl apply -f deployment.yaml

kubectl delete all -l app=demo2
kubectl delete all -l app=demo1

kubectl rollout history deployment demo1
kubectl rollout history deployment demo2
kubectl rollout undo deployment demo2 --to-revision=1

kubectl logs demo2-9fc6f979b-2gmn8
kubectl logs -f demo2-9fc6f979b-2gmn8 

kubectl autoscale deployment demo2 --min=1 --max=3 --cpu-percent=5 
kubectl get hpa

kubectl top pod
kubectl top nodes
kubectl get hpa
kubectl delete hpa demo2

kubectl create configmap demo1 --from-literal=DEMO2_URI_SERVER_HOST=http://demo2
kubectl get configmap

kubectl get configmap demo1 -o yaml >> configmap.yaml

watch -n 0.1 curl http://34.66.241.150:8100/demo1-feignboy

docker push kumarisbeck/serviceone:0.0.12-SNAPSHOT
docker push kumarisbeck/servicetwo:0.0.12-SNAPSHOT
