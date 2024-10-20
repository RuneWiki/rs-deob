package deob;

@ObfuscatedName("aj")
public class class38 extends class173 {

    @ObfuscatedName("aj.f")
    public static class169 field941 = new class169(64);

    @ObfuscatedName("aj.n")
    public int field942;

    @ObfuscatedName("aj.c")
    public char field953;

    @ObfuscatedName("aj.r")
    public String field944 = "null";

    @ObfuscatedName("aj.k")
    public int field950;

    @ObfuscatedName("aj.e")
    public int field945 = 0;

    @ObfuscatedName("aj.q")
    public int[] field947;

    @ObfuscatedName("aj.u")
    public int[] field948;

    @ObfuscatedName("aj.s")
    public String[] field949;

    @ObfuscatedName("b.v(II)Laj;")
    public static class38 method212(int arg0) {
        class38 var1 = (class38) field941.method3224((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field940.method3020(8, arg0);
        class38 var3 = new class38();
        if (var2 != null) {
            var3.method823(new class126(var2));
        }
        field941.method3231(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aj.f(Ldr;B)V")
    public void method823(class126 arg0) {
        while (true) {
            int var2 = arg0.method2466();
            if (var2 == 0) {
                return;
            }
            this.method827(arg0, var2);
        }
    }

    @ObfuscatedName("aj.n(Ldr;II)V")
    public void method827(class126 arg0, int arg1) {
        if (arg1 == 1) {
            this.field942 = arg0.method2466();
        } else if (arg1 == 2) {
            this.field953 = (char) arg0.method2466();
        } else if (arg1 == 3) {
            this.field944 = arg0.method2462();
        } else if (arg1 == 4) {
            this.field950 = arg0.method2500();
        } else if (arg1 == 5) {
            this.field945 = arg0.method2468();
            this.field947 = new int[this.field945];
            this.field949 = new String[this.field945];
            for (int var3 = 0; var3 < this.field945; var3++) {
                this.field947[var3] = arg0.method2500();
                this.field949[var3] = arg0.method2462();
            }
        } else if (arg1 == 6) {
            this.field945 = arg0.method2468();
            this.field947 = new int[this.field945];
            this.field948 = new int[this.field945];
            for (int var4 = 0; var4 < this.field945; var4++) {
                this.field947[var4] = arg0.method2500();
                this.field948[var4] = arg0.method2500();
            }
        }
    }
}
