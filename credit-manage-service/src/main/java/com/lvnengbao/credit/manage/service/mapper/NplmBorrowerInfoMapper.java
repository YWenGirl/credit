package com.lvnengbao.credit.manage.service.mapper;

import com.lvnengbao.credit.bean.NplmBorrowerInfo;

import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface NplmBorrowerInfoMapper extends Mapper<NplmBorrowerInfo> {
    public List<NplmBorrowerInfo> getNplmBorrowerInfo(@Param("pageNum")Integer pageNum, @Param("rows")Integer rows,@Param("nplmBorrowerInfo") NplmBorrowerInfo nplmBorrowerInfo);
    public  int getTotal(@Param("nplmBorrowerInfo") NplmBorrowerInfo nplmBorrowerInfo);

}
