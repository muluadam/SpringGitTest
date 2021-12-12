package com.ea.springgittest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringGitTestApplication {

    public void func(){
        System.out.print("Hello");
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringGitTestApplication.class, args);
        Obsa.print();
    }



}

// making some changesss
//this is another test
