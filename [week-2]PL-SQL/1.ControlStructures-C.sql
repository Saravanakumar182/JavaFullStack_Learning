DECLARE
  CURSOR due_loans IS
    SELECT l.LoanID, l.CustomerID, l.EndDate
    FROM Loans l
    WHERE l.EndDate BETWEEN SYSDATE AND SYSDATE + 30;

  v_name Customers.Name%TYPE;

BEGIN
  FOR rec IN due_loans LOOP
    SELECT Name INTO v_name
    FROM Customers
    WHERE CustomerID = rec.CustomerID;

    DBMS_OUTPUT.PUT_LINE('Reminder → Dear ' || v_name ||
                         ', your loan #' || rec.LoanID ||
                         ' is due on ' || TO_CHAR(rec.EndDate, 'DD-Mon-YYYY'));
  END LOOP;
END;
/
