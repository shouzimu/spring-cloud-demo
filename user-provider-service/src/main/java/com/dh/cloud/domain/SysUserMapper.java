package com.dh.cloud.domain;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface SysUserMapper {
    @Select("SELECT * FROM SYS_USER WHERE name = #{name}")
    SysUser findByName(@Param("name") String name);
}
