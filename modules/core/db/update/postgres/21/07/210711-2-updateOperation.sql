alter table OPERATION_OPERATION rename column type_ to type___u04727 ;
alter table OPERATION_OPERATION alter column type___u04727 drop not null ;
alter table OPERATION_OPERATION add column TYPE_ integer ^
update OPERATION_OPERATION set TYPE_ = 10 where TYPE_ is null ;
alter table OPERATION_OPERATION alter column TYPE_ set not null ;
