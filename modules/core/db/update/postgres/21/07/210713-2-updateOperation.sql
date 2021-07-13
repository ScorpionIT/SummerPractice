update OPERATION_OPERATION set CATEGORY = 'A' where CATEGORY is null ;
alter table OPERATION_OPERATION alter column CATEGORY set not null ;
