--------------------------------------------------------
--  �ļ��Ѵ��� - ������-ʮһ��-25-2017   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table TB_USER
--------------------------------------------------------

  CREATE TABLE "C##SCOTT"."TB_USER" 
   (	"ID" NUMBER(20,0), 
	"ACCOUNT" VARCHAR2(80 BYTE), 
	"PASSWORD" VARCHAR2(80 BYTE), 
	"EMAIL" VARCHAR2(80 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;

   COMMENT ON COLUMN "C##SCOTT"."TB_USER"."ID" IS 'id
';
   COMMENT ON COLUMN "C##SCOTT"."TB_USER"."ACCOUNT" IS '�˻�
';
   COMMENT ON COLUMN "C##SCOTT"."TB_USER"."PASSWORD" IS '����
';
   COMMENT ON COLUMN "C##SCOTT"."TB_USER"."EMAIL" IS '����
';
REM INSERTING into C##SCOTT.TB_USER
SET DEFINE OFF;
Insert into C##SCOTT.TB_USER (ID,ACCOUNT,PASSWORD,EMAIL) values (2002,'542307211','123456','xxx@163.com');
Insert into C##SCOTT.TB_USER (ID,ACCOUNT,PASSWORD,EMAIL) values (2001,'222222222','12345','aaa@gmail.com');
--------------------------------------------------------
--  DDL for Index TB_USER_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "C##SCOTT"."TB_USER_PK" ON "C##SCOTT"."TB_USER" ("ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  Constraints for Table TB_USER
--------------------------------------------------------

  ALTER TABLE "C##SCOTT"."TB_USER" MODIFY ("ID" NOT NULL ENABLE);
  ALTER TABLE "C##SCOTT"."TB_USER" MODIFY ("ACCOUNT" NOT NULL ENABLE);
  ALTER TABLE "C##SCOTT"."TB_USER" MODIFY ("PASSWORD" NOT NULL ENABLE);
  ALTER TABLE "C##SCOTT"."TB_USER" MODIFY ("EMAIL" NOT NULL ENABLE);
  ALTER TABLE "C##SCOTT"."TB_USER" ADD CONSTRAINT "TB_USER_PK" PRIMARY KEY ("ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
