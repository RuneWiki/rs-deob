package deob;

@ObfuscatedName("ku")
public class class310 {

    @ObfuscatedName("ku.f")
    public static final class310 field3791 = new class310(0);

    @ObfuscatedName("ku.i")
    public static final class310 field3792 = new class310(1);

    @ObfuscatedName("ku.y")
    public static final class310 field3793 = new class310(2);

    @ObfuscatedName("ku.w")
    public final int field3794;

    public class310(int arg0) {
        this.field3794 = arg0;
    }

    @ObfuscatedName("am.f(II)Lku;")
    public static class310 method752(int arg0) {
        class310[] var1 = new class310[] { field3792, field3791, field3793 };
        class310[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class310 var4 = var2[var3];
            if (var4.field3794 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
