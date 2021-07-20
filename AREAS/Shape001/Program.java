package Shape001;
public class Program
{
    public static void main(String[] args)
    {
        Shape
            objShape = null;
            
        objShape = new Rectangle();   
        objShape.CollectData();
        objShape.Compute();
        objShape.ShowResult();
        
        objShape = new Triangle();
        objShape.CollectData();
        objShape.Compute();
        objShape.ShowResult();
        
        objShape = new Circle();
        objShape.CollectData();
        objShape.Compute();
        objShape.ShowResult();
    }
}
