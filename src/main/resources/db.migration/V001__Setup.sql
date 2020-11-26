create table account (
    id varchar(255) not null,
    birthday datetime not null,
    email varchar(255) not null,
    name varchar(255) not null,
    password varchar(255) not null,
    phone varchar(255) not null,
    registration_date datetime not null,
    role integer not null,
    license_id varchar(255),
    primary key (id)
) engine=InnoDB
create table account_book (
    book_id varchar(255) not null,
    account_id varchar(255) not null
) engine=InnoDB
create table book (
    id varchar(255) not null,
    description varchar(255) not null,
    page_count integer not null,
    price double precision not null,
    published_date datetime not null,
    title varchar(255) not null,
    account_id varchar(255) not null,
    primary key (id)
) engine=InnoDB
create table book_genre (
    genre_id varchar(255) not null,
    book_id varchar(255) not null
) engine=InnoDB
create table comment (
    id varchar(255) not null,
    context varchar(255) not null,
    date datetime,
    rate integer not null,
    account_id varchar(255) not null,
    book_id varchar(255) not null,
    primary key (id)
) engine=InnoDB
create table file_container (
    id varchar(255) not null,
    data longblob,
    download_url varchar(255),
    name varchar(255),
    size bigint,
    type varchar(255),
    book_id varchar(255),
    primary key (id)
) engine=InnoDB
create table genre (
    id varchar(255) not null,
    name varchar(255),
    primary key (id)
) engine=InnoDB
create table license (
    id varchar(255) not null,
    book_limit integer,
    description varchar(255),
    name varchar(255),
    price double precision,
    primary key (id)
) engine=InnoDB
create table photo_container (
    id varchar(255) not null,
    data longblob,
    download_url varchar(255),
    name varchar(255),
    size bigint,
    type varchar(255),
    account_id varchar(255),
    book_id varchar(255),
    primary key (id)
) engine=InnoDB
create table purchase (
    id varchar(255) not null,
    date datetime not null,
    price double precision not null,
    account_id varchar(255) not null,
    book_id varchar(255) not null,
    primary key (id)
) engine=InnoDB
alter table account add constraint FKix96iqkt3dwmpysrmvkm8hlw9 foreign key (license_id) references license (id)
alter table account_book add constraint FK2h7rw8t5m0kao83h9pibt7hxs foreign key (account_id) references account (id)
alter table account_book add constraint FK3urkjo83dg7chbrj112i4sjj9 foreign key (book_id) references book (id)
alter table book add constraint FKpio94h2hps4iu6xlqp05qnjtr foreign key (account_id) references account (id)
alter table book_genre add constraint FK52evq6pdc5ypanf41bij5u218 foreign key (book_id) references book (id)
alter table book_genre add constraint FK8l6ops8exmjrlr89hmfow4mmo foreign key (genre_id) references genre (id)
alter table comment add constraint FKp41h5al2ajp1q0u6ox3i68w61 foreign key (account_id) references account (id)
alter table comment add constraint FKkko96rdq8d82wm91vh2jsfak7 foreign key (book_id) references book (id)
alter table file_container add constraint FKtqbsya2s9kevo1d5hkcbyo1md foreign key (book_id) references book (id)
alter table photo_container add constraint FK23pvfxvdynif50ntncx0b4ap3 foreign key (account_id) references account (id)
alter table photo_container add constraint FKq1hd94q4jl8c5eeku9oq3utqg foreign key (book_id) references book (id)
alter table purchase add constraint FKj4nqpwiw7s85ps78eghvnlaeh foreign key (account_id) references account (id)
alter table purchase add constraint FK1m5o6q4972l3105opuvqibhym foreign key (book_id) references book (id)