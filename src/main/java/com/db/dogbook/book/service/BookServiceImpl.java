package com.db.dogbook.book.service;

import com.db.dogbook.book.mapper.BookMapper;
import com.db.dogbook.book.model.BookInfoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookMapper bookMapper;

    @Override
    public List<BookInfoVO> getBookList(Map<String, Object> paramMap) {
        return bookMapper.getBookList(paramMap);
    }

    @Override
    @Transactional
    public void addBook(BookInfoVO bookInfoVO) {
        bookMapper.addBook(bookInfoVO);
    }

    @Override
    @Transactional
    public void updtBook(BookInfoVO bookInfoVO) {
        bookMapper.updtBook(bookInfoVO);
    }

    @Override
    @Transactional
    public void delBook(Integer idx) {
        bookMapper.delBook(idx);
    }
}
