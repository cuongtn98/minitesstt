


    public class Product {
        private int id;
        private String name;
        private int price;
        private String quantity;
        private category category;

        public Product() {
        }

        public Product(int id, String name, int price, String quantity, category category ) {
            this.id = id;
            this.name = name;
            this.price = price;
            this.quantity = quantity;
            category = category;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }
        public String getQuantity() {
            return quantity;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }


        public void setQuantity(String quantity) {
            this.quantity = quantity;
        }



        @Override
        public String toString() {
            return "Product{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", price=" + price +
                    ", quantity='" + quantity + '\'' +
                    ", Category=" + category +
                    '}';
        }
    }


