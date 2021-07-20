package Shape001;
public abstract class Shape
{
    private String 
        _Name1,
        _Name2;
    protected double 
        _Value1,
        _Value2,
        _Result;
    public Shape(String name1, String name2)
    {
        this._Name1 = name1;
        this._Name2 = name2;
    }
    public void CollectData()
    {
        java.util.Scanner 
            objScanner = new java.util.Scanner(System.in);
        System.out.println("Enter the " + this._Name1 + " :");
        this._Value1 = objScanner.nextDouble();
        System.out.println("Enter the " + this._Name2 + " :");
        this._Value2 = objScanner.nextDouble();
    }
    public abstract void Compute();
    public void ShowResult()
    {
        System.out.println("Area = " + this._Result);
    }
}