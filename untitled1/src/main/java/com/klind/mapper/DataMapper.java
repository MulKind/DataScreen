package com.klind.mapper;

import org.apache.ibatis.annotations.Param;
import com.klind.entity.data;
import java.util.List;

public interface DataMapper {
    List<data> getData();
}
