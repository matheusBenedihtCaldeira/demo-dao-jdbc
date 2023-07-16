package models.dao;

import models.entities.Department;
import models.entities.Seller;

import java.util.List;

public interface SellerDao {
    void insert(Seller seller);
    void update(Seller seller);
    void deleteById(Integer id);
    Department findById(Integer id);
    List<Department> findAll();
}
