package deob;

@ObfuscatedName("eu")
public class class143 {

    @ObfuscatedName("eu.b")
    public static final class143 field2147 = new class143("LIVE", 0);

    @ObfuscatedName("eu.e")
    public static final class143 field2138 = new class143("BUILDLIVE", 3);

    @ObfuscatedName("eu.i")
    public static final class143 field2139 = new class143("RC", 1);

    @ObfuscatedName("eu.k")
    public static final class143 field2140 = new class143("WIP", 2);

    @ObfuscatedName("eu.h")
    public final String field2141;

    @ObfuscatedName("eu.p")
    public final int field2142;

    @ObfuscatedName("ev.b(B)[Leu;")
    public static class143[] method2630() {
        return new class143[] { field2139, field2147, field2138, field2140 };
    }

    public class143(String arg0, int arg1) {
        this.field2141 = arg0;
        this.field2142 = arg1;
    }

    @ObfuscatedName("ev.e(II)Leu;")
    public static class143 method2616(int arg0) {
        class143[] var1 = method2630();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class143 var3 = var1[var2];
            if (var3.field2142 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
