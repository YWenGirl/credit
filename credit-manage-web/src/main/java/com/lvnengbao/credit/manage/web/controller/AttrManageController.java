package com.lvnengbao.credit.manage.web.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lvnengbao.credit.bean.NplmBorrowerInfo;
import com.lvnengbao.credit.bean.NplmLoanContract;
import com.lvnengbao.credit.inter.NplmLoanContractService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class AttrManageController {

    @Reference
    NplmLoanContractService nplmLoanContractService;

/*    @RequestMapping("/checkSku")
    @ResponseBody
    public void  checkSku( HttpServletRequest request){

        String num = request.getParameter("num");
        System.out.println(num);


    }*/


/*    @RequestMapping("/searchForm")
    public void  searchForm( HttpServletRequest request){
        NplmBorrowerInfo nplmBorrowerInfo = new NplmBorrowerInfo();
        String loanContractNum = request.getParameter("loanContractNum");
        String clientName = request.getParameter("clientName");
        String param = request.getParameter("param");
        System.out.println(clientName);
        System.out.println(param);
        nplmBorrowerInfo.setClientName(clientName);
        nplmLoanContractService.getNplmBorrowerInfoAll()


    }*/
}