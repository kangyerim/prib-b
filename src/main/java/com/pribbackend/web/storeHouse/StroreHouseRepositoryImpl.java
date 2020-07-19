package com.pribbackend.web.storeHouse;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

import java.util.List;

interface StoreHouseService {
    public List<Object> findAllById();
}

@Repository
interface StoreHouseRepository extends JpaRepository<StoreHouse, Long>, StoreHouseService {

}

public class StroreHouseRepositoryImpl extends QuerydslRepositorySupport implements StoreHouseService {

    public StroreHouseRepositoryImpl() {
        super(StoreHouse.class);
    }

    @Override
    public List<Object> findAllById() {
        return null;
    }
}
