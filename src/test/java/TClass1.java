import org.testng.annotations.Test;

public class TClass1 {

    int num = 5;
    String mssg3 = "empty";

    @Test
    public void test0001(){
        System.out.println("printed");
    }

    @Test
    public void test002() {
        System.out.println(num);
    }

    @Test
    public void test003(){
        String mssg1 = new String("1");
        String mssg2 = "2";
        mssg3 = mssg1 + mssg2;
        System.out.println(mssg3);
    }

    @Test
    public void test004(){
        System.out.println(" I ve " + num + " funny cookies");
    }

    @Test
    public void test005(){
        boolean toBe = false;
        boolean b = toBe || toBe;

        if(b) {
            System.out.println(toBe);
        }

        int child = 0;

        int a = 0;
        b = true;
        boolean c = false;

        System.out.println(a);
    }

    @Test
    public void test006(){
        int a = 5;

        if (a == 5){
            System.out.println("Ohhhh.... so a is 4!");
        } else {
            System.out.println("a is not equal to 4");
        }
    }


    @Test
    public void test007(){
        int [] array = {1,9,9,5};

        for (int i=0; i<array.length; i++){
            int currentEl = array[i];
            System.out.println(currentEl);
        }
    }
}

//1