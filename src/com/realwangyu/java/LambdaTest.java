/**     
  * 文件描述
  * @ProductName    Hundsun HEP
  * @ProjectName    JavaTest
  * @Package        com.realwangyu.java
  * @Description    note
  * @Author         wangyu08334
  * @CreateDate     Jul 16, 2019 4:23:09 PM
  * @UpdateRemark   The modified content
  * @Version        1.0
  *
  * Copyright © 2019 Hundsun Technologies Inc. All Rights Reserved
**/

package com.realwangyu.java;

/**
 * @Description    note
 * @Author         wangyu08334
 * @CreateDate     Jul 16, 2019 4:23:09 PM
 */
public class LambdaTest {

    /**
     * @Description    note
     * @Author         wangyu08334
     * @CreateDate     Jul 16, 2019 4:23:09 PM
     * @param args
     */
    public static void main(String[] args) {
        Trans<Integer, String> trans = (param) -> {
            Integer.valueOf(param);
            return 1;};
        int i = trans.trans("100");
        System.out.println("after trans i:" + i);
    }

}
