#!/bin/bash
echo "Esto es una prueba ${ENVIRONMENT}"
mvn test -Denv=${ENVIRONMENT}
