package com.ironyard.repo;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.ironyard.springboot.data.VendorList;

public interface VendorListRepository extends PagingAndSortingRepository<VendorList,Long> {

}

