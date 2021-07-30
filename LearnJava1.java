public class LearnJava1 {
    public class Product {
        // Has
        String productName;
        float productPrice = 100;
        int productQuantity = 1000;
        // Does
        public void buyProduct(int numberOfProducts) {
            productQuantity += numberOfProducts;
        }

        public void sellProduct(int numberOfProducts) {
            productQuantity -= numberOfProducts;
        }

        public void negotiateProduct(int customerPrice) {
            if (productPrice - customerPrice < 20) {
                productPrice = customerPrice;
            }
        }
    }
}