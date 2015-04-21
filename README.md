# Build

`mvn clean package docker:build`

# Run

## In locally installed Java VM
`java -showversion -Djavax.net.debug=all -jar -Djavax.net.ssl.trustStore=src/main/resources/truststore.jks target/test-ssl-ciphersuits-0.0.1-SNAPSHOT.jar https://www.buergerkarte.at`


## In Docker
`docker run --rm -v /dev/urandom:/dev/random sslciphersuitstest https://www.buergerkarte.at`

To change Java Version edit `docker/Dockerfile` and rebuild.
