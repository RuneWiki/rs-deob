package deob;

@ObfuscatedName("ek")
public class class141 {

    @ObfuscatedName("ek.f")
    public static final class141 field2136 = new class141("LIVE", 0);

    @ObfuscatedName("ek.k")
    public static final class141 field2145 = new class141("BUILDLIVE", 3);

    @ObfuscatedName("ek.y")
    public static final class141 field2138 = new class141("RC", 1);

    @ObfuscatedName("ek.e")
    public static final class141 field2139 = new class141("WIP", 2);

    @ObfuscatedName("ek.r")
    public final String field2140;

    @ObfuscatedName("ek.a")
    public final int field2141;

    public class141(String arg0, int arg1) {
        this.field2140 = arg0;
        this.field2141 = arg1;
    }

    @ObfuscatedName("s.f(II)Lek;")
    public static class141 method170(int arg0) {
        class141[] var1 = new class141[] { field2138, field2136, field2139, field2145 };
        class141[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class141 var4 = var2[var3];
            if (var4.field2141 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
