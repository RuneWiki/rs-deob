package deob;

@ObfuscatedName("kt")
public class class304 {

    @ObfuscatedName("kt.s")
    public static final class304 field3583 = new class304("LIVE", 0);

    @ObfuscatedName("kt.h")
    public static final class304 field3587 = new class304("BUILDLIVE", 3);

    @ObfuscatedName("kt.w")
    public static final class304 field3584 = new class304("RC", 1);

    @ObfuscatedName("kt.v")
    public static final class304 field3586 = new class304("WIP", 2);

    @ObfuscatedName("kt.c")
    public final String field3585;

    @ObfuscatedName("kt.q")
    public final int field3588;

    public class304(String arg0, int arg1) {
        this.field3585 = arg0;
        this.field3588 = arg1;
    }

    @ObfuscatedName("ju.s(II)Lkt;")
    public static class304 method4631(int arg0) {
        class304[] var1 = new class304[] { field3584, field3583, field3587, field3586 };
        class304[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class304 var4 = var2[var3];
            if (var4.field3588 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
