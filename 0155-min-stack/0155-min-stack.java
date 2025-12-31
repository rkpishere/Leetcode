class MinStack {
    Stack<Long> s=new Stack<>();
long min;

    public MinStack() {
        
    }
    
    public void push(int val) {
        long x =val;
        if(s.isEmpty()){
            s.push(x);
            min=x;
        }
        else if(x<min){
          s.push(2 * x - min);
            min = x;
        }
        else{
            s.push(x);
        }
        }
    
    
    public void pop() {
        long small=s.pop();
        if(small<min){
       min = 2 * min - small;
        }
    }
    
    public int top() {
       long top1 = s.peek();
    if (top1 < min) {
        return (int) min;
    }
    return (int) top1; 
    }
    
    public int getMin() {
     return (int) min;   
    }

}
/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */