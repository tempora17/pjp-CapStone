# Big O Analysis

```
for (int i = 0; i < n; i++)
    for (int j = 0; j < n; j++)
        System.out.println(i + "," + j);
```
Time Complexity: O(n²)
The outer loop runs n times. For every iteration of the outer loop, the inner loop also runs n times.
Therefore, the total number of operations is:
n × n = n²
So the time complexity is O(n²).


# If n doubles:

(2n)² = 4n²
Therefore, approximately 4 times more operations are required.

```
int mid = n / 2;
while (mid > 0)
    mid = mid / 2;
```

Time Complexity: O(log n)
The value of mid is divided by 2 during every iteration:
n/2 → n/4 → n/8 → n/16 → ...
The loop continues until mid becomes 0. Because the value is repeatedly halved, the number of iterations grows logarithmically with n.
Therefore, the time complexity is O(log n).

# If n doubles:

For logarithmic complexity:
log(2n) = log(n) + log(2)
So doubling n only adds approximately one extra iteration, rather than doubling the number of operations.
Therefore, it requires approximately 1 additional operation/iteration, or roughly the same logarithmic amount of work.

```
for (int i = 0; i < n; i++)
    System.out.println(arr[i]);
```

Time Complexity: O(n)
The loop runs once for every element from index 0 to n - 1.
Therefore, it performs n operations.
So the time complexity is O(n).

# If n doubles:
2n

Therefore, the number of operations also doubles.

So 2 times more operations are required.

