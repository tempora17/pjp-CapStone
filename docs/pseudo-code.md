# Pseudo Code 

PROCEDURE ATM_Withdraw()
    
    SET attempts = 0
    SET maxAttempts = 3
    
    WHILE attempts < maxAttempts DO
        INPUT requestedAmount from user

        IF requestedAmount < 500 THEN
            PRINT "Minimum Withdrawl is Rs.500"
            SET attempts = attempts + 1
        ELSE IF requestedAmount % 500 != 0 THEN
            PRINT "Amount must be a multiple of 500."
            SET attempts = attempts + 1
        ELSE IF requestedAmount > 20000 THEN
            PRINT "Maximum withdrawal is Rs.20,000."
            SET attempts = attempts + 1
        ELSE IF requestedAmount > currentBalance THEN
            PRINT "Insufficient balance."
            SET attempts = attempts + 1
        ELSE 
            SET currentBalance = currentBalance - requestedAmount
            PRINT "Withdrawal successful"
            PRINT "New balance: Rs." + currentBalance
            RETURN SUCCESS
        END IF
    END WHILE
    PRINT "Card locked after 3 failed attempts."
    CALL lockCard()
    RETURN FAILURE
    
END PROCEDURE
