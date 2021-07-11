create table OPERATION_OPERATION (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    TYPE_ varchar(255) not null,
    AMOUNT double precision not null,
    DATA_ timestamp not null,
    CATEGORY varchar(255),
    COMMENTARY varchar(255),
    ACCOUNT_ID uuid not null,
    --
    primary key (ID)
);