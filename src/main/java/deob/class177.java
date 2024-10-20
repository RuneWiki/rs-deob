package deob;

@ObfuscatedName("fc")
public class class177 extends class406 {

    @ObfuscatedName("fc.q")
    public static class257 field1928 = new class257(64);

    @ObfuscatedName("fc.l")
    public char field1934;

    @ObfuscatedName("fc.k")
    public char field1931;

    @ObfuscatedName("fc.a")
    public String field1933 = class309.field3681;

    @ObfuscatedName("fc.m")
    public int field1932;

    @ObfuscatedName("fc.p")
    public int field1929 = 0;

    @ObfuscatedName("fc.s")
    public int[] field1927;

    @ObfuscatedName("fc.r")
    public int[] field1935;

    @ObfuscatedName("fc.v")
    public String[] field1936;

    @ObfuscatedName("jz.o(II)Lfc;")
    public static class177 method4896(int arg0) {
        class177 var1 = (class177) field1928.method4566((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1930.method5249(8, arg0);
        class177 var3 = new class177();
        if (var2 != null) {
            var3.method3095(new class440(var2));
        }
        field1928.method4571(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("fc.q(Lpx;B)V")
    public void method3095(class440 arg0) {
        while (true) {
            int var2 = arg0.method7071();
            if (var2 == 0) {
                return;
            }
            this.method3102(arg0, var2);
        }
    }

    @ObfuscatedName("fc.l(Lpx;II)V")
    public void method3102(class440 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1934 = (char) arg0.method7071();
        } else if (arg1 == 2) {
            this.field1931 = (char) arg0.method7071();
        } else if (arg1 == 3) {
            this.field1933 = arg0.method7044();
        } else if (arg1 == 4) {
            this.field1932 = arg0.method6898();
        } else if (arg1 == 5) {
            this.field1929 = arg0.method7082();
            this.field1927 = new int[this.field1929];
            this.field1936 = new String[this.field1929];
            for (int var3 = 0; var3 < this.field1929; var3++) {
                this.field1927[var3] = arg0.method6898();
                this.field1936[var3] = arg0.method7044();
            }
        } else if (arg1 == 6) {
            this.field1929 = arg0.method7082();
            this.field1927 = new int[this.field1929];
            this.field1935 = new int[this.field1929];
            for (int var4 = 0; var4 < this.field1929; var4++) {
                this.field1927[var4] = arg0.method6898();
                this.field1935[var4] = arg0.method6898();
            }
        }
    }

    @ObfuscatedName("fc.k(I)I")
    public int method3096() {
        return this.field1929;
    }
}
