create table OPERATION_ACCOUNT (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    ACC_NAME integer not null,
    CURRENCY varchar(255),
    FUNDS integer,
    --
    primary key (ID)
);