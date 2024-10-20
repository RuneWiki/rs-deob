package deob;

@ObfuscatedName("kl")
public class class304 {

    @ObfuscatedName("kl.v")
    public static final class304 field3554 = new class304("LIVE", 0);

    @ObfuscatedName("kl.c")
    public static final class304 field3561 = new class304("BUILDLIVE", 3);

    @ObfuscatedName("kl.i")
    public static final class304 field3556 = new class304("RC", 1);

    @ObfuscatedName("kl.f")
    public static final class304 field3555 = new class304("WIP", 2);

    @ObfuscatedName("kl.b")
    public final String field3558;

    @ObfuscatedName("kl.n")
    public final int field3557;

    @ObfuscatedName("ev.v(I)[Lkl;")
    public static class304[] method2878() {
        return new class304[] { field3555, field3556, field3561, field3554 };
    }

    public class304(String arg0, int arg1) {
        this.field3558 = arg0;
        this.field3557 = arg1;
    }

    @ObfuscatedName("e.c(IB)Lkl;")
    public static class304 method327(int arg0) {
        class304[] var1 = method2878();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class304 var3 = var1[var2];
            if (var3.field3557 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
