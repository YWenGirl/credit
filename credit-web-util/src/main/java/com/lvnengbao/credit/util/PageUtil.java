package com.lvnengbao.credit.util;

import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class PageUtil implements Serializable {
    private  int pageNow = 1;       //当前页数
    private  int pageSize =2;       //每页显示的条数
    private  int totalCount ;       //总记录条数
    private  int totalPageCount;  //总页数

    public PageUtil() {

    }

    public PageUtil(int pageNow, int totalCount) {
        this.pageNow = pageNow;
        this.totalCount = totalCount;
    }

    //计算总页数
 /*    public int getTotalPageCount() {
        if(totalCount % pageSize == 0){
            totalCount = getTotalCount() / getPageSize();
        }else {
            totalPageCount = getTotalCount() / getPageSize() + 1;
        }
        return totalPageCount;
    }*/

    public int getTotalPageCount() {
        totalPageCount =  getTotalCount() / getPageSize();

        return (totalCount % pageSize == 0) ? totalPageCount : totalPageCount+1;
    }


    public int getPageNow() {
        return pageNow;
    }

    public void setPageNow(int pageNow) {
        this.pageNow = pageNow;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public void setTotalPageCount(int totalPageCount) {
        this.totalPageCount = totalPageCount;
    }
}
