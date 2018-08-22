# SpringCore-v5.0.8-XMLBased-Configuration
Spring version 5.0.8, JDK 10, XML Based Configuration

# Spring Configuration
BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("spring.xml")); is deprecated. 
Alternative Solution for BeanFactory -: 
  DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
  XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
  reader.loadBeanDefinitions("spring.xml");
  
  OR
  
  ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
