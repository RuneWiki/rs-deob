package deob;

@ObfuscatedName("fp")
public class class179 {

    @ObfuscatedName("fp.f")
    public static final class179 field2697 = new class179("LIVE", 0);

    @ObfuscatedName("fp.i")
    public static final class179 field2698 = new class179("BUILDLIVE", 3);

    @ObfuscatedName("fp.u")
    public static final class179 field2699 = new class179("RC", 1);

    @ObfuscatedName("fp.h")
    public static final class179 field2700 = new class179("WIP", 2);

    @ObfuscatedName("fp.r")
    public final String field2701;

    @ObfuscatedName("fp.o")
    public final int field2702;

    public class179(String arg0, int arg1) {
        this.field2701 = arg0;
        this.field2702 = arg1;
    }

    @ObfuscatedName("ay.i(II)Lfp;")
    public static class179 method906(int arg0) {
        class179[] var1 = Statics.method1920();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class179 var3 = var1[var2];
            if (var3.field2702 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
