package xyz.wheelertree.mybatisjunit.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import xyz.wheelertree.mybatisjunit.domain.VisitorDO;
import xyz.wheelertree.mybatisjunit.domain.VisitorListQuery;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@ActiveProfiles("test")
@MapperScan("xyz.wheelertree.mybatisjunit.mapper")
@SpringBootTest
public class VisitorMapperTest {
    @Autowired
    private VisitorMapper mapper;

    @Test
    public void test_findPageWithMemberFlag() {
        VisitorListQuery query = new VisitorListQuery();
        query.setDeviceCode("abcd");
        List<VisitorDO> list = mapper.findPageWithMemberFlag(query);
        assertThat(list).hasSize(1);
    }

    @Test
    public void test_selectList() {
        List<VisitorDO> list = mapper.selectList(new QueryWrapper<>());
        assertThat(list).hasSize(1);
    }
}
