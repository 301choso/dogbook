package com.db.dogbook.book.model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class BookInfoVO {

    private Integer biIdx;
    private String name;
    private int price;
    private int fileIdx;
    private int thumbIdx;
    private int userIdx;
    private int likeCnt;
    private int categoryIdx;
    private int blockAdIdx;
    private String blockYn;
    private LocalDateTime blockDt;
    private LocalDateTime saveDt;
    private LocalDateTime updtDt;
}
