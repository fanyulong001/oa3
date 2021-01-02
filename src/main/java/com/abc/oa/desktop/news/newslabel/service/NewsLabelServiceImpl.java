package com.abc.oa.desktop.news.newslabel.service;

import com.abc.oa.desktop.news.newslabel.commons.beans.NewsLabel;
import com.abc.oa.desktop.news.newslabel.commons.vo.Page;
import com.abc.oa.desktop.news.newslabel.dao.INewsLabelDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsLabelServiceImpl implements INewsLabelService {
    @Autowired
    private INewsLabelDao dao;

    @Override
    public Page<NewsLabel> findCurrentPage(int pageno, int pid) {
        Page<NewsLabel> page = new Page<>();
        page.setPageno(pageno);
        NewsLabel newsLabel = new NewsLabel(pid);
        int totalRow = dao.selectAllCount(newsLabel);
        page.setTotalRow(totalRow);
        List<NewsLabel> datas;
        if (pid == 0) {
            datas = dao.selectCurrentPageNewsLabels(page);
        } else if (pid == 1) {
            datas = dao.selectSportCurrentPageNewsLabels(page);
        } else if (pid == 2) {
            datas = dao.selectEnCurrentPageNewsLabels(page);
        } else {
            datas = dao.selectGoCurrentPageNewsLabels(page);
        }

        page.setDatas(datas);
        return page;
    }


    @Override
    public void removeNewsLabel(int id) {
        dao.deleteNewsLabelById(id);
    }

    @Override
    public void addNewsLabel(NewsLabel newsLabel) {
        dao.insertNewsLabel(newsLabel);
    }

    @Override
    public void modifynewslabel(NewsLabel newsLabel) {
        if (newsLabel.getPid() == 0) {
            newsLabel.setPid(null);
        }
        dao.updateNewsLabel(newsLabel);
    }

    @Override
    public NewsLabel findNewsLabel(int id) {
        return dao.selectNewsLabel(id);
    }

}
