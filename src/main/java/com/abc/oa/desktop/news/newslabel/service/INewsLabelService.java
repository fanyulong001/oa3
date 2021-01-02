package com.abc.oa.desktop.news.newslabel.service;

import com.abc.oa.desktop.news.newslabel.commons.beans.NewsLabel;
import com.abc.oa.desktop.news.newslabel.commons.vo.Page;

public interface INewsLabelService {
    public Page<NewsLabel> findCurrentPage(int pageno,int pid);
    public void removeNewsLabel(int id);
    public void addNewsLabel(NewsLabel newsLabel);
    void modifynewslabel(NewsLabel newsLabel);

    NewsLabel findNewsLabel(int id);

}
