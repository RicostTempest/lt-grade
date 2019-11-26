package com.windsoft.lt.grade.commons.dto;

import com.windsoft.lt.grade.commons.persistence.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.List;

/**
 * 分页数据传输对象
 * @Author: Ricost
 * @Date: 2019/10/31 8:57
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class PageInfo<T extends BaseEntity> implements Serializable {
    private int draw;
    private int recordsTotal;
    private int recordsFiltered;
    private List<T> data;
    private String error;
}
