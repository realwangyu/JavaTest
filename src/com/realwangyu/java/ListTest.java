/**     
  * 文件描述
  * @ProductName    Hundsun HEP
  * @ProjectName    JavaTest
  * @Package        com.realwangyu.java
  * @Description    note
  * @Author         wangyu08334
  * @CreateDate     May 31, 2019 2:36:46 PM
  * @UpdateRemark   The modified content
  * @Version        1.0
  *
  * Copyright © 2019 Hundsun Technologies Inc. All Rights Reserved
**/

package com.realwangyu.java;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description    note
 * @Author         wangyu08334
 * @CreateDate     May 31, 2019 2:36:46 PM
 */
public class ListTest {
    
    int i;
    
    double d;
    
    int i1;
    
    int i2;

    /**
     * @Description    note
     * @Author         wangyu08334
     * @CreateDate     May 31, 2019 2:36:46 PM
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        List<TestObj> testObjs = new ArrayList<TestObj>();
        TestObj testObj = new TestObj();
        testObj.setI(1);
        testObj.setS("one");
        testObjs.add(testObj);
        for (TestObj testObj1 : testObjs) {
            System.out.println(testObj1.getI() + testObj1.getS());
            System.out.println("1end");
        }
        testObj.setI(2);
        testObj.setS("two");
        testObjs.add(testObj);
        for (TestObj testObj2 : testObjs) {
            System.out.println(testObj2.getI() + testObj2.getS());
        }
    }

}
