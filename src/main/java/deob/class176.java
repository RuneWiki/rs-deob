package deob;

@ObfuscatedName("fn")
public class class176 extends class406 {

    @ObfuscatedName("fn.h")
    public static class256 field1880 = new class256(64);

    @ObfuscatedName("fn.w")
    public char field1885;

    @ObfuscatedName("fn.v")
    public char field1882;

    @ObfuscatedName("fn.c")
    public String field1881 = class309.field3624;

    @ObfuscatedName("fn.q")
    public int field1893;

    @ObfuscatedName("fn.i")
    public int field1890 = 0;

    @ObfuscatedName("fn.k")
    public int[] field1886;

    @ObfuscatedName("fn.o")
    public int[] field1887;

    @ObfuscatedName("fn.n")
    public String[] field1888;

    @ObfuscatedName("hh.s(II)Lfn;")
    public static class176 method4120(int arg0) {
        class176 var1 = (class176) field1880.method4599((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1879.method5179(8, arg0);
        class176 var3 = new class176();
        if (var2 != null) {
            var3.method3057(new class444(var2));
        }
        field1880.method4600(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("fn.h(Lqr;I)V")
    public void method3057(class444 arg0) {
        while (true) {
            int var2 = arg0.method6929();
            if (var2 == 0) {
                return;
            }
            this.method3054(arg0, var2);
        }
    }

    @ObfuscatedName("fn.w(Lqr;IB)V")
    public void method3054(class444 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1885 = (char) arg0.method6929();
        } else if (arg1 == 2) {
            this.field1882 = (char) arg0.method6929();
        } else if (arg1 == 3) {
            this.field1881 = arg0.method6975();
        } else if (arg1 == 4) {
            this.field1893 = arg0.method6934();
        } else if (arg1 == 5) {
            this.field1890 = arg0.method7120();
            this.field1886 = new int[this.field1890];
            this.field1888 = new String[this.field1890];
            for (int var3 = 0; var3 < this.field1890; var3++) {
                this.field1886[var3] = arg0.method6934();
                this.field1888[var3] = arg0.method6975();
            }
        } else if (arg1 == 6) {
            this.field1890 = arg0.method7120();
            this.field1886 = new int[this.field1890];
            this.field1887 = new int[this.field1890];
            for (int var4 = 0; var4 < this.field1890; var4++) {
                this.field1886[var4] = arg0.method6934();
                this.field1887[var4] = arg0.method6934();
            }
        }
    }

    @ObfuscatedName("fn.v(I)I")
    public int method3053() {
        return this.field1890;
    }
}
