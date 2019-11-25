package com.briup.cms.dao;


import com.briup.cms.bean.Gategory;
import org.springframework.data.jpa.repository.JpaRepository;



public interface ICategoryDao extends JpaRepository<Gategory,Integer> {
}
