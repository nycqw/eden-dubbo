package com.eden.mid.dto.resp;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.sql.Timestamp;

/**
 * @author chenqw
 * @version 1.0
 * @since 2020/5/24
 */
@Data
public class DemoResp {

    private Long id;
    private String name;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Timestamp createdTime;
}
