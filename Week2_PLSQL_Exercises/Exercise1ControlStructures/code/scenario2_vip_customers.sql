BEGIN
  FOR cust IN (
    SELECT customer_id, balance
    FROM customers
    WHERE balance > 10000
  ) LOOP
    UPDATE customers
    SET IsVIP = 'TRUE'
    WHERE customer_id = cust.customer_id;

    DBMS_OUTPUT.PUT_LINE('Customer ID ' || cust.customer_id || ' promoted to VIP.');
  END LOOP;
END;
/
