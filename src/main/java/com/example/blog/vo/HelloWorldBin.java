package com.example.blog.vo;

import lombok.Data;

@Data
public class HelloWorldBin {
    private String message;

    public HelloWorldBin(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return String.format("HelloWorldBin{message='%s'}", message);

/*        StringBuilder sb = new StringBuilder();
        sb.append("HelloWorldbin{")
                .append("message='")
                .append(message)
                .append('\'')
                .append('}');

        return sb.toString();*/

/*        return "HelloWorldBin{" +
                "message='" + message + '\'' +
                '}';*/
    }
}
