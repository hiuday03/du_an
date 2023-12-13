package com.da.du_an.democode.model.request;

import com.da.du_an.democode.common.base.PageableRequest;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CategoryRequest extends PageableRequest {

    private String name;

    private String desc;

}
