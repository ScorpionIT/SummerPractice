insert into OPERATION_ACCOUNT
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ACC_NAME, CURRENCY, FUNDS)
values ('38c01b79-f135-2c44-ef99-aad7be3643c0', 3, '2021-07-13 17:15:59', 'admin', '2021-07-13 17:18:21', 'admin', null, null, '11223344556677889900', 'RUB', 10000.00);

insert into OPERATION_ACCOUNT
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, ACC_NAME, CURRENCY, FUNDS)
values ('39c15a57-b7b6-732c-5844-61b5eb8124da', 4, '2021-07-13 17:15:36', 'admin', '2021-07-13 17:18:01', 'admin', null, null, '12345678901234567890', 'RUB', 10000.00);

insert into OPERATION_OPERATION
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, TYPE_, AMOUNT, DATA_, CATEGORY, COMMENTARY, ACCOUNT_ID)
values ('2876160c-2d3b-6c89-6449-56e2aec95cef', 1, '2021-07-13 17:16:32', 'admin', '2021-07-13 17:16:32', null, null, null, 20, 223.00, 2021-07-11T00:00, 'B', 'Макдональдс', '38c01b79-f135-2c44-ef99-aad7be3643c0');

insert into OPERATION_OPERATION
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, TYPE_, AMOUNT, DATA_, CATEGORY, COMMENTARY, ACCOUNT_ID)
values ('0f9b7e05-f043-7096-9a27-26803017e0a4', 1, '2021-07-13 17:16:56', 'admin', '2021-07-13 17:16:56', null, null, null, 10, 155.00, 2021-07-12T00:00, 'G', 'Пополнение с терминала', '39c15a57-b7b6-732c-5844-61b5eb8124da');

insert into OPERATION_OPERATION
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, TYPE_, AMOUNT, DATA_, CATEGORY, COMMENTARY, ACCOUNT_ID)
values ('61906984-372b-8bad-4045-9ed0eeafd784', 1, '2021-07-13 17:17:25', 'admin', '2021-07-13 17:17:25', null, null, null, 20, 500.00, 2021-07-12T00:00, 'C', null, '39c15a57-b7b6-732c-5844-61b5eb8124da');

insert into OPERATION_OPERATION
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, TYPE_, AMOUNT, DATA_, CATEGORY, COMMENTARY, ACCOUNT_ID)
values ('f3270efa-d869-34f5-c13c-a0ee357fdcc7', 1, '2021-07-13 17:18:01', 'admin', '2021-07-13 17:18:01', null, null, null, 20, 2000.00, 2021-07-12T14:25, 'F', null, '39c15a57-b7b6-732c-5844-61b5eb8124da');

insert into OPERATION_OPERATION
(ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, TYPE_, AMOUNT, DATA_, CATEGORY, COMMENTARY, ACCOUNT_ID)
values ('b1f3c614-ed0e-6333-8d70-14dbcb23281e', 1, '2021-07-13 17:18:21', 'admin', '2021-07-13 17:18:21', null, null, null, 20, 1000.00, 2021-07-10T00:00, 'A', null, '38c01b79-f135-2c44-ef99-aad7be3643c0');