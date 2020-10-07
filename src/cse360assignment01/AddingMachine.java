package cse360assignment01;

public class AddingMachine {
    private int total;
    private String strTotal;

    public AddingMachine () {
        total = 0;  // not needed - included for clarity
        strTotal = "0";
    }

    public int getTotal ()              //Returns the total of the adding machine
    {
        return total;
    }

    public void add (int value)          //Simple adding function, doesn't return
    {
        total += value;
        strTotal = (strTotal + " + " + value);
    }

    public void subtract (int value)        //Simple adding function, returns nothing
    {
        total -= value;
        strTotal = (strTotal + " - " + value);
    }

    public String toString ()               //Prints all operations
    {
        return strTotal.toString();
    }

    public void clear()                     //Clears the current adding machine
    {
        total = 0;
        strTotal = "0";
    }
}
