package deob;

@ObfuscatedName("kc")
public class class310 {

    @ObfuscatedName("kc.z")
    public static final class310 field3791 = new class310(0);

    @ObfuscatedName("kc.n")
    public static final class310 field3792 = new class310(1);

    @ObfuscatedName("kc.v")
    public static final class310 field3793 = new class310(2);

    @ObfuscatedName("kc.u")
    public final int field3794;

    @ObfuscatedName("kj.z(B)[Lkc;")
    public static class310[] method5250() {
        return new class310[] { field3793, field3791, field3792 };
    }

    public class310(int arg0) {
        this.field3794 = arg0;
    }

    @ObfuscatedName("kr.n(II)Lkc;")
    public static class310 method4829(int arg0) {
        class310[] var1 = method5250();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class310 var3 = var1[var2];
            if (var3.field3794 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
