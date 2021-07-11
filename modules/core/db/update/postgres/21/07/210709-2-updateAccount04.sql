alter table OPERATION_ACCOUNT rename column funds to funds__u74865 ;
alter table OPERATION_ACCOUNT add column FUNDS decimal(19, 2) ;
