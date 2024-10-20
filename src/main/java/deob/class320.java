package deob;

@ObfuscatedName("ld")
public class class320 {

    @ObfuscatedName("ld.z")
    public static final class320 field3823 = new class320(0);

    @ObfuscatedName("ld.k")
    public static final class320 field3822 = new class320(1);

    @ObfuscatedName("ld.s")
    public static final class320 field3824 = new class320(2);

    @ObfuscatedName("ld.t")
    public final int field3825;

    @ObfuscatedName("ih.z(B)[Lld;")
    public static class320[] method4134() {
        return new class320[] { field3824, field3823, field3822 };
    }

    public class320(int arg0) {
        this.field3825 = arg0;
    }

    @ObfuscatedName("ch.k(IB)Lld;")
    public static class320 method2018(int arg0) {
        class320[] var1 = method4134();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class320 var3 = var1[var2];
            if (var3.field3825 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
