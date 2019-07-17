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

    /**
     * @Description    转换的抽象方法
     * @Author         wangyu08334
     * @CreateDate     Jul 16, 2019 5:41:23 PM
     * @param param
     * @return
     */
    public T trans(R param);
    
    /*
     * @Description    可以定义有默认实现的方法
     */
    default void doSth() {
        return;
    }

    /* 
     * 可以定义java.lang.Object里的public方法
     */
    @Override
    boolean equals(Object obj);
    
    
    
}
