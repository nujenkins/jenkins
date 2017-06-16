CREATE DATABASE jenkins WITH  OWNER=jenkins_user
                                  LC_COLLATE='en_US.utf8'
                                  LC_CTYPE='en_US.utf8'
                                  ENCODING='UTF8'
				  TEMPLATE=template0;
CREATE TABLE job (id SERIAL PRIMARY KEY, name VARCHAR UNIQUE, config jsonb NOT NULL);

CREATE INDEX job_name_idx ON job(name);
