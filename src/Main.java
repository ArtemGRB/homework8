public class Main {
    public static void main(String[] args) {

        //задание 1
        int[] arrayInt = new int[3];
        arrayInt[0] = 1;
        arrayInt[1] = 2;
        arrayInt[2] = 3;

        float[] arrayFloat = {1.57f, 7.654f, 9.986f};

        boolean[] arrayBoolean = {true, false, false};

        //Задание 2
        for (int i = 0; i < arrayInt.length; i++){
            System.out.print(arrayInt[i]);
            if (i != arrayInt.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < arrayFloat.length; i++){
            System.out.print(arrayFloat[i]);
            if (i != arrayFloat.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < arrayBoolean.length; i++){
            System.out.print(arrayBoolean[i]);
            if (i != arrayBoolean.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println("\n");

        //Задание 3
        for (int i = arrayInt.length - 1; i >= 0; i--){
            System.out.print(arrayInt[i]);
            if (i != 0){
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = arrayFloat.length - 1; i >= 0; i--){
            System.out.print(arrayFloat[i]);
            if (i != 0){
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = arrayBoolean.length - 1; i >= 0; i--){
            System.out.print(arrayBoolean[i]);
            if (i != 0){
                System.out.print(", ");
            }
        }
        System.out.println("\n");

        //Задание 4
        for (int i = 0; i < arrayInt.length; i++){
            if (arrayInt[i]%2 != 0){
                arrayInt[i]++;
            }
        }
        for (int i = 0; i < arrayInt.length; i++){
            System.out.print(arrayInt[i]);
            if (i != arrayInt.length - 1){
                System.out.print(", ");
            }
        }

    }
}