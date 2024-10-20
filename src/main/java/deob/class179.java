package deob;

@ObfuscatedName("fg")
public class class179 {

    @ObfuscatedName("fg.s")
    public static final class179 field2682 = new class179("LIVE", 0);

    @ObfuscatedName("fg.c")
    public static final class179 field2684 = new class179("BUILDLIVE", 3);

    @ObfuscatedName("fg.f")
    public static final class179 field2681 = new class179("RC", 1);

    @ObfuscatedName("fg.h")
    public static final class179 field2683 = new class179("WIP", 2);

    @ObfuscatedName("fg.a")
    public final String field2686;

    @ObfuscatedName("fg.g")
    public final int field2685;

    public class179(String arg0, int arg1) {
        this.field2686 = arg0;
        this.field2685 = arg1;
    }

    @ObfuscatedName("fy.s(II)Lfg;")
    public static class179 method2962(int arg0) {
        class179[] var1 = new class179[] { field2684, field2681, field2682, field2683 };
        class179[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class179 var4 = var2[var3];
            if (var4.field2685 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
