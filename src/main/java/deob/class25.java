package deob;

@ObfuscatedName("y")
public class class25 {

    @ObfuscatedName("y.p")
    public static final class25 field382 = new class25("SMALL", 2, 0, 4);

    @ObfuscatedName("y.m")
    public static final class25 field374 = new class25("MEDIUM", 1, 1, 2);

    @ObfuscatedName("y.e")
    public static final class25 field375 = new class25("LARGE", 0, 2, 0);

    @ObfuscatedName("y.t")
    public final String field376;

    @ObfuscatedName("y.w")
    public final int field380;

    @ObfuscatedName("y.z")
    public final int field378;

    @ObfuscatedName("y.j")
    public final int field379;

    public class25(String arg0, int arg1, int arg2, int arg3) {
        this.field376 = arg0;
        this.field380 = arg1;
        this.field378 = arg2;
        this.field379 = arg3;
    }

    @ObfuscatedName("y.p(FI)Z")
    public boolean method182(float arg0) {
        return arg0 >= (float) this.field379;
    }

    @ObfuscatedName("y.m(II)Ly;")
    public static class25 method184(int arg0) {
        class25[] var1 = new class25[] { field374, field382, field375 };
        class25[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class25 var4 = var2[var3];
            if (var4.field378 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
