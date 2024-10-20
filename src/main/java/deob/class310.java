package deob;

@ObfuscatedName("kr")
public class class310 {

    @ObfuscatedName("kr.f")
    public static final class310 field3801 = new class310(0);

    @ObfuscatedName("kr.l")
    public static final class310 field3800 = new class310(1);

    @ObfuscatedName("kr.w")
    public static final class310 field3803 = new class310(2);

    @ObfuscatedName("kr.s")
    public final int field3802;

    @ObfuscatedName("u.f(I)[Lkr;")
    public static class310[] method177() {
        return new class310[] { field3800, field3801, field3803 };
    }

    public class310(int arg0) {
        this.field3802 = arg0;
    }

    @ObfuscatedName("io.l(IB)Lkr;")
    public static class310 method4284(int arg0) {
        class310[] var1 = method177();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class310 var3 = var1[var2];
            if (var3.field3802 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
