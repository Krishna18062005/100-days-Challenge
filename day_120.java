// Find Nth Root Of M
// Problem statement
// You are given two positive integers 'n' and 'm'. You have to return the 'nth' root of 'm', i.e. 'm(1/n)'. If the 'nth root is not an integer, return -1.
// Note:
// 'nth' root of an integer 'm' is a number, which, when raised to the power 'n', gives 'm' as a result.


public static int root(int n,int m){
    i=1
    while(Math.pow(i,n)<=m){
        if(Math.pow(i,n)==m)
            return i;
        i+=1}
    return -1
}
