package com.huaqi.zhanxin.service;

import com.huaqi.zhanxin.entity.BankSearch;

import java.util.List;

public interface BankService {
    List<BankSearch> bankSearchList();
    List<BankSearch> bankSearchID(int userID);
    List<BankSearch> bankSearchName(String userName);
}
