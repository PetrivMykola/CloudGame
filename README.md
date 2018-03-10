# CloudGame

## Task

Emma is playing a new mobile game involving 'n' clouds numbered from 0 to n-1 A player initially starts out on cloud C0 , and they must jump to cloud Cn-1 In each step, she can jump from any cloud 'i' to cloud i+1 or cloud i+2 
There are two types of clouds, ordinary clouds and thunderclouds. The game ends if Emma jumps onto a thundercloud, but if she reaches the last cloud i.e.,Cn-1, she wins the game!

Can you find the minimum number of jumps Emma must make to win the game? It is guaranteed that clouds C0 and Cn-1 are ordinary-clouds and it is always possible to win the game.

Input Format

The first line contains an integer, n(the total number of clouds). 
The second line contains n space-separated binary integers describing clouds C0, C1, C2.. Cn-1

If Ci=0 then ith cloud is an ordinary cloud
If Ci=1 then ith cloud is a thundercloud.

Constraints

2 <= n <= 100

Ci belongs to  {0,1}

C0 = Cn-1 = 0

Output Format

Print the minimum number of jumps needed to win the game.

Sample Input:
7
0 0 1 0 0 1 0

Sample Output
4
