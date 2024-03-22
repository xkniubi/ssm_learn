package com.chuck.mapper;


import com.chuck.pojo.Schedule;

import java.util.List;


public interface ScheduleMapper {
    List<Schedule> queryList();

    int deleteById(int id);

    int insert(Schedule schedule);

    int update(Schedule schedule);
}
