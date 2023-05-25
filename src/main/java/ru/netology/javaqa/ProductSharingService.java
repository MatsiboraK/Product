package ru.netology.javaqa;

public class ProductSharingService {
    public void doubleUse(Usable product) {
        product.use();
        product.use();
    }
}
