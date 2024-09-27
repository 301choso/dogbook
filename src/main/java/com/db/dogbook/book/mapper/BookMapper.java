package com.db.dogbook.book.mapper;

import com.db.dogbook.book.model.BookInfoVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface BookMapper {
    public List<BookInfoVO> getBookList(Map<String, Object> paramMap);
    void addBook(BookInfoVO bookInfoVO);
    void updtBook(BookInfoVO bookInfoVO);
    void delBook(Integer idx);


}
