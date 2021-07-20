package Shape001;
public class Rectangle extends Shape  
{
    public Rectangle()
    {
        super("Width", "Length");
    }

    public void Compute()
    {
        this._Result = this._Value1 * this._Value2;
    }
}
