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
i = 0: txns[0] = 500 -> balance = 0 + 500 = 500; txns[0] = 500 > 0 -> count = 0 + 1 = 1
i = 1: txns[1] = -200 -> balance = 500 - 200 = 300; txns[1] = -200 < 0 -> count = 1
i = 2: txns[2] = 1000 -> balance = 300 + 1000 = 1300; txns[2] = 1000 > 0 -> count = 1 + 1 = 2
i = 3: txns[3] = -300 -> balance = 1300 - 300 = 1000; txns[3] = -300 < 0 -> count = 2
i = 4: txns[4] = 800 -> balance = 1000 + 800 = 1800; txns[4] = 800 > 0 -> count = 2 + 1 = 3
Final Output:
Balance: 1800
Deposits: 3