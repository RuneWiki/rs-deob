package deob;

@ObfuscatedName("hs")
public class class232 {

    @ObfuscatedName("hs.i")
    public static final class232 field3176 = new class232("LIVE", 0);

    @ObfuscatedName("hs.h")
    public static final class232 field3174 = new class232("BUILDLIVE", 3);

    @ObfuscatedName("hs.u")
    public static final class232 field3181 = new class232("RC", 1);

    @ObfuscatedName("hs.q")
    public static final class232 field3180 = new class232("WIP", 2);

    @ObfuscatedName("hs.g")
    public final String field3177;

    @ObfuscatedName("hs.v")
    public final int field3178;

    public class232(String arg0, int arg1) {
        this.field3177 = arg0;
        this.field3178 = arg1;
    }

    @ObfuscatedName("dn.i(II)Lhs;")
    public static class232 method2224(int arg0) {
        class232[] var1 = new class232[] { field3181, field3174, field3176, field3180 };
        class232[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class232 var4 = var2[var3];
            if (var4.field3178 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
