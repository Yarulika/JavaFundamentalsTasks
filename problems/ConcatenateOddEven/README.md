Concatenate odd even [EASY]
Concatenate odd even [EASY]
Description:
The task is to alternately search for the smallest odd and even number from the given
list of natural numbers. First, we search for the smallest odd number and remove it
from the list, then the smallest even number and remove it. We continue this procedure
until the list is empty. There will always be the same amount of odd and even numbers
on the list. The result is a string which is a sequence of found numbers separated by the - character.

Input:
The first line determines the number of test sets - n. Then in each of the next n lines
there is a list of numbers with the same amount of odd and even numbers, for which you must
create a string according to the given rules.

Output:
For each test set, the result is a string created by combining the consecutive returned
numbers, joined by - character.

Example
Input:

4
9 8 7 6 5 4
1 2
5 4 3 2
4 1 2 3
Output:

5-4-7-6-9-8
1-2
3-2-5-4
1-2-3-4
