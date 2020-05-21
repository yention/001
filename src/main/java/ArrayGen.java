public class ArrayGen {

    public double[] genArrayD(int n){
        double [] array = new double[n];
        for (int i=0; i<array.length; i++){
            array[i] = Math.random();
        }
        return array;
    }

    public int[] genArrayI(int n){
        int [] array = new int[n];
        for (int i=0; i<array.length; i++){
            array[i] = (int) Math.random();
        }
        return array;
    }

    public int[] genArrayL_R(int L, int R){

        int [] arrayFirst = new int[R];


        for (int i = 0; i < arrayFirst.length; i++) {
            arrayFirst[i] = (i < L-1) ? 0 : i + 1;
        }



        return arrayFirst;
    }
}
