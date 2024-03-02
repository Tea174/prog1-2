

public enum Format {
   VHS("VHS"),
   DVD("DVD"),
   BLU_RAY("BLU_RAY");

   private final String name;
   Format(String name){
       this.name = name;
   }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name();
    }
}

