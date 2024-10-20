package deob;

@ObfuscatedName("ei")
public class class138 {

    @ObfuscatedName("ei.i")
    public static final class138 field2103 = new class138("LIVE", 0);

    @ObfuscatedName("ei.c")
    public static final class138 field2104 = new class138("BUILDLIVE", 3);

    @ObfuscatedName("ei.h")
    public static final class138 field2105 = new class138("RC", 1);

    @ObfuscatedName("ei.v")
    public static final class138 field2106 = new class138("WIP", 2);

    @ObfuscatedName("ei.q")
    public final String field2107;

    @ObfuscatedName("ei.s")
    public final int field2109;

    public class138(String arg0, int arg1) {
        this.field2107 = arg0;
        this.field2109 = arg1;
    }

    @ObfuscatedName("by.i(IB)Lei;")
    public static class138 method1623(int arg0) {
        class138[] var1 = new class138[] { field2103, field2106, field2105, field2104 };
        class138[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class138 var4 = var2[var3];
            if (var4.field2109 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
