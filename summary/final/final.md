# 一句话总结设计模式

* 工厂模式:专业造东西,你要什么只管说,不用关心怎么造的(要吃鸡蛋你就说,不用关心哪个母鸡下的,怎么煮熟的)
* 单例模式:在任何地方,只有一个你
* 原型模式:面试的时候,复印简历
* 适配器:只要能办到的,我都给你兼容
* 装饰者模式:通过打扮,你也可以变得很帅
* 代理模式:黄牛无处不在,你需要他送到
* 委派模式:辛苦是你的,功劳是他的
* 策略模式:不同客户,我给你打不同的折扣
* 模板方法模式:组装流程,具体钩子留给需要子类
* 观察者模式:有什么事,在群里一说,我们都能看到



`AOP` 

```java
@Aspect
public class SpringAop {

	@Pointcut("execution(* org.andywong..*.*(..))")
	public void pointcut(){}

	@Before("pointcut()")
	public void before(){
		System.out.println("pointcut before");
	}

	@After("pointcut()")
	public void after(){
		System.out.println("pointcut after");
	}
}
```



`DI`

```java
    @Autowired
    private XxExportService xxExportService;
```

`IOC`

```java
Object bean1 = app.getBean("demoFactoryBean");
```



