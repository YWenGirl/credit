package com.lvnengbao.credit.manage.web.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSON;
import com.lvnengbao.credit.bean.NplmBorrowerInfo;
import com.lvnengbao.credit.bean.NplmLoanContract;
import com.lvnengbao.credit.inter.NplmLoanContractService;

import com.lvnengbao.credit.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class ManageController {

    @Reference
    NplmLoanContractService nplmLoanContractService;

    /**
     *
     */
    @Autowired
    private PageUtil pageUtil;



    @RequestMapping("index")
    public String index(){
        //  视图 spring boot 默认返回thymeleaf 页面
        return "index";
    }

    // 左侧菜单栏中平台属性控制器
    @RequestMapping("fangkuan")
    public String getAttrListPage(){
        /*attrListPage.html*/
        return "fangkuan";
    }

    // 左侧菜单栏中平台属性控制器
    @RequestMapping("hetongliebiao")
    public String hetongliebiao(HttpServletRequest request){
        /*attrListPage.html*/
/*
        List<NplmLoanContract> nplmLoanContracts = nplmLoanContractService.getAll();
        List<NplmBorrowerInfo> nplmBorrowerInfos = nplmLoanContractService.getNplmBorrowerInfoAll();
        List<NplmContractAttribute> nplmContractAttribute = nplmLoanContractService.getNplmContractAttribute();
        request.setAttribute("nplmBorrowerInfos",nplmBorrowerInfos);
        request.setAttribute("nplmLoanContracts",nplmLoanContracts);
        request.setAttribute("nplmContractAttribute",nplmContractAttribute);
        return "hetongliebiao";*/

/*        String pageSize = "0";
        String pageNumber = "2";
        int pageNum = Integer.parseInt(pageSize);
        int rows = Integer.parseInt(pageNumber);*/
       /* List<NplmBorrowerInfo> nplmBorrowerInfoAll = nplmLoanContractService.getNplmBorrowerInfoAll();
        request.setAttribute("nplmBorrowerInfoAll",nplmBorrowerInfoAll);*/

       /* request.setAttribute("pageSize",pageUtil.getPageSize());
        *//*request.setAttribute("total",pageUtil.getTotalCount());*//*

        request.setAttribute("pageNew",pageUtil.getPageNow());
        int total = nplmLoanContractService.getTotal();
        pageUtil.setTotalCount(total);
        String s = String.valueOf(total);
        //总页数
        int totalPageCount = pageUtil.getTotalPageCount();

        request.setAttribute("total",s);*/
        return "hetongliebiao";
    }


    @RequestMapping(value = "query")
    @ResponseBody
    public Map<String,Object> getAll(@RequestParam("rows")Integer rows, @RequestParam("page")Integer page, HttpServletRequest request){
        String clientName = request.getParameter("clientName");
        System.out.println(clientName);

        NplmBorrowerInfo nplmBorrowerInfo = new NplmBorrowerInfo();
        nplmBorrowerInfo.setClientName(clientName);
        String s = JSON.toJSONString(nplmBorrowerInfo);
        System.out.println(s+".我爱你");
        List<NplmBorrowerInfo> nplmBorrowerInfoAll = nplmLoanContractService.getNplmBorrowerInfoAll((page-1),rows,nplmBorrowerInfo);

        int total = nplmLoanContractService.getTotal(nplmBorrowerInfo);
        request.setAttribute("nplmBorrowerInfoAll",nplmBorrowerInfoAll);
        Map map = new HashMap<>();
        map.put("total",total);
        map.put("rows",nplmBorrowerInfoAll);
        return map;


    }

    // 左侧菜单栏中平台属性控制器
    @RequestMapping("qianqifeiyongleibiao")
    public String qianqifeiyongleibiao(){
        /*attrListPage.html*/
        return "qianqifeiyongleibiao";
    }
    // 左侧菜单栏中平台属性控制器
    @RequestMapping("biangengfuwufeiliebiao")
    public String biangengfuwufeiliebiao(){
        /*attrListPage.html*/
        return "biangengfuwufeiliebiao";
    }
    // 左侧菜单栏中平台属性控制器
    @RequestMapping("daihuankuanliebiao")
    public String daihuankuanliebiao(){
        /*attrListPage.html*/
        return "daihuankuanliebiao";
    }
    // 左侧菜单栏中平台属性控制器
    @RequestMapping("yuqiliebiao")
    public String yuqiliebiao(){
        /*attrListPage.html*/
        return "yuqiliebiao";
    }
    // 左侧菜单栏中平台属性控制器
    @RequestMapping("yihuankuanliebiao")
    public String yihuankuanliebiao(){
        /*attrListPage.html*/
        return "yihuankuanliebiao";
    }
    // 左侧菜单栏中平台属性控制器
    @RequestMapping("koukuanjieguochaxun")
    public String koukuanjieguochaxun(){
        /*attrListPage.html*/
        return "koukuanjieguochaxun";
    }
    // 左侧菜单栏中平台属性控制器
    @RequestMapping("xintuokoukuanmingxichaxun")
    public String xintuokoukuanmingxichaxun(){
        /*attrListPage.html*/
        return "xintuokoukuanmingxichaxun";
    }
}
