// Given an unsorted array Arr of size N of positive integers. One number 'A' from set {1, 2, …N} is missing and one number 'B' occurs twice in array. Find these two numbers.

// Example 1:

// Input:
// N = 2
// Arr[] = {2, 2}
// Output: 2 1
// Explanation: Repeating number is 2 and 
// smallest positive missing number is 1.
// Example 2:

// Input:
// N = 3
// Arr[] = {1, 3, 3}
// Output: 3 2
// Explanation: Repeating number is 3 and 
// smallest positive missing number is 2.
// Your Task:
// You don't need to read input or print anything. Your task is to complete the function findTwoElement() which takes the array of integers arr and n as parameters and 
//   returns an array of integers of size 2 denoting the answer ( The first index contains B and second index contains A.)

// Expected Time Complexity: O(N)
// Expected Auxiliary Space: O(1)

// Constraints:
// 1 ≤ N ≤ 105 
// 1 ≤ Arr[i] ≤ N
___________________________________________________________________________________________________________________________________________
// { Driver Code Starts
#include <bits/stdc++.h>

using namespace std;
 
 // } Driver Code Ends
class Solution{
public:
    int *findTwoElement(int *arr, int n) {
        int x=0;
       int off=0,on=0; 
       for(int i=0;i<n;i++)
        { x^=arr[i]; }
        
        for(int i=1;i<=n;i++)
        { x^=i; }
        
      
       int rmsb=x & -x;
       
        for(int i=0;i<n;i++){
           if((arr[i] & rmsb)== 0)
            { off^=arr[i];}
            
            else 
           { on^=arr[i];}  //miss
       }
         for(int i=1;i<=n;i++){
            if((i & rmsb)== 0)
               { off^=i; }
            
            else 
              { on^=i; }
         }
         int dup=0,miss=0;
          for(int i=0;i<n;i++){
             if(arr[i]==on)  
            {  dup=on;
              miss=off;
             
            }
              
             else if(arr[i]==off)  
            {  dup=off;
              miss=on;
               
            } 
         
         }
        
        int *res=new int[2];
         res[0]=dup;
         res[1]=miss;
       
       
         return res;
         
    }
};

// { Driver Code Starts.

int main() {
    int t;
    cin >> t;
    while (t--) {
        int n;
        cin >> n;
        int a[n];
        for (int i = 0; i < n; i++) {
            cin >> a[i];
        }
        Solution ob;
        auto ans = ob.findTwoElement(a, n);
        cout << ans[0] << " " << ans[1] << "\n";
    }
    return 0;
}  // } Driver Code Ends
