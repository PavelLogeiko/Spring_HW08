package com.example.Spring_HW08.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Date;

@Aspect
@Component
public class UserActionAspect {

/**
вывод на консоль логов действия пользователя
 */
    @After("@annotation(com.example.Spring_HW08.aspect.TrackUserAction)")
    @Order(1)
    public void afterUserAction(JoinPoint joinPoint) {
        System.out.println("Действие пользователя: " + joinPoint.getSignature().getName() +
                " | " + LocalDateTime.now());
        System.out.println("\nРасшифровка действий:" +
                "\ngetAllNotes - получил список всех заметок" +
                "\ngetNoteById - получил заметку по Id" +
                "\nCreateNote - создал новую заметку" +
                "\neditNote - скорректировал заметку" +
                "\ndeleteNote - удалил заметку");
    }
}
