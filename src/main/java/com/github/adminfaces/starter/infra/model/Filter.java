package com.github.adminfaces.starter.infra.model;


import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import org.primefaces.model.FilterMeta;

/**
 * Created by rmpestano on 9/7/14.
 * class which holds database pagination metadata
 */
public class Filter<T extends Serializable> {
    private T entity;
    private int first;
    private int pageSize;
    private String sortField;
    private SortOrder sortOrder;
    private Map<String, Object> params = new HashMap<String, Object>();
    private Map<String, FilterMeta> filterParams = new HashMap<String, FilterMeta>();


    public Filter() {
    }

    public Filter(T entity) {
        this.entity = entity;
    }

    public Filter setFirst(int first) {
        this.first = first;
        return this;
    }

    public int getFirst() {
        return first;
    }

    public Filter setPageSize(int pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public int getPageSize() {
        return pageSize;
    }

    public Filter setSortField(String sortField) {
        this.sortField = sortField;
        return this;
    }

    public String getSortField() {
        return sortField;
    }

    public Filter setSortOrder(SortOrder sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }

    public SortOrder getSortOrder() {
        return sortOrder;
    }

    public Filter setParams(Map<String, Object> params) {
        this.params = params;
        return this;
    }

    public Map<String, Object> getParams() {
        return params;
    }

    public Map<String, FilterMeta> getFilterParams() {
		return filterParams;
	}

	public Filter<T> setFilterParams(Map<String, FilterMeta> filterParams) {
		this.filterParams = filterParams;
		return this;
	}

	public T getEntity() {
        return entity;
    }

    public Filter setEntity(T entity) {
        this.entity = entity;
        return this;
    }

//    public Filter addParam(String key, Object value) {
//        getParams().put(key, value);
//        return this;
//    }
//
//    public boolean hasParam(String key) {
//        return getParams().containsKey(key) && getParam(key) != null;
//    }
//
//    public Object getParam(String key) {
//        return getParams().get(key);
//    }
    
    public Filter<T> addFilterParam(String key, FilterMeta value) {
        getFilterParams().put(key, value);
        return this;
    }

    public boolean hasFilterParam(String key) {
        return getFilterParams().containsKey(key) && getFilterParam(key) != null;
    }

    public FilterMeta getFilterParam(String key) {
        return getFilterParams().get(key);
    }
}
