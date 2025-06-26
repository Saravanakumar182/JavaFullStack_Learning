CREATE OR REPLACE PROCEDURE TransferFunds(
  from_acct IN NUMBER,
  to_acct   IN NUMBER,
  amount    IN NUMBER)
IS
  insufficient_Balance EXCEPTION;
  v_bal Accounts.Balance%TYPE;
BEGIN
  SELECT Balance INTO v_bal
    FROM Accounts
   WHERE AccountID = from_acct
     FOR UPDATE;

  IF v_bal < amount THEN
     RAISE insufficient_Balance;
  END IF;

  UPDATE Accounts SET Balance = Balance - amount WHERE AccountID = from_acct;
  UPDATE Accounts SET Balance = Balance + amount WHERE AccountID = to_acct;
  COMMIT;

EXCEPTION
  WHEN insufficient_Balance THEN
     ROLLBACK;
     DBMS_OUTPUT.PUT_LINE('Aborting: insufficient balance');
  WHEN OTHERS THEN
     ROLLBACK;
     DBMS_OUTPUT.PUT_LINE(SQLERRM);
END TransferFunds;
/


SELECT AccountID , Balance 
from ACCOUNTS;

--transferring 200 from 6 to 4
EXECUTE TRANSFERFUNDS(6,4,200);

--transferring 5100 from 7 to 4
EXECUTE TRANSFERFUNDS(7,4,5100);
