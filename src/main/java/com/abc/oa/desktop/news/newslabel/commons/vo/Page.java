package com.abc.oa.desktop.news.newslabel.commons.vo;

import java.util.ArrayList;
import java.util.List;

public class Page<T> {
    private int pageno;     //当前页码
    private int pagestartIndex;     //当前页记录的起始索引
    private int pageSize;       //每页现实的记录数
    private int totalRow;       //记录总条数
    private int totalPages;     //总页码数
    private List<T> datas;      //当前页面所包含的具体数据据

    public Page() {
        this.pageno = 1;
        this.pageSize = 3;
        datas = new ArrayList<>();
    }

    public int getPageno() {
        return pageno;
    }

    public void setPageno(int pageno) {
        this.pageno = pageno;
    }

    public int getPagestartIndex() {
        return (pageno-1)*pageSize;
    }

    public void setPagestartIndex(int pagestartIndex) {
        this.pagestartIndex = pagestartIndex;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotalRow() {
        return totalRow;
    }

    public void setTotalRow(int totalRow) {
        this.totalRow = totalRow;
    }

    public int getTotalPages() {
        if(totalRow%pageSize==0){
            totalPages = totalRow/pageSize;
        }else{
            totalPages = totalRow/pageSize+1;
        }
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public List<T> getDatas() {
        return datas;
    }

    public void setDatas(List<T> datas) {
        this.datas = datas;
    }
}
