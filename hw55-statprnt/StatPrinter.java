/***
An AP-style question, for practice...

Write the StatPrinter class below. The StatPrinter Object receives an
ArrayList of nonnegative integers, then builds a frequency ArrayList where
the index values are the data and the entry at the index is the frequency.
For example, if the received data is : 2,3,2,5,1,3 then the frequency 
list would be [0,1,2,2,0,1]. This is read as 0 zeroes, 1 one, 2 twos,
2 threes, 0 fours, 1 five. The size of the frequency list is the equal to
the maximum value of the data.

A capability of the class is to calculate local modes from the frequency 
list. A local mode is a value that is greater than the value at index - 1 
and greater than the value at index + 1. A local mode is never at the end
points of the list. For example if the frequency list is [1,2,1,4,2,3,5] 
then the local modes are: 2 and 4.



This class is also capable of printing a histogram of the frequencies, using
‘*’ to indicate a frequency amount. To print a histogram, the user specifies
the longest sequence of ‘*’s used and then all other values are printed in 
proportion to this value. For example, if longest bar is 10 and the frequency
list is [1,2,1,4,2,3,5] then the histogram printed looks like this:

0 : **
1 : ****
2 : **
3 : ********
4 : ****
5 : ******
6 : **********

For each method, state the run time efficiencies using Big O notation.
=======================================
Tip:
* Develop 1 fxn at a time, test it, then move to next.
* Look over all, think a bit, decide which to tackle first.
	( Simplest?  Prerequisite? . . . )
* Coding today, what extra code do you need to get past Mr. Compiler?
***/


