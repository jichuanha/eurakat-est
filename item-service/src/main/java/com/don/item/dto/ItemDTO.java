package com.don.item.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author jc
 * @Description:
 * @date 2019/7/31
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItemDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String name;
    private Long price;
}
