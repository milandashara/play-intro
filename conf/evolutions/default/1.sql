# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table camera (
  id                        varchar(255) not null,
  name                      varchar(255),
  constraint pk_camera primary key (id))
;

create sequence camera_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists camera;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists camera_seq;

