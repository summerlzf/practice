package com.kedu.practice;

import com.kedu.practice.entity.UserInfo;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author liuzifeng
 */
@SpringBootTest
public class StreamTest {

    @Test
    public void test() {
        UserInfo vo = new UserInfo();
        vo.setId(1);
        vo.setName("");
        List<UserInfo> list = new ArrayList<>();
        list.add(vo);
        String name = list.stream().findFirst().map(UserInfo::getName).orElse("[empty]");
        System.out.println("name: " + name);
        if (name.length() == 0) {
            vo = null;
        }
        name = Optional.ofNullable(vo).map(UserInfo::getName).orElse("{empty}");
        System.out.println("name: " + name);
    }
}
