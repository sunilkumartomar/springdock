package com.springdockertest.springdock;

import com.springdockertest.springdock.util.PDFGenerator;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Random;
import java.util.stream.Stream;

@SpringBootApplication
public class SpringdockApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringdockApplication.class, args);
        PDFGenerator pdfGenerator = context.getBean("pdfGenerator", PDFGenerator.class);
        pdfGenerator.generatePdfReport();

    }

    public static void api(String[] args) {

        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <10 ; i++) {
                    System.out.println(i);
                }
            }
        };
    }
}
