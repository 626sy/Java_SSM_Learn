package com.neusoft.mapper;

import com.neusoft.po.Probation;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

@Repository
public interface ProbationMapper {
    @Update("update probation set endtime=#{endtime} ,rslt=#{rslt} where empid=#{empid}")
    public int modEndProbation(Probation probation);
}
