package deob;

@ObfuscatedName("lg")
public class class320 {

    @ObfuscatedName("lg.x")
    public static final class320 field3802 = new class320(0);

    @ObfuscatedName("lg.m")
    public static final class320 field3807 = new class320(1);

    @ObfuscatedName("lg.k")
    public static final class320 field3804 = new class320(2);

    @ObfuscatedName("lg.d")
    public final int field3805;

    @ObfuscatedName("kc.x(I)[Llg;")
    public static class320[] method4939() {
        return new class320[] { field3802, field3804, field3807 };
    }

    public class320(int arg0) {
        this.field3805 = arg0;
    }

    @ObfuscatedName("hd.m(II)Llg;")
    public static class320 method3685(int arg0) {
        class320[] var1 = method4939();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class320 var3 = var1[var2];
            if (var3.field3805 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
