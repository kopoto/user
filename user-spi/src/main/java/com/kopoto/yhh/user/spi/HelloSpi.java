package com.kopoto.yhh.user.spi;

import com.kopoto.yhh.user.UserAutoConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(value = UserAutoConfiguration.FEIGN_CLIENT_NAME)
public interface HelloSpi {
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    int test();
}
