package deob;

@ObfuscatedName("lz")
public class class321 {

    @ObfuscatedName("lz.h")
    public static final class321 field3788 = new class321("LIVE", 0);

    @ObfuscatedName("lz.e")
    public static final class321 field3789 = new class321("BUILDLIVE", 3);

    @ObfuscatedName("lz.v")
    public static final class321 field3790 = new class321("RC", 1);

    @ObfuscatedName("lz.x")
    public static final class321 field3791 = new class321("WIP", 2);

    @ObfuscatedName("lz.m")
    public final String field3792;

    @ObfuscatedName("lz.q")
    public final int field3793;

    @ObfuscatedName("eh.h(I)[Llz;")
    public static class321[] method2888() {
        return new class321[] { field3790, field3791, field3789, field3788 };
    }

    public class321(String arg0, int arg1) {
        this.field3792 = arg0;
        this.field3793 = arg1;
    }

    @ObfuscatedName("a.e(II)Llz;")
    public static class321 method189(int arg0) {
        class321[] var1 = method2888();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class321 var3 = var1[var2];
            if (var3.field3793 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
