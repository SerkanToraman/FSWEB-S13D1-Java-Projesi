public class Main {

    /**
     * This method is for deciding whether to wake up when dog barks
     * @param  boolean param shows if dog barks or not. True barks, false doesnt bark
     * @param  this param shows the time between 8-20 returns false else returns true
     * @return true if dog barks and meet the time criteria
     */
    public static boolean shouldWakeUp(boolean DogBark, int time){
        boolean result=false;
        if(DogBark==true){
            switch((time>=8&&time<=20)?0:1){
                case 0 :
                    result=false;
                    System.out.println(false);
                    break;
                case 1 :
                    result=true;
                    System.out.println(true);
                    break;
            }
        }else{
            System.out.println(false);
            result=false;
        }
        return result;
    };
    /**
     * This method is for deciding whether to wake up when dog barks
     * @param  boolean param shows if dog barks or not. True barks, false doesnt bark
     * @param  this param shows the time between 8-20 returns false else returns true
     * @return true if dog barks and meet the time criteria
     */
    public static boolean hasTeen(int ...params){
        boolean result = false;
        for (int i = 0;i<params.length;i++){
            if(params[i]>=13 && params[i]<=19){
                result = true;
                break;
            }
        }
        if (result == true) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        return result;
    };
    /**
     * This method is for deciding whether to wake up when dog barks
     * @param  boolean param shows if the season is summer
     * @param  int param shows the temprature
     * @return true cat plays
     */
    public static boolean isCatPlaying(boolean season,int degree){
        boolean result = false;
        if(season==true){
            switch((degree>=25&&degree<=45)?1:0){
                case 0 :
                    result=false;
                    System.out.println(false);
                    break;
                case 1 :
                    result=true;
                    System.out.println(true);
                    break;
            }
        }else{
            switch((degree>=25&&degree<=35)?1:0){
                case 0 :
                    result=false;
                    System.out.println(false);
                    break;
                case 1 :
                    result=true;
                    System.out.println(true);
                    break;
            }
        }
        return result;
    };
    /**
     * This method is for calculating area
     * @param  int param shows the first length
     * @param  int param shows the second length
     * @return area of the rectangular
     */
    public static double area(double firstLength,double secondLength){
        double result = -1;
        if(firstLength>0 && secondLength>0){
              result = firstLength*secondLength;
              System.out.println(result);

        }else{
              result = -1;
              System.out.println(result);
        }

        return result;
    };
};

class dog {
    public static void main(String[] args) {
        Main dogBarking = new Main();     // Create a myCar object
        dogBarking.shouldWakeUp(true,21);
    }

}
class age {
    public static void main(String[] args) {
        Main ageCheck = new Main();     // Create a myCar object
        ageCheck.hasTeen(9,99,19);
    }
}
class cat {
    public static void main(String[] args) {
        Main catGame = new Main();     // Create a myCar object
        catGame.isCatPlaying(false,36);
    }
}

class area {
    public static void main(String[] args) {
        Main areaCalculation = new Main();     // Create a myCar object
        areaCalculation.area(4,-1);
    }
}



