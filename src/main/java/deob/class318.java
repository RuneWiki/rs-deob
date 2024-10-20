package deob;

@ObfuscatedName("lt")
public class class318 {

    @ObfuscatedName("lt.a")
    public static final class318 field3735 = new class318("LIVE", 0);

    @ObfuscatedName("lt.f")
    public static final class318 field3731 = new class318("BUILDLIVE", 3);

    @ObfuscatedName("lt.c")
    public static final class318 field3732 = new class318("RC", 1);

    @ObfuscatedName("lt.x")
    public static final class318 field3733 = new class318("WIP", 2);

    @ObfuscatedName("lt.h")
    public final String field3734;

    @ObfuscatedName("lt.j")
    public final int field3730;

    public class318(String arg0, int arg1) {
        this.field3734 = arg0;
        this.field3730 = arg1;
    }

    @ObfuscatedName("hq.a(IB)Llt;")
    public static class318 method4377(int arg0) {
        class318[] var1 = new class318[] { field3731, field3732, field3733, field3735 };
        class318[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class318 var4 = var2[var3];
            if (var4.field3730 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
