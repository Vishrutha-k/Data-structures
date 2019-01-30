class stack{
    int[] stack1;
    int top;
    void create_stack(int n)
    {
        stack1= new int[n];
        top=-1;
    }
    void push(int k)
    {
        if(top==stack1.length-1)
        {
            System.out.println("Stack overflow");
        }
        else{
            top++;
            stack1[top]=k;
        }
    }
    int pop()
    {
        int m=0;
        if(top<0)
        {
            System.out.println("Stack underflow");
        }
        else
        {
            m= stack1[top];
        }
        return m;
    }
}
public class sample
{
    public static void main(String args[])
    {
        stack s=new stack();
        s.create_stack(4);
        s.push(2);
        s.push(3);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(4);
        int l=s.pop();
        System.out.println(l);
    }
}
