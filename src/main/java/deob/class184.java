package deob;

@ObfuscatedName("ge")
public class class184 extends class406 {

    @ObfuscatedName("ge.q")
    public static class257 field2038 = new class257(64);

    @ObfuscatedName("ge.l")
    public int field2035;

    @ObfuscatedName("ge.k")
    public int field2037;

    @ObfuscatedName("ge.a")
    public int field2039;

    @ObfuscatedName("ge.m")
    public static final int[] field2040 = new int[32];

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2040[var1] = var0 - 1;
            var0 += var0;
        }
    }

    @ObfuscatedName("q.o(II)Lge;")
    public static class184 method10(int arg0) {
        class184 var1 = (class184) field2038.method4566((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2036.method5249(14, arg0);
        class184 var3 = new class184();
        if (var2 != null) {
            var3.method3182(new class440(var2));
        }
        field2038.method4571(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ge.q(Lpx;I)V")
    public void method3182(class440 arg0) {
        while (true) {
            int var2 = arg0.method7071();
            if (var2 == 0) {
                return;
            }
            this.method3181(arg0, var2);
        }
    }

    @ObfuscatedName("ge.l(Lpx;II)V")
    public void method3181(class440 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2035 = arg0.method7082();
            this.field2037 = arg0.method7071();
            this.field2039 = arg0.method7071();
        }
    }
}
