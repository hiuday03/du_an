package com.da.du_an.democode.common.base;

import com.da.du_an.democode.infrastructure.contain.PaginationContant;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class PageableRequest {

    private int page = PaginationContant.DEFAULT_PAGE;
    private int size = PaginationContant.DEFAULT_SIZE;

}
