public class CarRecallExerciseBook {
    public static void main(String[] args) {
        int modelNum = IBIO.inputInt("Enter the car's model number: ");
        if(modelNum==119 || modelNum==179 || modelNum==221 || modelNum==780 || (modelNum>188 && modelNum<196)){
            System.out.println("Your car is defective! It must be repaired!");
        }
        else{
            System.out.println("Your car is not defective!");
        }
    }
}
