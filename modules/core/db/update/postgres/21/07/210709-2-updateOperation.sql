alter table OPERATION_OPERATION rename column amount to amount__u46232 ;
alter table OPERATION_OPERATION alter column amount__u46232 drop not null ;
alter table OPERATION_OPERATION add column AMOUNT decimal(19, 2) ^
update OPERATION_OPERATION set AMOUNT = 0 where AMOUNT is null ;
alter table OPERATION_OPERATION alter column AMOUNT set not null ;
