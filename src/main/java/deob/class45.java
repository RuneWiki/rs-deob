package deob;

@ObfuscatedName("aq")
public class class45 extends class194 {

    @ObfuscatedName("aq.a")
    public static class183 field976 = new class183(64);

    @ObfuscatedName("aq.l")
    public char field973;

    @ObfuscatedName("aq.c")
    public char field984;

    @ObfuscatedName("aq.u")
    public String field977 = "null";

    @ObfuscatedName("aq.w")
    public int field985;

    @ObfuscatedName("aq.i")
    public int field979 = 0;

    @ObfuscatedName("aq.r")
    public int[] field980;

    @ObfuscatedName("aq.f")
    public int[] field981;

    @ObfuscatedName("aq.g")
    public String[] field982;

    @ObfuscatedName("b.e(Lfv;I)V")
    public static void method522(class158 arg0) {
        Statics.field974 = arg0;
    }

    @ObfuscatedName("r.a(II)Laq;")
    public static class45 method117(int arg0) {
        class45 var1 = (class45) field976.method3302((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field974.method2843(8, arg0);
        class45 var3 = new class45();
        if (var2 != null) {
            var3.method857(new class111(var2));
        }
        field976.method3304(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aq.l(Ldh;I)V")
    public void method857(class111 arg0) {
        while (true) {
            int var2 = arg0.method2176();
            if (var2 == 0) {
                return;
            }
            this.method858(arg0, var2);
        }
    }

    @ObfuscatedName("aq.c(Ldh;II)V")
    public void method858(class111 arg0, int arg1) {
        if (arg1 == 1) {
            this.field973 = (char) arg0.method2176();
        } else if (arg1 == 2) {
            this.field984 = (char) arg0.method2176();
        } else if (arg1 == 3) {
            this.field977 = arg0.method2167();
        } else if (arg1 == 4) {
            this.field985 = arg0.method2378();
        } else if (arg1 == 5) {
            this.field979 = arg0.method2178();
            this.field980 = new int[this.field979];
            this.field982 = new String[this.field979];
            for (int var3 = 0; var3 < this.field979; var3++) {
                this.field980[var3] = arg0.method2378();
                this.field982[var3] = arg0.method2167();
            }
        } else if (arg1 == 6) {
            this.field979 = arg0.method2178();
            this.field980 = new int[this.field979];
            this.field981 = new int[this.field979];
            for (int var4 = 0; var4 < this.field979; var4++) {
                this.field980[var4] = arg0.method2378();
                this.field981[var4] = arg0.method2378();
            }
        }
    }
}
