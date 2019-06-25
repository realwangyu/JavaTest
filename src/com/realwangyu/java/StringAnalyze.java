/**     
  * 文件描述
  * @ProductName    Hundsun HEP
  * @ProjectName    JavaTest
  * @Package        com.realwangyu.java
  * @Description    note
  * @Author         wangyu08334
  * @CreateDate     Jun 25, 2019 11:48:49 AM
  * @UpdateRemark   The modified content
  * @Version        1.0
  *
  * Copyright © 2019 Hundsun Technologies Inc. All Rights Reserved
**/

package com.realwangyu.java;

/**
 * @Description    字符串分析测试类
 * @Author         wangyu08334
 * @CreateDate     Jun 25, 2019 11:48:49 AM
 */
public class StringAnalyze {
    // 适当性特定系统配置解析测试类
    public static void main(String[] args) {
        // 手写的测试配置字符串（模拟获取到的系统配置值）
        final String config = ",1&1^5,2&2^7^9,";
        final String testConfig = "1,5,6,2,3,8";
        String[] testConfigs = testConfig.split(",");
        // 1.判断是否存在目标配置
        int pos = config.indexOf("2&");
        // 1.1不存在直接返回
        if (pos < 0) {
            return;
        }
        // 2.获取目标配置及之后的字符串
        String subConfigString = config.substring(pos);
        // 3.去除目标配配置的开头和结尾的逗号
        subConfigString = subConfigString.substring(2, subConfigString.indexOf(","));
        // 拆分成一个个单独配置
        String[] confiStrings = subConfigString.split("\\^");
        // 判断
        for (String string : confiStrings) {
            if (string.equals("9")) {
                System.out.println("matched!");
                break;
            }
        }
        
        for (String string : testConfigs) {
            for (String string2 : confiStrings) {
                if (string.equals(string2)) {
                    System.out.println("matched!");
                    return;
                }
            }
        }
    }

}
