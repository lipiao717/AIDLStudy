// IBookManager.aidl
package com.example.aidlstudy.aidl;

import com.example.aidlstudy.aidl.Book;
interface IBookManager{
    List<Book> getBookList();
    void addBook(in Book book);
}
