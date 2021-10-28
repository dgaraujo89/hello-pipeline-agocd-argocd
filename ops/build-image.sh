#!/bin/bash

docker build -f ops/Dockerfile diegogomesaraujo/hello-pipeline:$GO_PIPELINE_COUNTER
#docker push diegogomesaraujo/hello-pipeline:$GO_PIPELINE_COUNTER