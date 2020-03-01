#!/bin/bash

curl -i -XPOST -H "Authorization:Bearer $1" http://52.79.71.104:8080/prod/buy/$2
