/**     
  * 文件描述
  * @ProductName    Hundsun HEP
  * @ProjectName    JavaTest
  * @Package        com.realwangyu.java
  * @Description    note
  * @Author         wangyu08334
  * @CreateDate     Jul 16, 2019 4:27:58 PM
  * @UpdateRemark   The modified content
  * @Version        1.0
  *
  * Copyright © 2019 Hundsun Technologies Inc. All Rights Reserved
**/

package com.realwangyu.java;

/**
 * @Description    函数式接口，SAM，只有一个抽象方法的接口，主要用于lambda表达式
 * @Author         wangyu08334
 * @CreateDate     Jul 16, 2019 4:27:58 PM
 */
@FunctionalInterface
public interface Trans<T, R> {

    public T trans(R param);
    
}
