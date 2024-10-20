package deob;

@ObfuscatedName("hd")
public class class232 {

    @ObfuscatedName("hd.n")
    public static final class232 field3186 = new class232("LIVE", 0);

    @ObfuscatedName("hd.p")
    public static final class232 field3189 = new class232("BUILDLIVE", 3);

    @ObfuscatedName("hd.i")
    public static final class232 field3187 = new class232("RC", 1);

    @ObfuscatedName("hd.j")
    public static final class232 field3188 = new class232("WIP", 2);

    @ObfuscatedName("hd.f")
    public final String field3185;

    @ObfuscatedName("hd.m")
    public final int field3190;

    public class232(String arg0, int arg1) {
        this.field3185 = arg0;
        this.field3190 = arg1;
    }

    @ObfuscatedName("eb.n(IS)Lhd;")
    public static class232 method2695(int arg0) {
        class232[] var1 = new class232[] { field3189, field3187, field3186, field3188 };
        class232[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class232 var4 = var2[var3];
            if (var4.field3190 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
