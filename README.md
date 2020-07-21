# Doodle challenge

The task is implemented using the `spring boot`. As a database `mongodb` is used because it was easy to import provided `json` data in it.

## Prerequisites

- docker installed (developed with 2.3.0.3)
- docker-compose (developed with 1.25.5)

## How to run

Project can be run by:

- `chmod +x ./buildDocker.sh`
- `docker-compose up`

## TODO

- add embeded mongodb in order to make integration tests work
- add repository tests
- each time `docker-compose` is started test data is loaded and since `mongodb` stores data persistently the data is multiplied - that should not happen
