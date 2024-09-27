package com.db.dogbook.book.service;

import com.db.dogbook.book.model.BookInfoVO;

import java.util.List;
import java.util.Map;

public interface BookService {
    List<BookInfoVO> getBookList(Map<String, Object> paramMap);
    void addBook(BookInfoVO bookInfoVO);
    void updtBook(BookInfoVO bookInfoVO);
    void delBook(Integer idx);
}
