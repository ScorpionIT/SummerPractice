-- begin OPERATION_OPERATION
alter table OPERATION_OPERATION add constraint FK_OPERATION_OPERATION_ON_ACCOUNT foreign key (ACCOUNT_ID) references OPERATION_ACCOUNT(ID)^
create index IDX_OPERATION_OPERATION_ON_ACCOUNT on OPERATION_OPERATION (ACCOUNT_ID)^
-- end OPERATION_OPERATION
-- begin OPERATION_ACCOUNT
create unique index IDX_OPERATION_ACCOUNT_UK_ACC_NAME on OPERATION_ACCOUNT (ACC_NAME) where DELETE_TS is null ^
-- end OPERATION_ACCOUNT
