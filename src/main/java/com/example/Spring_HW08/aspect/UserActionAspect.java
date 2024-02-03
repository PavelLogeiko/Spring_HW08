package com.example.Spring_HW08.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.Date;

@Aspect
@Component
public class UserActionAspect {

    /**
    текущая дата и время
     */
Date currentDateAndTime = new Date();

/**
вывод на консоль логов действия пользователя
 */
    @After("@annotation(com.example.Spring_HW08.aspect.TrackUserAction)")
    public void afterUserAction(JoinPoint joinPoint) {
        System.out.println("Действие пользователя: " + joinPoint.getSignature().getName() +
                " | " + currentDateAndTime);
        System.out.println("\nРасшифровка действий:" +
                "\ngetAllNotes - получил список всех заметок" +
                "\ngetNoteById - получил заметку по Id" +
                "\nCreateNote - создал новую заметку" +
                "\neditNote - скорректировал заметку" +
                "\ndeleteNote - удалил заметку");
    }
}