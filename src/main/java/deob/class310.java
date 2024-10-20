package deob;

@ObfuscatedName("kc")
public class class310 {

    @ObfuscatedName("kc.c")
    public static final class310 field3790 = new class310(0);

    @ObfuscatedName("kc.x")
    public static final class310 field3787 = new class310(1);

    @ObfuscatedName("kc.t")
    public static final class310 field3789 = new class310(2);

    @ObfuscatedName("kc.g")
    public final int field3788;

    @ObfuscatedName("ev.c(B)[Lkc;")
    public static class310[] method3022() {
        return new class310[] { field3787, field3790, field3789 };
    }

    public class310(int arg0) {
        this.field3788 = arg0;
    }

    @ObfuscatedName("ef.x(II)Lkc;")
    public static class310 method3040(int arg0) {
        class310[] var1 = method3022();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class310 var3 = var1[var2];
            if (var3.field3788 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
