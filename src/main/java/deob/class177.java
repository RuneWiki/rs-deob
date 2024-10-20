package deob;

@ObfuscatedName("fs")
public class class177 extends class404 {

    @ObfuscatedName("fs.c")
    public static class257 field1877 = new class257(64);

    @ObfuscatedName("fs.i")
    public char field1878;

    @ObfuscatedName("fs.f")
    public char field1876;

    @ObfuscatedName("fs.b")
    public String field1880 = class309.field3599;

    @ObfuscatedName("fs.n")
    public int field1885;

    @ObfuscatedName("fs.s")
    public int field1882 = 0;

    @ObfuscatedName("fs.l")
    public int[] field1879;

    @ObfuscatedName("fs.q")
    public int[] field1884;

    @ObfuscatedName("fs.o")
    public String[] field1881;

    @ObfuscatedName("h.v(Lln;I)V")
    public static void method352(class316 arg0) {
        Statics.field1883 = arg0;
    }

    @ObfuscatedName("cm.c(IB)Lfs;")
    public static class177 method1991(int arg0) {
        class177 var1 = (class177) field1877.method4644((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1883.method5296(8, arg0);
        class177 var3 = new class177();
        if (var2 != null) {
            var3.method3150(new class438(var2));
        }
        field1877.method4651(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("fs.i(Lpi;B)V")
    public void method3150(class438 arg0) {
        while (true) {
            int var2 = arg0.method6971();
            if (var2 == 0) {
                return;
            }
            this.method3149(arg0, var2);
        }
    }

    @ObfuscatedName("fs.f(Lpi;II)V")
    public void method3149(class438 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1878 = (char) arg0.method6971();
        } else if (arg1 == 2) {
            this.field1876 = (char) arg0.method6971();
        } else if (arg1 == 3) {
            this.field1880 = arg0.method6981();
        } else if (arg1 == 4) {
            this.field1885 = arg0.method6976();
        } else if (arg1 == 5) {
            this.field1882 = arg0.method7148();
            this.field1879 = new int[this.field1882];
            this.field1881 = new String[this.field1882];
            for (int var3 = 0; var3 < this.field1882; var3++) {
                this.field1879[var3] = arg0.method6976();
                this.field1881[var3] = arg0.method6981();
            }
        } else if (arg1 == 6) {
            this.field1882 = arg0.method7148();
            this.field1879 = new int[this.field1882];
            this.field1884 = new int[this.field1882];
            for (int var4 = 0; var4 < this.field1882; var4++) {
                this.field1879[var4] = arg0.method6976();
                this.field1884[var4] = arg0.method6976();
            }
        }
    }

    @ObfuscatedName("fs.b(B)I")
    public int method3148() {
        return this.field1882;
    }
}
