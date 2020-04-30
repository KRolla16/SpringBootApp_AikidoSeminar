package io.swagger.aspects;

import io.swagger.model.User;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Component
@Aspect
public class UserHelper {


    @Pointcut("execution( * io.swagger.service.UserService.addUser(..))")
    private void addUser() {}

    @Pointcut("execution( * io.swagger.service.UserService.findAllUsers(..))")
    private void findAllUsers() {
    }

    @Before("addUser()")
    public void log() {
        System.out.println(" called");
    }



    @Around("execution( * io.swagger.service.UserService.addUser(..))")
    public Object doThing(final ProceedingJoinPoint thisJoinPoint) throws Throwable {
        final String joinPointName = thisJoinPoint.getThis().getClass().getSimpleName() + "." + thisJoinPoint.getSignature().getName() + "()";
        System.out.println("Entering [" + joinPointName + "]");
        Object retVal = thisJoinPoint.proceed();
        System.out.println("Leaving  [" + joinPointName + "]");
        return retVal;
    }

    @AfterReturning(pointcut = "findAllUsers()", returning = "o")
    public void sort(Object o){
        System.out.println(" called");
        List<User> userList = (List<User>) o;
        System.out.println(userList);
        userList.sort(Comparator.comparing(User::getKyu));
        System.out.println(userList);

        String BestKyu = Collections.min(userList, Comparator.comparing(User::getKyu)).getKyu();
        System.out.println("The smaller the grade of Kyu the participant has, the more skills he has mastered.");
        System.out.println(BestKyu + "Kyu");
        String BestKyuUsername = Collections.min(userList, Comparator.comparing(User::getKyu)).getUsername();
        System.out.println("The user who has the greatest skills:");
        System.out.println(BestKyuUsername);

        //counter
        Map<Object, Long> toMap;
        toMap = userList.stream().collect(Collectors.groupingBy(user -> user.getKyu(), Collectors.counting()));
        System.out.println("Number of users that have reached a specific Kyu level  ");
        System.out.println(toMap);
        }
    }

