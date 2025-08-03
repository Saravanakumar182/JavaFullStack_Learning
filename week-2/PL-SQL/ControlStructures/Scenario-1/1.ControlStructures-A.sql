DECLARE
  CURSOR senior_loans IS
    SELECT l.LoanID
    FROM Loans l
    JOIN Customers c ON l.CustomerID = c.CustomerID
    WHERE TRUNC(MONTHS_BETWEEN(SYSDATE, c.DOB)/12) > 60;

BEGIN
  FOR loan_rec IN senior_loans LOOP
    UPDATE Loans
    SET InterestRate = InterestRate - 1
    WHERE LoanID = loan_rec.LoanID;
  END LOOP;
  COMMIT;
END;
/