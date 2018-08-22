package com.lvnengbao.credit.manage.service.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.lvnengbao.credit.bean.NplmBorrowerInfo;
import com.lvnengbao.credit.bean.NplmContractAttribute;
import com.lvnengbao.credit.bean.NplmLoanContract;
import com.lvnengbao.credit.inter.NplmLoanContractService;
import com.lvnengbao.credit.manage.service.mapper.NplmBorrowerInfoMapper;
import com.lvnengbao.credit.manage.service.mapper.NplmContractAttributeMapper;
import com.lvnengbao.credit.manage.service.mapper.NplmLoanContractMapper;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;

@Service
public class NplmLoanContractServiceImpl implements NplmLoanContractService {

    @Autowired
    private  NplmLoanContractMapper nplmLoanContractMapper;

    @Autowired
    private NplmBorrowerInfoMapper nplmBorrowerInfoMapper;
    @Autowired
    private NplmContractAttributeMapper nplmContractAttributeMapper;
    @Override
    public List<NplmLoanContract> getAll() {

        return nplmLoanContractMapper.selectAll();
    }

    @Override
    public List<NplmBorrowerInfo> getNplmBorrowerInfoAll(Integer rows, Integer page,NplmBorrowerInfo nplmBorrowerInfo) {
   /*     List<NplmBorrowerInfo> nplmBorrowerInfos = nplmBorrowerInfoMapper.selectAll();*/


/*        String pageSize = "0";
        String pageNumber = "2";
        int pageNum = Integer.parseInt(pageSize);
        int rows = Integer.parseInt(pageNumber);*/
        List<NplmBorrowerInfo> NplmBorrowerInfoAll = nplmBorrowerInfoMapper.getNplmBorrowerInfo(rows,page,nplmBorrowerInfo);


        return  NplmBorrowerInfoAll;
    }



    @Override
    public List<NplmContractAttribute> getNplmContractAttribute() {
        return nplmContractAttributeMapper.selectAll();
    }

    @Override
    public int getTotal(NplmBorrowerInfo nplmBorrowerInfo) {
        int total = nplmBorrowerInfoMapper.getTotal(nplmBorrowerInfo);
        return total;
    }
}
