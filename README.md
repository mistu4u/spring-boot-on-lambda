create bucket:

```aws s3 mb s3://demo-subir```

upload to s3 bucket

```sam package --template-file .\template.yaml --output-template-file out.yaml --s3-bucket demo-subir --region us-west-2```

deploy using the `out.yaml` file

```sam deploy --template-file out.yaml --stack-name lambda-demo --capabilities CAPABILITY_IAM```
