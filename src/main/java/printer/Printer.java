package printer;

public class Printer {
    private int papersLeft ;
    private int toner ;
    public Printer(int papersLeft,int toner){
        this.toner=toner;
        this.papersLeft=papersLeft;

    }

    public int getPapersLeft() {
        return papersLeft;
    }
    public String print(int pages , int copies ){
      int NoOfPagesTakes = pages*copies;
      if (this.papersLeft >= NoOfPagesTakes){
          this.papersLeft-=NoOfPagesTakes;
          this.toner-= NoOfPagesTakes;
         return"pages left after print "+this.papersLeft;
      } else
      {
         return "not enough pages left to print";
      }
    }

    public int getToner() {
        return toner;
    }
}
