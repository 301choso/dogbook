package com.db.dogbook.book.controller;

import com.db.dogbook.book.model.BookInfoVO;
import com.db.dogbook.book.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping(value = "/book/list")
    public ResponseEntity<?> getBookList() {
       // System.out.println("hello");
        LinkedHashMap<String, Object> resultMap = new LinkedHashMap<String, Object>();
        Map<String, Object> paramMap = new HashMap<String, Object>();
        List<BookInfoVO> bookList = bookService.getBookList(paramMap);
        // totcnt, 페이징
        System.out.println("hello");
        System.out.println(bookList);
        resultMap.put("result", "success");
        resultMap.put("data", bookList);
        return new ResponseEntity<>(resultMap, HttpStatus.OK);
    }

    // 등록 및 수정
    @PostMapping(value = "/book/updt")
    public void updtBook(
            @ModelAttribute BookInfoVO bookInfoVO,
            @RequestParam(value = "imgFile", required = false) MultipartFile imgFile
    ) {
        if(bookInfoVO.getBiIdx() != null) {
            bookService.addBook(bookInfoVO);
        } else {
            bookService.updtBook(bookInfoVO);
        }

    }

    // 삭제
    @DeleteMapping(value = "/book/del/{biIdx}")
    public void updtBook(
            @PathVariable("biIdx") Integer biIdx
    ) {
        // idx가 있는지 확인
        bookService.delBook(biIdx);
    }

}
