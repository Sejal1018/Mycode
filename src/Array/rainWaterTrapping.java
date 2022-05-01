package Array;

public class rainWaterTrapping {
        //Main Method
        public static void main(String[] args) {
            int []Heights= {0,1,2,0,0,3,1,0,3};
            System.out.println(totalWaterTrapped(Heights));
        }
        private static int totalWaterTrapped(int []Height){
            //length of the array that we have passed that stores the heights of the Buildings
            //int numberOfBuildings=Height.length;
            //Array-> That will Store the Maximum Height Building Available At Left
            int []leftMaxBuilding= new int[Height.length];
            //Array-> That will Store the Maximum Height Building Available At Right
            int []rightMaxBuilding= new int [Height.length];
            //Filling the 1st
            leftMaxBuilding[0]=Height[0];
            for (int i = 1; i <Height.length ; i++) {
                leftMaxBuilding[i]=Math.max(leftMaxBuilding[i-1],Height[i]);
            }
            rightMaxBuilding[Height.length-1]=Height[Height.length-1];
            for (int i = Height.length-2; i >=0 ; i--) {
                rightMaxBuilding[i]=Math.max(rightMaxBuilding[i+1],Height[i]);
            }
            int Water=0;
            for (int i = 0; i <Height.length ; i++) {
                Water=Water+Math.min(leftMaxBuilding[i],rightMaxBuilding[i])-Height[i];
            }

            return Water;
        }
    }

