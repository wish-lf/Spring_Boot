package com.example.test.model.dto;

import java.util.List;

public class PageList<T> {
    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    private int total;
    private List<T> list;
}
