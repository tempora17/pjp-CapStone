```
int balance = 3000; 
int count   = 0; 
int[] txns  = {500, -200, 1000, -300, 800}; 
for (int i = 0; i < txns.length; i++) { 
    balance += txns[i]; 
    if (txns[i] > 0) count++; 
} 
System.out.println("Balance: " + balance); 
System.out.println("Deposits: " + count); 
```

# Dry Run
i = 0: txns[0] = 500 -> balance = 3000 + 500 = 3500; txns[0] = 500 > 0 -> count = 0 + 1 = 1
---
i = 1: txns[1] = -200 -> balance = 3500 - 200 = 3300; txns[1] = -200 < 0 -> count = 1
--
i = 2: txns[2] = 1000 -> balance = 3300 + 1000 = 4300; txns[2] = 1000 > 0 -> count = 1 + 1 = 2
---
i = 3: txns[3] = -300 -> balance = 4300 - 300 = 4000; txns[3] = -300 < 0 -> count = 2
---
i = 4: txns[4] = 800 -> balance = 4000 + 800 = 4800; txns[4] = 800 > 0 -> count = 2 + 1 = 3
---
Final Output:
Balance: 4800
Deposits: 3

The count increases only when the transaction is greater than 0. The positive transactions are 500, 1000, and 800, so there are 3 deposits.