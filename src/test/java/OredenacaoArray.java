import org.apache.logging.log4j.util.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;


public class OredenacaoArray {

    int[] nums1 = {4,5,6,0,0,0};
    int[] nums2 = {1,2,3};
    int m = 3;
    int n = 3;

    @Test
    @DisplayName("Ordenar em ordem crescente com insert sort")
    public void ordenarArrPorInsertSort() {


        int i;
        int[] arrEsperado = {1,2,3,4,5,6};
        for(i = 0; i < nums2.length; i++){
            nums1[i + m] = nums2[i];
        }
       for(int j = 0; j < nums1.length; j++){
           for(i = 0; i < nums1.length - 1; i++ ){

               if(nums1[i] > nums1[i + 1]){
                   System.out.println("Saida " + i);

                   int aux = nums1[i];
                   nums1[i] = nums1[i + 1];
                   nums1[i + 1] = aux;
                   System.out.println(Arrays.toString(nums1));

               }
           }
       }
        Assertions.assertEquals(Arrays.toString(arrEsperado), Arrays.toString(nums1));
    }

@Test
@DisplayName("Ordenar em ordem crescente com select sort")

public void ordenarArrPorSelect() {

        int[] arr = {5, 6, 8, 4, 2, 9};
        int[] arrEsperado = {2, 4, 5, 6, 8, 9};
        int len = arr.length;
        int aux;


        for(int j = 0; j < len; j++) {
            int menor_indx = j;
            for (int i = j; i < len; i++) {
                if (arr[i] < arr[menor_indx]) {
                    menor_indx = i;
                }
            }
            if(arr[j] != arr[menor_indx]){
                aux = arr[j];
                arr[j] = arr[menor_indx];
                arr[menor_indx] = aux;
            }
        }
        System.out.println(Arrays.toString(arr));
        Assertions.assertEquals(Arrays.toString(arrEsperado), Arrays.toString(arr));

    }
}