--Q7. auction 계정에 구매 상품 배송 테이블(TBL_AUCTION_DELIVERY)을 생성합니다.
--       이때, 배송코드번호(DNO)의 데이터 타입은 NUMBER(5)에
--       제약조건명은 PK_AUCTION_DELIVERY, 제약조건은 PRIMARY KEY 설정,
--       배송지 기본주소(DBADDR)의 데이터 타입은 VARCHAR2(100)에 제약조건 NOT NULL 설정,
--       배송지 상세주소(DSADDR)의 데이터 타입은 VARCHAR2(100)에 제약조건 NOT NULL 설정,
--       구매번호(PNO)의 데이터 타입은 NUMBER(5)에 제약조건 NOT NULL 설정 합니다.

CREATE TABLE TBL_AUCTION_DELIVERY(
     DNO NUMBER(5),
     DBADDR VARCHAR2(100) NOT NULL,
     DSADDR VARCHAR2(100) NOT NULL,
     PNO NUMBER(5) NOT NULL);

ALTER TABLE TBL_AUCTION_DELIVERY ADD CONSTRAINT PK_AUCTION_DELIVERY PRIMARY KEY(DNO);


--Q8. 그리고, 구매 상품 배송 테이블(TBL_AUCTION_DELIVERY)의 구매번호(PNO)를
--       앞서 생성한 결제 구매 테이블(TBL_BUY)의 구매번호(PNO)칼럼과
--       외래키(ForeignKey)명 fk_purchase_delivery로 하고 외래키 연결을 설정하고
--       COMMIT 처리를 하시기 바랍니다.

ALTER TABLE TBL_AUCTION_DELIVERY
ADD CONSTRAINT fk_purchase_delivery
FOREIGN KEY(PNO) REFERENCES TBL_BUY(PNO);

COMMIT;

--Q9. 배송코드번호(DNO) 10001부터 1씩 자동 증가 생성되는
--       AUCTION_DELIVERY_SEQ 시퀀스를 생성합니다.

 CREATE SEQUENCE AUCTION_DELIVERY_SEQ
 INCREMENT BY 1
 START WITH 10000
 MAXVALUE 9999999;

--Q10. 배송코드번호(DNO)가 10001부터 시작(AUCTION_DELIVERY_SEQ.NEXTVAL 적용),
--       배송지 기본주소(DBADDR)가 "서울시 구로구 행복한 동네",
--       배송지 상세주소(DSADDR)가 "즐거운 아파트 101동 1004호",
--       구매번호(PNO)가 10001 로 데이터 1건을
--       구매 상품 배송 테이블(TBL_AUCTION_DELIVERY)에 입력(INSERT)하시기 바랍니다.

INSERT INTO TBL_AUCTION_DELIVERY
VALUES(AUCTION_DELIVERY_SEQ.NEXTVAL, '서울시 구로구 행복한 동네', '즐거운 아파트 101동 1004호', 10001);

SELECT * FROM tbl_buy;


[시퀀스 중요 참고 사항]
SQL> -- 시퀀스 시작 값 조정하기
SQL> ALTER SEQUENCE AUCTION_DELIVERY_SEQ INCREMENT BY -2;

시퀀스가 변경되었습니다.

SQL> ALTER SEQUENCE AUCTION_DELIVERY_SEQ INCREMENT BY 1;

시퀀스가 변경되었습니다.

SQL> -- 시퀀스 삭제
SQL> DROP SEQUENCE AUCTION_DELIVERY_SEQ;
시퀀스가 삭제되었습니다.
