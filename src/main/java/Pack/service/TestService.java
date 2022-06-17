package Pack.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Pack.mapper.TestMapper;
import Pack.vo.TestVo;
import Pack.vo.WarehouseVo;

@Service
public class TestService {
    @Autowired
    public TestMapper mapper;

    public List<TestVo> selectTest() {
        return mapper.selectTest();
    }
}
