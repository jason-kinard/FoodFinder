package com.ironyard.repo;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.ironyard.springboot.data.Vendor;

public interface VendorRepository extends PagingAndSortingRepository<Vendor, Long>{

}
