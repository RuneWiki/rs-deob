package deob;

@ObfuscatedName("v")
public class class25 {

    @ObfuscatedName("v.s")
    public static final class25 field346 = new class25("SMALL", 1, 0, 4);

    @ObfuscatedName("v.g")
    public static final class25 field345 = new class25("MEDIUM", 2, 1, 2);

    @ObfuscatedName("v.m")
    public static final class25 field344 = new class25("LARGE", 0, 2, 0);

    @ObfuscatedName("v.h")
    public final String field347;

    @ObfuscatedName("v.i")
    public final int field348;

    @ObfuscatedName("v.w")
    public final int field349;

    @ObfuscatedName("v.t")
    public final int field350;

    public class25(String arg0, int arg1, int arg2, int arg3) {
        this.field347 = arg0;
        this.field348 = arg1;
        this.field349 = arg2;
        this.field350 = arg3;
    }

    @ObfuscatedName("v.s(FI)Z")
    public boolean method171(float arg0) {
        return arg0 >= (float) this.field350;
    }

    @ObfuscatedName("v.g(IB)Lv;")
    public static class25 method172(int arg0) {
        class25[] var1 = new class25[] { field346, field344, field345 };
        class25[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class25 var4 = var2[var3];
            if (var4.field349 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
