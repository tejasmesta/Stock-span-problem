class Solution
{
    //Function to calculate the span of stockâ€™s price for all n days.
    public static int[] calculateSpan(int price[], int n)
    {
        // Your code here
        int S[] = new int[n];
        
        Deque<Integer> st = new ArrayDeque<Integer>();
        
        st.push(0);
  
        
        S[0] = 1;
  
        
        for (int i = 1; i < n; i++) {

            while (!st.isEmpty() && price[st.peek()] <= price[i])
                st.pop();
  
            S[i] = (st.isEmpty()) ? (i + 1) : (i - st.peek());
  
            
            st.push(i);
        }
        
        return S;
    }
    
}
