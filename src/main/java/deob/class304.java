package deob;

@ObfuscatedName("kt")
public class class304 {

    @ObfuscatedName("kt.o")
    public static final class304 field3620 = new class304("LIVE", 0);

    @ObfuscatedName("kt.q")
    public static final class304 field3621 = new class304("BUILDLIVE", 3);

    @ObfuscatedName("kt.l")
    public static final class304 field3617 = new class304("RC", 1);

    @ObfuscatedName("kt.k")
    public static final class304 field3618 = new class304("WIP", 2);

    @ObfuscatedName("kt.a")
    public final String field3619;

    @ObfuscatedName("kt.m")
    public final int field3615;

    public class304(String arg0, int arg1) {
        this.field3619 = arg0;
        this.field3615 = arg1;
    }

    @ObfuscatedName("ib.o(II)Lkt;")
    public static class304 method4430(int arg0) {
        class304[] var1 = new class304[] { field3620, field3621, field3618, field3617 };
        class304[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class304 var4 = var2[var3];
            if (var4.field3615 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
