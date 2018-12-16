package com.lgj.dao;

import com.lgj.entity.PPost;
import java.util.List;

public interface PPostMapper {
    int deleteByPrimaryKey(Integer post_id);

    int insert(PPost record);

    PPost selectByPrimaryKey(Integer post_id);

    List<PPost> selectAll();

    int updateByPrimaryKey(PPost record);
}