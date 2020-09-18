package com.neusoft.mapper;

import com.neusoft.po.WorkLog;
import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkLogMapper {
    @Insert("insert into workLog(loginfo,clss,optime,empid) values(#{loginfo},#{clss},#{optime},#{empid})")
    public int addLog(WorkLog log);
}
