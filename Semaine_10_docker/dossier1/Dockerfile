FROM ubuntu
LABEL yourName your.name@email.com
RUN apt update
RUN apt install -y nginx
ADD . /var/www/html
EXPOSE 80
CMD ["nginx", "-g", "daemon off;"]