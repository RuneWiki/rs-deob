package deob;

@ObfuscatedName("kx")
public class class302 {

    @ObfuscatedName("kx.p")
    public static final class302 field3832 = new class302(0);

    @ObfuscatedName("kx.i")
    public static final class302 field3833 = new class302(1);

    @ObfuscatedName("kx.w")
    public static final class302 field3831 = new class302(2);

    @ObfuscatedName("kx.s")
    public final int field3830;

    @ObfuscatedName("de.p(I)[Lkx;")
    public static class302[] method2083() {
        return new class302[] { field3832, field3833, field3831 };
    }

    public class302(int arg0) {
        this.field3830 = arg0;
    }

    @ObfuscatedName("fg.i(II)Lkx;")
    public static class302 method3006(int arg0) {
        class302[] var1 = method2083();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class302 var3 = var1[var2];
            if (var3.field3830 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
