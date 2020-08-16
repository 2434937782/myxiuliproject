package com.kgc.client;

import com.kgc.pojo.Users;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "my-user-provider", fallback = UserFeginClientImpl.class)
public interface UserFeginClient {
    @RequestMapping("/add")
    public int add(@RequestBody Users users);

    @RequestMapping("/getPersonById/{id}")
    public Users getusersById(@PathVariable("id") Integer id);

    @RequestMapping("/update")
    public int update(@RequestBody Users users);

    @RequestMapping("/getName")
    public int getName(@RequestParam("name") String name);

    @RequestMapping("/findUserLogin")
    public Users findUserLogin(@RequestParam("name") String name,@RequestParam("password") String password);
}
