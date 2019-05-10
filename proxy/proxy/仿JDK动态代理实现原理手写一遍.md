# 第三节: 仿JDK动态代理实现原理手写一遍

## 手写步骤

1.根据interfaces接口反射获取方法列表,然后重写,生成java文件

2.编译为class文件

3.类加载器加载class文件

4.返回class的实例