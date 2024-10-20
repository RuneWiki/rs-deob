package deob;

@ObfuscatedName("kk")
public class class310 {

    @ObfuscatedName("kk.s")
    public static final class310 field3794 = new class310(0);

    @ObfuscatedName("kk.j")
    public static final class310 field3789 = new class310(1);

    @ObfuscatedName("kk.i")
    public static final class310 field3791 = new class310(2);

    @ObfuscatedName("kk.k")
    public final int field3792;

    @ObfuscatedName("kg.s(I)[Lkk;")
    public static class310[] method5333() {
        return new class310[] { field3791, field3789, field3794 };
    }

    public class310(int arg0) {
        this.field3792 = arg0;
    }

    @ObfuscatedName("ji.j(II)Lkk;")
    public static class310 method4578(int arg0) {
        class310[] var1 = method5333();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class310 var3 = var1[var2];
            if (var3.field3792 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
