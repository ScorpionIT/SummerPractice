-- begin OPERATION_OPERATION
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
    TYPE_ integer not null,
    AMOUNT decimal(19, 2) not null,
    DATA_ timestamp not null,
    CATEGORY varchar(50) not null,
    COMMENTARY varchar(255),
    ACCOUNT_ID uuid not null,
    --
    primary key (ID)
)^
-- end OPERATION_OPERATION
-- begin OPERATION_ACCOUNT
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
    ACC_NAME varchar(20) not null,
    CURRENCY varchar(255),
    FUNDS decimal(19, 2),
    --
    primary key (ID)
)^
-- end OPERATION_ACCOUNT
