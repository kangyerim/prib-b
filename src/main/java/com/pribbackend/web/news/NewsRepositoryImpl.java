package com.pribbackend.web.news;

import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.Querydsl;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

interface NewsService {
    public List<Object> findAllById(String id);
}

@Repository
interface NewsRepository extends JpaRepository<News, Long>, NewsService {

}

public class NewsRepositoryImpl extends QuerydslRepositorySupport implements NewsService {
    public NewsRepositoryImpl() {
        super(News.class);
    }

    @Autowired JPAQueryFactory factory;

    @Override
    public List<Object> findAllById(String id) {
        return null;
    }
}
