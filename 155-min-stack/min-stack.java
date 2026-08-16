class MinStack {
    ArrayList<Integer> st;
    ArrayList<Integer> min;
    public MinStack() {
        st = new ArrayList<>();
        min = new ArrayList<>();
    }
    
    public void push(int value) {
        st.add(value);
        if(!min.isEmpty()){
            value = Math.min(value,min.getLast());
        }
        min.add(value);
    }
    
    public void pop() {
        st.removeLast();
        min.removeLast();
    }
    
    public int top() {
        return st.getLast();
    }
    
    public int getMin() {
        return min.getLast();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */