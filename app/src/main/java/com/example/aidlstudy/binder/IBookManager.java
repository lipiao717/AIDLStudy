package com.example.aidlstudy.binder;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

import com.example.aidlstudy.aidl.Book;

import java.util.List;

/**
 * Created by lipiao on 2017/9/18.
 */

public interface IBookManager extends IInterface {
    static final String DESCRIPTOR = "com.example.aidlstudy.binder";

    static final int TRANSACTION_getBookList = IBinder.FIRST_CALL_TRANSACTION + 0;
    static final int TRANSACTION_addBook = IBinder.FIRST_CALL_TRANSACTION + 1;

    public List<Book> getBookList() throws RemoteException;

    public void addBook(Book book) throws RemoteException;
}
