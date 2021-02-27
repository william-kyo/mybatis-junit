package xyz.wheelertree.mybatisjunit.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import xyz.wheelertree.mybatisjunit.domain.VisitorDO;
import xyz.wheelertree.mybatisjunit.domain.VisitorListQuery;

import java.util.List;

public interface VisitorMapper extends BaseMapper<VisitorDO> {
    List<VisitorDO> findPageWithMemberFlag(VisitorListQuery query);
}
