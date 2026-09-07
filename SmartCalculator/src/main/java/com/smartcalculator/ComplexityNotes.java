package com.smartcalculator;

public class ComplexityNotes {
  /*
   Scenario 1: Finding one account by ID

   Linear scan:
   Big O = O(n)
   We may have to check every account until we find the ID.

   HashMap lookup:
   Big O = O(1) average case
   The account can usually be found directly using its ID as the key.

   For 1 million accounts:
   I would choose HashMap because lookup is much faster on average.
   */


  /*
   Scenario 2: Finding all overdue accounts

   Nested loop:
   Big O = O(n^2)
   Every account may be compared with every other account.

   Single pass with a Set:
   Big O = O(n) average case
   We can store overdue IDs in a Set and check each account once.

   For 1 million accounts:
   I would choose the single-pass approach with a Set because
   O(n) is much better than O(n^2) for a large list.
   */

}
