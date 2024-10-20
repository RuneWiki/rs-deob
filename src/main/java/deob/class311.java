package deob;

@ObfuscatedName("kx")
public class class311 {

    @ObfuscatedName("kx.c")
    public static final class311 field3789 = new class311(0);

    @ObfuscatedName("kx.t")
    public static final class311 field3791 = new class311(1);

    @ObfuscatedName("kx.o")
    public static final class311 field3790 = new class311(2);

    @ObfuscatedName("kx.e")
    public final int field3788;

    @ObfuscatedName("kl.c(I)[Lkx;")
    public static class311[] method4918() {
        return new class311[] { field3790, field3791, field3789 };
    }

    public class311(int arg0) {
        this.field3788 = arg0;
    }

    @ObfuscatedName("eo.t(II)Lkx;")
    public static class311 method3162(int arg0) {
        class311[] var1 = method4918();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class311 var3 = var1[var2];
            if (var3.field3788 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
