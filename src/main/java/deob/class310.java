package deob;

@ObfuscatedName("kf")
public class class310 {

    @ObfuscatedName("kf.g")
    public static final class310 field3809 = new class310(0);

    @ObfuscatedName("kf.r")
    public static final class310 field3806 = new class310(1);

    @ObfuscatedName("kf.e")
    public static final class310 field3807 = new class310(2);

    @ObfuscatedName("kf.q")
    public final int field3808;

    public class310(int arg0) {
        this.field3808 = arg0;
    }

    @ObfuscatedName("aq.g(II)Lkf;")
    public static class310 method981(int arg0) {
        class310[] var1 = new class310[] { field3807, field3809, field3806 };
        class310[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class310 var4 = var2[var3];
            if (var4.field3808 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
