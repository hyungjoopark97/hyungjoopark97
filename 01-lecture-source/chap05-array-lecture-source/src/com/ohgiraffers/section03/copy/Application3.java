package com.ohgiraffers.section03.copy;

import java.util.Arrays;

public class Application3 {

    public static void main(String[] args) {

        /* 깊은 복사에 대해 이해할 수 있다. */
        /* 깊은 복사는 heap에 생성된 배열이 가지고 있는 값을 또 다른 배열에 복사를 해놓은 것이다
        * 서로 같은 값을 가지고 있지만, 두 배열은 서로 다른 배열이기 때문에
        * 하나의 배열을 변경하더라도 다른 배열에는 영향을 주지 않는다. */

        /* 깊은 복사를 하는 방법은 4가지가 있습니다.
        * 1. for 문을 이용한 동일한 인덱스 값 복사
        * 2. Object의 clone()을 이용한 복사
        * 3. System의 arraycopy()를 이용한 복사
        * 4. Array의 copyOf()를 이용한 복사
        * 이 중에 가장 높은 성능을 보이는 것은 순수 배열의 복사를 위해 만들어진 arraycopy()메소드이며
        * 가장 많이 사용되는 방식은 좀 더 유연한 방식인 copyOf이다
        * clone()은 이전 배열과 같은 배열밖에 만들 수 없다는 특징을 가지고
        * 그 외 3 가지 방법은 복사하는 배열의 길이를 마음대로 조절할 수 있다는 특징을 가지고있다. (방을 다른 크기로 만들 수 있다)
         */

      int[] originArr = new int []{1,2,3,4,5};
      print(originArr);

      /* 1. for 문을 통해서 동일한 인덱스 값 복사 */
        int[] copyArr = new int[10];

        for(int i = 0; i<originArr.length ; i++){
            copyArr[i] = originArr[i];

        }

        print(copyArr);  // 12345까지는 복사되고 이후는 기본값으로 채워지며, 주소 또한 달라짐. 깊은 복사

        /* 2. Object의 clone()을 이용한 복사 */
        int[] copyArr2 = originArr.clone();
        print(copyArr2);  // 동일한 길이와 값을 가진 배열이 생성됐으나 주소값이 다르다.

        /* 3. System의 arraycopy()를 이용한 복사*/
        int[] copyArr3 = new int[10];
        /* 원본배열.복사를 시작할 인덱스.복사할 배열. 복사를 시작할 인덱스. 복사할 길이의 의미를 가진다. */
        System.arraycopy(originArr, 0, copyArr3, 3, originArr.length);

        print(copyArr3);  //  10개의 배열 내용 중 복사할 내용을 3부터라고 지정했기 때문에 01234번째부터 12345가 들어간다.

        /*4. Arrays의 copyOf()를 이용한 복사 */
        int[]copyArr4 = Arrays.copyOf(originArr, 7 );

        print(copyArr4); // 7개의 길이에 12345를 담음












    }

    public static void print(int[] iarr){

        System.out.println("iarr.hashCod() = " + iarr.hashCode());
        for(int i =0 ; i<iarr.length ; i++){
            System.out.print(iarr[i] + " ");

        }
        System.out.println();





    }







}
