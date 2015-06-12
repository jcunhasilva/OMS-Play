# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table oms_order (
  order_id                  bigint auto_increment not null,
  order_nr                  varchar(255),
  product_name              varchar(255),
  created_at                varchar(255),
  constraint pk_oms_order primary key (order_id))
;




# --- !Downs

SET FOREIGN_KEY_CHECKS=0;

drop table oms_order;

SET FOREIGN_KEY_CHECKS=1;

