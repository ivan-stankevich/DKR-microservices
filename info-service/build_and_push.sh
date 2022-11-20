cp config/Dockerfile $1/Dockerfile
cd $1

docker build . -t ivanstankevich1997/$1:$2
docker push ivanstankevich1997/$1:$2

rm Dockerfile