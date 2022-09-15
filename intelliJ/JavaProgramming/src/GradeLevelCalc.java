public class GradeLevelCalc {
    public static void main(String[] args) {
        int grade = IBIO.inputInt("Enter your grade: ");
        if(grade>0 && grade<6){
            System.out.println("Elementary School");
        } else if(grade>5 && grade<9){
            System.out.println("Middle School");
        } else if(grade>8 && grade<13){
            System.out.println("High School");
        } else {
            System.out.println("Invalid Grade");
        }
    }
}
