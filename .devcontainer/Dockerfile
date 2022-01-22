# FROM mcr.microsoft.com/vscode/devcontainers/base:0-bullseye
FROM ubuntu

ENV DEBIAN_FRONTEND=noninteractive
ENV TZ=America/Sao_Paulo

RUN apt-get update && apt-get install -y tzdata default-jre python3 maven git \
 && apt-get update

ENTRYPOINT [ "/usr/local/share/docker-init.sh" ]
CMD [ "sleep", "infinity" ]
