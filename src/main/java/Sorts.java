public class Sorts {
    ArrayGen arrayGen = new ArrayGen();

    public  void max_min_avg(){
       double[] array = arrayGen.genArrayD(100);

        double max = array[0];
        double min = array[0];
        double avg = 0;

        for (int i=0; i<array.length; i++){
            if (max < array[i]) max=array[i];
            if (min > array[i]) min=array[i];
            avg += array[i] / array.length;
        }

        System.out.println("max: " +  max + " mix: " + min + " avg: " + avg);
    } //выводит max,min,avg from array

    public  void puzir() {
        double[] array = arrayGen.genArrayD(10);
        for (int i=0 ; i<array.length; i++){
            for (int j=0; j<array.length-1-i;j++){
                if (array[j] > array[j+1]){
                    double tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] =tmp;
                }
            }
        }
        System.out.println("Пузырь mthfck: ");
        for (int i=0; i<array.length; i++)
            System.out.println(array[i]);
    } //bubble sorting

    public void simpleC(int L, int R){
        int [] arrayFirst = arrayGen.genArrayL_R(L ,R);
        int [] array = new int[R - L];
        int count =0;

        check:
        for (int i = L ; i <= arrayFirst.length; i++) {
            for (int j = L; j < i; j++) {
                if (i % j == 0) {

                    continue check;
                }
            }
            array[count] = i;
            count++;
        }
        System.out.println("Простые числа == ");
        if (array.length > 0){
            for (int i=0; i< array.length; i++){
                if (array[i] > 0)
                    System.out.println(array[i]);
            }
        }
    }
}
