package com.lvnengbao.credit.inter;

import com.lvnengbao.credit.bean.NplmBorrowerInfo;
import com.lvnengbao.credit.bean.NplmContractAttribute;
import com.lvnengbao.credit.bean.NplmLoanContract;

import java.util.List;

public interface NplmLoanContractService {


    public List<NplmLoanContract> getAll();

    public List<NplmContractAttribute> getNplmContractAttribute();

    public int getTotal(NplmBorrowerInfo nplmBorrowerInfo);


    public List<NplmBorrowerInfo> getNplmBorrowerInfoAll(Integer rows, Integer page,NplmBorrowerInfo nplmBorrowerInfo);




}
