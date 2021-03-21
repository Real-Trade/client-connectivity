package com.realtrade.clientconnectivity.valiationstest;

import com.realtrade.clientconnectivity.controller.AdminController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class ValidationsTest {
    @Autowired
    private AdminController adminController;

    @Test
    public void contextLoads(){
        assertThat(adminController).isNotNull();
    }
}
