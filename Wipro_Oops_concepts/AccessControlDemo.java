package Wipro_Oops_concepts;
public class AccessControlDemo {
    static class Foundation {
        private int var1 = 1;    
        int var2 = 2;             
        protected int var3 = 3;   
        public int var4 = 4;       
    }

    public static void main(String[] args) {
        Foundation f = new Foundation();

//        System.out.println(f.var1); // ❌ private - not accessible
//         System.out.println(f.var2); // ❌ default - not accessible outside package
//        System.out.println(f.var3); // ❌ protected - not accessible without inheritance
        System.out.println(f.var4);    // ✅ public - accessible
    }
}

