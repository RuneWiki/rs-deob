package deob;

@ObfuscatedName("ij")
public class class240 {

    @ObfuscatedName("ij.z")
    public static final class240 field3139 = new class240("LIVE", 0);

    @ObfuscatedName("ij.k")
    public static final class240 field3137 = new class240("BUILDLIVE", 3);

    @ObfuscatedName("ij.s")
    public static final class240 field3138 = new class240("RC", 1);

    @ObfuscatedName("ij.t")
    public static final class240 field3141 = new class240("WIP", 2);

    @ObfuscatedName("ij.i")
    public final String field3140;

    @ObfuscatedName("ij.o")
    public final int field3136;

    @ObfuscatedName("js.z(I)[Lij;")
    public static class240[] method4792() {
        return new class240[] { field3139, field3141, field3138, field3137 };
    }

    public class240(String arg0, int arg1) {
        this.field3140 = arg0;
        this.field3136 = arg1;
    }

    @ObfuscatedName("dt.k(IB)Lij;")
    public static class240 method2621(int arg0) {
        class240[] var1 = method4792();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class240 var3 = var1[var2];
            if (var3.field3136 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
