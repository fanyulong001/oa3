package com.abc.oa.desktop.news.newslabel.commons.beans;

import java.util.Set;

public class NewsLabel {
    private Integer id;
    private String label_name;
    private String label_content;
    private Integer pid;

    public Integer getPid() {
        return pid;
    }

    public NewsLabel() {
    }

    public NewsLabel(Integer pid) {
        this.pid = pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    //关联属性，如果是一方
    private Set<NewsLabel> child;
    //关联属性，如果是多方
    private NewsLabel parent;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLabel_name() {
        return label_name;
    }

    public void setLabel_name(String label_name) {
        this.label_name = label_name;
    }

    public String getLabel_content() {
        return label_content;
    }

    public void setLabel_content(String label_content) {
        this.label_content = label_content;
    }

    public Set<NewsLabel> getChild() {
        return child;
    }

    public void setChild(Set<NewsLabel> child) {
        this.child = child;
    }

    public NewsLabel getParent() {
        return parent;
    }

    public void setParent(NewsLabel parent) {
        this.parent = parent;
    }

    @Override
    public String toString() {
        return "NewsLabel{" +
                "id=" + id +
                ", label_name='" + label_name + '\'' +
                ", label_content='" + label_content + '\'' +
                ", child=" + child +
                ", parent=" + parent +
                '}';
    }
}
