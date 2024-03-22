package com.chuck.service;

import com.chuck.pojo.Schedule;
import com.chuck.utils.R;

public interface ScheduleService {
    R page(int pageSize,int currentPage);

    R remove(int id);

    R save(Schedule schedule);

    R update(Schedule schedule);
}
