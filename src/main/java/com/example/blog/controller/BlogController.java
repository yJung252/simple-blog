package com.example.blog.controller;

import com.example.blog.vo.Member;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/blog")
public class BlogController {
    @RequestMapping(value="/sayHello", method = RequestMethod.GET)
    public String sayHello() {
        return "Hello, Yejeong.";
    }

    @RequestMapping(value="/getInfo", method = RequestMethod.GET)
    public Member getInfo() {
        Member member = new Member(1, "yejeong, Lee", "hyeye101921@naver.com");

        return member;
    }

    @RequestMapping(value="/list", method = RequestMethod.GET)
    public List<Member> list() {
        List<Member> memberList = Arrays.asList(new Member[]{new Member(1, "yejeong, Lee", "hyeye101921@naver.com"),
                new Member(2, "yejeong, Lee", "hyeye101921@naver.com"),
                new Member(3, "yejeong, Lee", "hyeye101921@naver.com"),
                new Member(4, "yejeong, Lee", "hyeye101921@naver.com"),
                new Member(5, "yejeong, Lee", "hyeye101921@naver.com")}
                );

        long startTime = System.currentTimeMillis();
        for (Member member : memberList) { // for-loop (for-each)
            System.out.println(member);
        }
        System.out.println("for-loop:" +
                (System.currentTimeMillis()- startTime) + "ms");

        startTime = System.currentTimeMillis();
        memberList.forEach(System.out::println);
        System.out.println("lamda:" +
                (System.currentTimeMillis()- startTime) + "ms");

        return memberList;
    }
}

