package deob;

@ObfuscatedName("gi")
public class class184 extends class404 {

    @ObfuscatedName("gi.c")
    public static class257 field1972 = new class257(64);

    @ObfuscatedName("gi.i")
    public int field1969;

    @ObfuscatedName("gi.f")
    public int field1970;

    @ObfuscatedName("gi.b")
    public int field1968;

    @ObfuscatedName("gi.n")
    public static final int[] field1971 = new int[32];

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field1971[var1] = var0 - 1;
            var0 += var0;
        }
    }

    @ObfuscatedName("ds.v(IB)Lgi;")
    public static class184 method2521(int arg0) {
        class184 var1 = (class184) field1972.method4644((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field58.method5296(14, arg0);
        class184 var3 = new class184();
        if (var2 != null) {
            var3.method3238(new class438(var2));
        }
        field1972.method4651(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gi.c(Lpi;I)V")
    public void method3238(class438 arg0) {
        while (true) {
            int var2 = arg0.method6971();
            if (var2 == 0) {
                return;
            }
            this.method3239(arg0, var2);
        }
    }

    @ObfuscatedName("gi.i(Lpi;II)V")
    public void method3239(class438 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1969 = arg0.method7148();
            this.field1970 = arg0.method6971();
            this.field1968 = arg0.method6971();
        }
    }
}
