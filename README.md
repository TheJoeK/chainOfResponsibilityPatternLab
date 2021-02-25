# chainOfResponsibilityPatternLab
Lab: Apply chain of responsibility pattern

An ATM can only dispense bills of the following denominations: $500, $100, $50, $10, $5, and $1
When a user withdraws an amount from the ATM, the machine tries to dispense the amount using the least number of bills possible.
For instance, if the user requests $1234, the ATM dispenses 2 bills of $500 + 2 bills of $100 + 3 bills of $10 + 4 bills of  $1. On the other hand, if the user requests $1235, the machine dispenses 2 bills of $500 + 2 bills of $100 + 3 bills of $10 + 1 bill of $5
Use the skeleton code provided to create an ATM dispenser that takes the amount and prints the least number of bills that makes up the amount in the following format:
__ bills of $500 + __ bills of $100 + __ bills of $50 + __ bills of $10 + __ bills of $5 + __ bills of $1
Apply chain of responsibility pattern such that each denomination is handled by a separate handler.
