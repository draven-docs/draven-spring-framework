package com.noxus.draven.spel;

import com.noxus.draven.spel.config.LessonModel;
import com.noxus.draven.spel.config.MainConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 〈功能概述〉<br>
 *
 * @className: SpringSpelApp
 * @package: com.noxus.draven.spel
 * @author: draven
 * @date: 2021/1/7 15:35
 */
public class SpringSpelApp {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        context.register(MainConfig.class);
        context.refresh();
        LessonModel lessonModel = context.getBean(LessonModel.class);
        System.out.println(lessonModel);
        context.close();
    }
}
