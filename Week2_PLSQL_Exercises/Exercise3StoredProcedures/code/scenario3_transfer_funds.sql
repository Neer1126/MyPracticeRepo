CREATE OR REPLACE PROCEDURE TransferFunds(
  from_account_id IN NUMBER,
  to_account_id IN NUMBER,
  amount IN NUMBER
) IS
  from_balance NUMBER;
BEGIN
  SELECT balance INTO from_balance FROM accounts WHERE account_id = from_account_id FOR UPDATE;

  IF from_balance < amount THEN
    DBMS_OUTPUT.PUT_LINE('Transfer failed: Insufficient funds.');
  ELSE
    UPDATE accounts
    SET balance = balance - amount
    WHERE account_id = from_account_id;

    UPDATE accounts
    SET balance = balance + amount
    WHERE account_id = to_account_id;

    DBMS_OUTPUT.PUT_LINE('₹' || amount || ' transferred from Account ' || from_account_id || ' to Account ' || to_account_id);
  END IF;
EXCEPTION
  WHEN NO_DATA_FOUND THEN
    DBMS_OUTPUT.PUT_LINE('Account not found.');
  WHEN OTHERS THEN
    DBMS_OUTPUT.PUT_LINE('An error occurred: ' || SQLERRM);
END;
/
