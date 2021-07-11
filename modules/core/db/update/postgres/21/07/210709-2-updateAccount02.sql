-- update OPERATION_ACCOUNT set ACC_NAME = <default_value> where ACC_NAME is null ;
alter table OPERATION_ACCOUNT alter column ACC_NAME set not null ;
