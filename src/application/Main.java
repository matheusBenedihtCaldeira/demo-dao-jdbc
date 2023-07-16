package application;


import models.dao.DaoFactory;
import models.dao.SellerDao;
import models.entities.Seller;

public class Main {
    public static void main(String[] args) {
        SellerDao sellerDao = DaoFactory.createSellerDao();

        Seller seller = sellerDao.findById(3);
        System.out.println(seller);
    }
}
