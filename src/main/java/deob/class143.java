package deob;

@ObfuscatedName("ea")
public class class143 {

    @ObfuscatedName("ea.p")
    public static final class143 field2125 = new class143("LIVE", 0);

    @ObfuscatedName("ea.y")
    public static final class143 field2122 = new class143("BUILDLIVE", 3);

    @ObfuscatedName("ea.d")
    public static final class143 field2128 = new class143("RC", 1);

    @ObfuscatedName("ea.c")
    public static final class143 field2123 = new class143("WIP", 2);

    @ObfuscatedName("ea.r")
    public final String field2126;

    @ObfuscatedName("ea.f")
    public final int field2127;

    @ObfuscatedName("q.p(I)[Lea;")
    public static class143[] method162() {
        return new class143[] { field2128, field2122, field2125, field2123 };
    }

    public class143(String arg0, int arg1) {
        this.field2126 = arg0;
        this.field2127 = arg1;
    }

    @ObfuscatedName("dt.y(IB)Lea;")
    public static class143 method2539(int arg0) {
        class143[] var1 = method162();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class143 var3 = var1[var2];
            if (var3.field2127 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
