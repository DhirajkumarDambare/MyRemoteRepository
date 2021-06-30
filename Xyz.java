class B extends A
{
    B()
    {
     
        System.out.println("B()");
    }
    B(String s)
    {
        this();
        System.out.println("B(String)");
    }
}
