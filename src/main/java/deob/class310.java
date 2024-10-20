package deob;

@ObfuscatedName("kc")
public class class310 {

    @ObfuscatedName("kc.u")
    public static final class310 field3795 = new class310(0);

    @ObfuscatedName("kc.f")
    public static final class310 field3793 = new class310(1);

    @ObfuscatedName("kc.b")
    public static final class310 field3794 = new class310(2);

    @ObfuscatedName("kc.g")
    public final int field3796;

    @ObfuscatedName("da.u(B)[Lkc;")
    public static class310[] method2545() {
        return new class310[] { field3794, field3793, field3795 };
    }

    public class310(int arg0) {
        this.field3796 = arg0;
    }

    @ObfuscatedName("jr.f(II)Lkc;")
    public static class310 method4721(int arg0) {
        class310[] var1 = method2545();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class310 var3 = var1[var2];
            if (var3.field3796 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
