package deob;

@ObfuscatedName("iz")
public class class258 {

    @ObfuscatedName("iz.d")
    public static final class258 field3345 = new class258("LIVE", 0);

    @ObfuscatedName("iz.z")
    public static final class258 field3343 = new class258("BUILDLIVE", 3);

    @ObfuscatedName("iz.n")
    public static final class258 field3346 = new class258("RC", 1);

    @ObfuscatedName("iz.r")
    public static final class258 field3344 = new class258("WIP", 2);

    @ObfuscatedName("iz.e")
    public final String field3347;

    @ObfuscatedName("iz.y")
    public final int field3349;

    @ObfuscatedName("eq.d(I)[Liz;")
    public static class258[] method2906() {
        return new class258[] { field3346, field3343, field3345, field3344 };
    }

    public class258(String arg0, int arg1) {
        this.field3347 = arg0;
        this.field3349 = arg1;
    }

    @ObfuscatedName("if.z(IB)Liz;")
    public static class258 method4246(int arg0) {
        class258[] var1 = method2906();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class258 var3 = var1[var2];
            if (var3.field3349 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
