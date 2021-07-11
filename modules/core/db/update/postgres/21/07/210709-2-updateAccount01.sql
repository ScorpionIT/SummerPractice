alter table OPERATION_ACCOUNT rename column acc_name to acc_name__u40128 ;
alter table OPERATION_ACCOUNT alter column acc_name__u40128 drop not null ;
-- alter table OPERATION_ACCOUNT add column ACC_NAME varchar(20) ^
-- update OPERATION_ACCOUNT set ACC_NAME = <default_value> ;
-- alter table OPERATION_ACCOUNT alter column acc_name set not null ;
alter table OPERATION_ACCOUNT add column ACC_NAME varchar(20) ;
