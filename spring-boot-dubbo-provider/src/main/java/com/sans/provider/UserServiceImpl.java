package com.sans.provider;

import com.sans.base.dto.ProviderTestDTO;
import com.sans.base.service.IUserService;
import org.apache.dubbo.config.annotation.DubboService;
import org.apache.dubbo.config.annotation.Service;
import java.util.ArrayList;
import java.util.List;

/**
 * 生产者Dubbo接口实现
 */
//@Service
@DubboService
public class UserServiceImpl implements IUserService {
    @Override
    public List<ProviderTestDTO> queryList() {
        // 初始化数据
        ProviderTestDTO testDTO1 = new ProviderTestDTO();
        testDTO1.setId(1);
        testDTO1.setName("学生");
        testDTO1.setNumber(100);
        ProviderTestDTO testDTO2 = new ProviderTestDTO();
        testDTO2.setId(2);
        testDTO2.setName("教师");
        testDTO2.setNumber(101);
        // 组装数据
        List<ProviderTestDTO> list = new ArrayList<>();
        list.add(testDTO1);
        list.add(testDTO2);
        return list;
    }
}