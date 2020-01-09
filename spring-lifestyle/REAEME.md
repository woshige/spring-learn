### spring的生命周期：
   只有四个：、
   实例化：instantiation
   属性赋值：populate
   初始化：initialization
   销毁：destruction
   Bean的实例化的过程其实就是：BeanDefinition变为一个Bean的过程。
   从refresh()方法中进行分析，核心的部分在finishBeanFactoryInitialization(BeanFactory)
   preInstantiateSingletons实例化BeanFactory中的非懒加载的单例Bean  