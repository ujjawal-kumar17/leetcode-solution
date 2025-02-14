class ProductOfNumbers {
    private ArrayList<Integer> prefixProduct = new ArrayList<>();
    private int size = 0;

    public ProductOfNumbers() {
        this.prefixProduct.add(1);
        this.size = 0;
    }
    
    public void add(int num) {
        if (num == 0) {
            
            this.prefixProduct = new ArrayList<Integer>();
            this.prefixProduct.add(1);
            this.size = 0;
        } else {
            
            this.prefixProduct.add(this.prefixProduct.get(size) * num);
            this.size++;
        }
    }
    
    public int getProduct(int k) {
        if (k > this.size) return 0;

        
        return (
            this.prefixProduct.get(this.size) /
            this.prefixProduct.get(this.size - k)
        );
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */