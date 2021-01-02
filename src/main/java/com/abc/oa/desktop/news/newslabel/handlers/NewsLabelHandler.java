package com.abc.oa.desktop.news.newslabel.handlers;

import com.abc.oa.desktop.news.newslabel.commons.beans.NewsLabel;
import com.abc.oa.desktop.news.newslabel.commons.vo.Page;
import com.abc.oa.desktop.news.newslabel.service.INewsLabelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/desktop/news")
public class NewsLabelHandler {
    @Autowired
    private INewsLabelService service;

    @RequestMapping("/querynewslabel.do")
    public ModelAndView queryNewsLabel(@RequestParam(defaultValue = "1") int pageno,@RequestParam(defaultValue = "0") int pid) {
        if(pageno==0){
            pageno=1;
        }
        String url = "querynewslabel.do";
        System.out.println(pid);
        Page<NewsLabel> page = service.findCurrentPage(pageno,pid);

        ModelAndView mv = new ModelAndView();
        mv.addObject("page", page);
        mv.addObject("URL", url);
        mv.setViewName("/html/news/newsLabelManager.jsp");
        for (NewsLabel nl : page.getDatas()) {
            System.out.println(nl);
        }
        return mv;
    }

    @RequestMapping("/deletenewslabel.do")
    public String deleteNewsLabel(int id) {
        service.removeNewsLabel(id);
        return "querynewslabel.do";
    }

    @RequestMapping("/toaddnewslabel.do")
    public ModelAndView toaddNewsLabel(NewsLabel newsLabel) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/html/news/addNewsLabel.jsp");
        return mv;
    }

    @RequestMapping("/addnewslabel.do")
    public String addNewsLabel(NewsLabel newsLabel) {
        service.addNewsLabel(newsLabel);
        return "/html/news/addNewsLabel.jsp";
    }

    @RequestMapping("/toupdatenewslabel.do")
    public ModelAndView toupdatenewslabel(int id) {
        NewsLabel newsLabel = service.findNewsLabel(id);
        ModelAndView mv = new ModelAndView();
        mv.addObject("NewsLabel", newsLabel);
        mv.setViewName("/html/news/modifyNewsLabel.jsp");
        return mv;
    }

    @RequestMapping("/updatenewslabel.do")
    public ModelAndView updatenewslabel(NewsLabel newsLabel) {
        service.modifynewslabel(newsLabel);
        ModelAndView mv = new ModelAndView();
        mv.addObject("NewsLabel", newsLabel);
        mv.setViewName("/html/news/modifyNewsLabel.jsp");
        return mv;
    }

    @RequestMapping("/querysportnewslabel.do")
    public ModelAndView querySportNewsLabel(@RequestParam(defaultValue = "1") int pageno,@RequestParam(defaultValue = "1")int pid) {
        if(pageno==0){
            pageno=1;
        }
        String url = "querysportnewslabel.do";
        Page<NewsLabel> page = service.findCurrentPage(pageno, pid);

        ModelAndView mv = new ModelAndView();

        mv.addObject("page", page);
        mv.addObject("URL", url);
        mv.setViewName("/html/news/newsLabelManager.jsp");
        for (NewsLabel nl : page.getDatas()) {
            System.out.println(nl);
        }
        return mv;
    }

    @RequestMapping("/queryennewslabel.do")
    public ModelAndView queryEnNewsLabel(@RequestParam(defaultValue = "1") int pageno,@RequestParam(defaultValue = "2")int pid) {
        if(pageno==0){
            pageno=1;
        }
        String url = "queryennewslabel.do";
        Page<NewsLabel> page = service.findCurrentPage(pageno, pid);

        ModelAndView mv = new ModelAndView();

        mv.addObject("page", page);
        mv.addObject("URL", url);
        mv.setViewName("/html/news/newsLabelManager.jsp");
        for (NewsLabel nl : page.getDatas()) {
            System.out.println(nl);
        }
        return mv;
    }

    @RequestMapping("/querygonewslabel.do")
    public ModelAndView queryGoNewsLabel(@RequestParam(defaultValue = "1") int pageno,@RequestParam(defaultValue = "3")int pid) {
        if(pageno==0){
            pageno=1;
        }
        String url = "querygonewslabel.do";
        Page<NewsLabel> page = service.findCurrentPage(pageno, pid);
        System.out.println(page.getPageno());
        System.out.println(page.getTotalPages());
        ModelAndView mv = new ModelAndView();

        mv.addObject("page", page);
        mv.addObject("URL", url);
        mv.setViewName("/html/news/newsLabelManager.jsp");
        for (NewsLabel nl : page.getDatas()) {
            System.out.println(nl);
        }
        return mv;
    }
}
