package com.windsoft.lt.grade.commons.persistence;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;
@Data
@EqualsAndHashCode(callSuper=false)
public abstract class BaseEntity implements Serializable {
    private Date created;
    private Date updated;

}
