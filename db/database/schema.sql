BEGIN TRANSACTION;

DROP TABLE IF EXISTS users;
DROP TABLE IF EXISTS landmarks;
DROP TABLE IF EXISTS itinerary;

CREATE TABLE users (
  id serial PRIMARY KEY,
  username varchar(255) NOT NULL UNIQUE,     -- Username
  firstname varchar(255) NOT NULL,    -- First Name
  lastname varchar(255) NOT NULL,     -- Last Name
  email varchar(255) NOT NULL,      -- E-mail
  password varchar(32) NOT NULL,      -- Password
  salt varchar(256) NOT NULL,          -- Password Salt
  role varchar(255) NOT NULL default('user'),     --User Type
  security_question varchar(255),     --Question selected from dropdown
  security_answer varchar(255),    --Users answer to security question
  category1 varchar(255),      -- Landmark Category Preference
  category2 varchar(255),      -- Landmark Category Preference
  neighborhood1 varchar(255),      -- Neighborhood Preference
  neighborhood2 varchar(255)      -- Neighborhood Preference
);

CREATE TABLE landmarks (
  id serial PRIMARY KEY,     
  name varchar(255) NOT NULL UNIQUE,    --Landmark Name
  category varchar(255) NOT NULL,      --Landmark Category
  neighborhood varchar(255) NOT NULL,      --Neighbohood
  address varchar(255) NOT NULL,      --Street Address
  city varchar(255) NOT NULL,      --City
  state varchar(2) NOT NULL,      --State
  zip integer NOT NULL,      --Zip Code
  price integer NOT NULL,      --Admission Price
  weekday_open integer,      --Weekday Opening Time
  weekday_close integer,      --Weekday Closing Time
  weekend_open integer,      --Weekend Opening Time
  weekend_close integer,      --Weekend Closing Time
  min_visit_length integer,      --Minimum Visit Length
  max_visit_length integer,      --Maximum Visit Length
  likes integer,      --Number of Likes
  dislikes integer,     --Number of Dislikes
  description varchar(1024),      --Description of Landmark
  image varchar(24)      --location of image file
);

CREATE TABLE itinerary (
  id serial PRIMARY KEY, 
  user_id integer NOT NULL,    --User id of creator   
  name varchar(255) NOT NULL,   --Name of saved itinerary   
  home_base varchar(255) NOT NULL,    --Address of start and end point
  date date NOT NULL,    --Date based on calendar date selected
  start_time time NOT NULL,      --Start Time of tour
  route varchar(255) NOT NULL,      --Route created by API
  landmark1 integer NOT NULL,      --List of landmarks
  landmark2 integer,
  landmark3 integer,
  landmark4 integer,
  landmark5 integer,
  landmark6 integer,
  landmark7 integer,
  disabled integer,    --Shows 1 if disabled, NULL if available to display
  FOREIGN KEY (user_id) REFERENCES users(id)
);

COMMIT TRANSACTION;
