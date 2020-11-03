public class NinthGrader extends Student {
    public NinthGrader(String a, String b, int c) {
        super(a, b, c);
        
    }
    public NinthGrader() {
        super("Wyatt", "Poage", 2024);
        
        
    }
    public void doSomething() {
        System.out.println("Im doing ninth grade things");
    }
    public String toString(){
        String str = this.getFirstName() + " " + this.getLastName() + ", " + this.getClassYear()+ "(2024)";
        return str;
    }


}