package com.briup.cms.dao;


import com.briup.cms.bean.Link;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IArticleDao extends JpaRepository<Link,Integer>{
}
