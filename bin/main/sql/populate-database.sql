INSERT INTO TB_DEPARTMENT (ID_DEPARTMENT, NOME_DEPARTMENT) VALUES (DEPARTMENT_SEQ.NEXTVAL, 'CONTABIL');
INSERT INTO TB_DEPARTMENT (ID_DEPARTMENT, NOME_DEPARTMENT) VALUES (DEPARTMENT_SEQ.NEXTVAL, 'FINANCEIRO');
INSERT INTO TB_DEPARTMENT (ID_DEPARTMENT, NOME_DEPARTMENT) VALUES (DEPARTMENT_SEQ.NEXTVAL, 'RH');
INSERT INTO TB_DEPARTMENT (ID_DEPARTMENT, NOME_DEPARTMENT) VALUES (DEPARTMENT_SEQ.NEXTVAL, 'TI');

INSERT INTO TB_DEGREE (ID_DEGREE, NOME_DEGREE) VALUES (DEGREE_SEQ.NEXTVAL, 'M�DIO');
INSERT INTO TB_DEGREE (ID_DEGREE, NOME_DEGREE) VALUES (DEGREE_SEQ.NEXTVAL, 'SUPERIOR COMPLETO');
INSERT INTO TB_DEGREE (ID_DEGREE, NOME_DEGREE) VALUES (DEGREE_SEQ.NEXTVAL, 'SUPERIOR INCOMPLETO');
INSERT INTO TB_DEGREE (ID_DEGREE, NOME_DEGREE) VALUES (DEGREE_SEQ.NEXTVAL, 'P�S');

INSERT INTO TB_EMPLOYEE (ID, NOME, EMAIL, ID_DEPARTMENT, ID_DEGREE) VALUES (EMPLOYEE_SEQ.NEXTVAL, 'Joao Pedro', 'joao@email.com', 1, 1);
INSERT INTO TB_EMPLOYEE (ID, NOME, EMAIL, ID_DEPARTMENT, ID_DEGREE) VALUES (EMPLOYEE_SEQ.NEXTVAL, 'Filipe Castro', 'filipe@email.com', 2, 2);
INSERT INTO TB_EMPLOYEE (ID, NOME, EMAIL, ID_DEPARTMENT, ID_DEGREE) VALUES (EMPLOYEE_SEQ.NEXTVAL, 'Pedro Araujo', 'pedro@email.com', 3, 3);
INSERT INTO TB_EMPLOYEE (ID, NOME, EMAIL, ID_DEPARTMENT, ID_DEGREE) VALUES (EMPLOYEE_SEQ.NEXTVAL, 'Kelly', 'kelly@email.com', 4, 4);
INSERT INTO TB_EMPLOYEE (ID, NOME, EMAIL, ID_DEPARTMENT, ID_DEGREE) VALUES (EMPLOYEE_SEQ.NEXTVAL, 'Marcelo Raposo', 'marcelo@email.com', 1, 2);
INSERT INTO TB_EMPLOYEE (ID, NOME, EMAIL, ID_DEPARTMENT, ID_DEGREE) VALUES (EMPLOYEE_SEQ.NEXTVAL, 'Julio Gomes', 'julio@email.com', 4, 3);
