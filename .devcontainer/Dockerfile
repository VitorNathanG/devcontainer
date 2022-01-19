FROM mcr.microsoft.com/vscode/devcontainers/base:0-bullseye

RUN apt-get update && apt-get install -y default-jre python3 maven git \
 && apt-get update

ENTRYPOINT [ "/usr/local/share/docker-init.sh" ]
CMD [ "sleep", "infinity" ]
