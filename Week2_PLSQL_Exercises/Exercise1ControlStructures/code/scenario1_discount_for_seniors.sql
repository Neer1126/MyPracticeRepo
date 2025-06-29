BEGIN
  FOR cust IN (
    SELECT customer_id, age, interest_rate
    FROM customers
    WHERE age > 60
  ) LOOP
    UPDATE customers
    SET interest_rate = interest_rate - 1
    WHERE customer_id = cust.customer_id;

    DBMS_OUTPUT.PUT_LINE('1% discount applied for Customer ID: ' || cust.customer_id);
  END LOOP;
END;
/
