package deob;

@ObfuscatedName("ff")
public class class179 {

    @ObfuscatedName("ff.u")
    public static final class179 field2660 = new class179("LIVE", 0);

    @ObfuscatedName("ff.x")
    public static final class179 field2658 = new class179("BUILDLIVE", 3);

    @ObfuscatedName("ff.i")
    public static final class179 field2655 = new class179("RC", 1);

    @ObfuscatedName("ff.a")
    public static final class179 field2656 = new class179("WIP", 2);

    @ObfuscatedName("ff.f")
    public final String field2657;

    @ObfuscatedName("ff.c")
    public final int field2653;

    public class179(String arg0, int arg1) {
        this.field2657 = arg0;
        this.field2653 = arg1;
    }

    @ObfuscatedName("cw.x(II)Lff;")
    public static class179 method1786(int arg0) {
        class179[] var1 = Statics.method155();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class179 var3 = var1[var2];
            if (var3.field2653 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
