package service;

import model.Product;

import java.util.ArrayList;

public class ProductManager implements ProductService<Product> {
private ArrayList<Product> listProduct;
    public ProductManager(ArrayList<Product> listProduct){
        this.listProduct = listProduct;
    }

    public ProductManager() {
        listProduct= new ArrayList<>();
    }

    @Override
    public int findIndexByID(int id) {
        for (int i = 0; i < listProduct.size(); i++) {
            if (listProduct.get(i).getId() == id){
                return i;
            }
        }
        return -1;
    }

    @Override
    public void add(Product product) {
        listProduct.add(product);

    }

    @Override
    public void update(Product product, int id) {
    int index = findIndexByID(id);
    listProduct.set(index,product);
    }

    @Override
    public void deleteById(int id) {
        int index = findIndexByID(id);
        listProduct.remove(index);

    }

    @Override
    public void print() {
        for (Product product : listProduct) {
            System.out.println(product);
        }
        System.out.println("---------------------------------------------");

    }

    @Override
    public void sortUp() {
        listProduct.sort(((o1, o2) -> (int) (o1.getPrice()- o2.getPrice())));
    }

    @Override
    public void sortDown() {
        listProduct.sort(((o1, o2) -> (int) (o2.getPrice()- o1.getPrice())));
    }
}
