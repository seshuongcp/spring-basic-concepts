package com.example;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.core.annotation.Order;

@Configuration
public class AppConfig {

    @Bean
    HelloService helloService() {
        return new HelloService();
    }

    @Bean
    GreetingRepository getGreetingRepository() {
        return new GreetingRepository();
    }

    @Bean
    GreetingService getGreetingService(GreetingRepository repository) {
        return new GreetingService(repository);
    }

    /*@Bean
    MultiConstructorService getMultiConstructorService(GreetingRepository greetingRepository, @Value("${app.multiservice.message}") String msg){
        return new MultiConstructorService(greetingRepository, msg);
    }*/

    @Bean
    MultiConstructorService getMultiConstructorService() {
        return new MultiConstructorService();
    }

    @Bean
    UserService getUserService() {
        return new UserService();
    }

    @Bean()
    public UserRepository userRepository() {
        return new UserRepository();
    }

    @Bean
    public OrderService getOrderService() {
        return new OrderService();
    }

    @Bean
    public OrderRepository getOrderRepository() {
        return new OrderRepository();
    }

    @Bean
    public CreditCardPaymentService getCreateCardPaymentService() {
        return new CreditCardPaymentService();
    }

    @Bean
    public UPIPaymentService getUPIPaymentService() {
        return new UPIPaymentService();
    }

    @Bean
    public CheckoutService getCheckOutService(@Qualifier("getCreateCardPaymentService") PaymentService paymentService) {
        return new CheckoutService(paymentService);
    }

    @Bean
    public LifecycleService lifecycleService() {
        return new LifecycleService();
    }

    @Bean
    public ReportService reportService() {
        return new ReportService();
    }

    @Bean
    @Scope("prototype")
    public TaskService taskService() {
        return new TaskService();
    }

    @Bean
    public WorkflowService workflowService(TaskService taskService) {
        return new WorkflowService(taskService);
    }


}
