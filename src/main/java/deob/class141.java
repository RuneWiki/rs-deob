package deob;

@ObfuscatedName("ed")
public class class141 {

    @ObfuscatedName("ed.e")
    public static final class141 field2131 = new class141("LIVE", 0);

    @ObfuscatedName("ed.v")
    public static final class141 field2129 = new class141("BUILDLIVE", 3);

    @ObfuscatedName("ed.k")
    public static final class141 field2135 = new class141("RC", 1);

    @ObfuscatedName("ed.g")
    public static final class141 field2130 = new class141("WIP", 2);

    @ObfuscatedName("ed.q")
    public final String field2132;

    @ObfuscatedName("ed.l")
    public final int field2133;

    public class141(String arg0, int arg1) {
        this.field2132 = arg0;
        this.field2133 = arg1;
    }

    @ObfuscatedName("ai.e(II)Led;")
    public static class141 method672(int arg0) {
        class141[] var1 = new class141[] { field2131, field2130, field2129, field2135 };
        class141[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class141 var4 = var2[var3];
            if (var4.field2133 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
