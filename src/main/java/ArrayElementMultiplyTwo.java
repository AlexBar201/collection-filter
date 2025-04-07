public class ArrayElementMultiplyTwo implements Filter{

    @Override
    public int[] apply(int[] object){

        int[] multiplyElemObj = new int[object.length];

        for (int i = 0; i < object.length; i++){
            multiplyElemObj[i] = object[i] * 2;
        }

        return multiplyElemObj;
    }
}
