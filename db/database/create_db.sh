#!/bin/bash
BASEDIR=$(dirname $0)
DATABASE=city_tours_data
psql -U postgres -f "$BASEDIR/dropdb.sql" &&
createdb -U postgres city_tours_data &&
psql -U postgres -d city_tours_data -f "$BASEDIR/schema.sql" &&
psql -U postgres -d city_tours_data -f "$BASEDIR/user.sql" &&
psql -U postgres -d city_tours_data -f "$BASEDIR/data.sql"
