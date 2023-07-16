package models.dao;

import db.DB;
import models.dao.impl.SellerDaoJDBC;

public class DaoFactory {

    public static SellerDao createSellerDao() {
        return (SellerDao) new SellerDaoJDBC(DB.getConnection());
    }
}