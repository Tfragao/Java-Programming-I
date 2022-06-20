
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }
    
    public boolean largerThan(Apartment compared){
        if (this.squares > compared.squares){
            return true;
        }
        if(this.squares < compared.squares){
            return false;
        }
        
        return false;
    }
    
    public int priceDifference(Apartment compared){
        int priceObjectcalled = this.princePerSquare * this.squares;
        int priceObjectReceived = compared.princePerSquare * compared.squares;
        
        return Math.abs(priceObjectcalled - priceObjectReceived);
    }
    
    public boolean moreExpensiveThan(Apartment compared){
        if (this.princePerSquare > compared.princePerSquare){
            return true;
        }
        if (this.princePerSquare < compared.princePerSquare){
            return false;
        }
        
        return false;
    }

}
