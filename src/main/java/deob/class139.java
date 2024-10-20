package deob;

@ObfuscatedName("ef")
public class class139 {

    @ObfuscatedName("ef.g")
    public static final class139 field2132 = new class139("LIVE", 0);

    @ObfuscatedName("ef.s")
    public static final class139 field2128 = new class139("BUILDLIVE", 3);

    @ObfuscatedName("ef.v")
    public static final class139 field2127 = new class139("RC", 1);

    @ObfuscatedName("ef.o")
    public static final class139 field2129 = new class139("WIP", 2);

    @ObfuscatedName("ef.k")
    public final String field2131;

    @ObfuscatedName("ef.m")
    public final int field2134;

    public class139(String arg0, int arg1) {
        this.field2131 = arg0;
        this.field2134 = arg1;
    }

    @ObfuscatedName("aq.g(II)Lef;")
    public static class139 method733(int arg0) {
        class139[] var1 = new class139[] { field2132, field2127, field2129, field2128 };
        class139[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class139 var4 = var2[var3];
            if (var4.field2134 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
