package com.abc.oa.desktop.news.newslabel.dao;

import com.abc.oa.desktop.news.newslabel.commons.beans.NewsLabel;
import com.abc.oa.desktop.news.newslabel.commons.vo.Page;

import java.util.List;

public interface INewsLabelDao {
    int selectAllCount(NewsLabel newsLabel);

    List<NewsLabel> selectCurrentPageNewsLabels(Page<NewsLabel> page);

    List<NewsLabel> selectSportCurrentPageNewsLabels(Page<NewsLabel> page);
    List<NewsLabel> selectEnCurrentPageNewsLabels(Page<NewsLabel> page);
    List<NewsLabel> selectGoCurrentPageNewsLabels(Page<NewsLabel> page);

    void deleteNewsLabelById(int id);

    void insertNewsLabel(NewsLabel newsLabel);

    NewsLabel selectNewsLabel(int id);

    void updateNewsLabel(NewsLabel newsLabel);

}
