package com.lgj.dao;

import com.lgj.entity.PAuthor;
import java.util.List;

public interface PAuthorMapper {
    int deleteByPrimaryKey(Integer author_id);

    int insert(PAuthor record);

    PAuthor selectByPrimaryKey(Integer author_id);

    List<PAuthor> selectAll();

    int updateByPrimaryKey(PAuthor record);
}