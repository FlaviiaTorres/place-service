CREATE TABLE IF NOT EXISTS place (
  id bigint AUTO_INCREMENT primary key,
  name varchar(255) not null,
  slug varchar(255) not null,
  city varchar(255) not null,
  state varchar(255) not null,
  createdAt timestamp not null,
  updatedAt timestamp not null
);