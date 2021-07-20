package Shape001;

public class Triangle extends Shape  
{
    public Triangle()
    {
        super("Height", "Base");
    }

    public void Compute()
    {
        this._Result = this._Value1 * this._Value2 / 2;
    }
}
