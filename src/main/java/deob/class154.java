package deob;

@ObfuscatedName("ew")
public class class154 {

    @ObfuscatedName("ew.f")
    public static final class154 field2273 = new class154("LIVE", 0);

    @ObfuscatedName("ew.u")
    public static final class154 field2267 = new class154("BUILDLIVE", 3);

    @ObfuscatedName("ew.x")
    public static final class154 field2268 = new class154("RC", 1);

    @ObfuscatedName("ew.b")
    public static final class154 field2266 = new class154("WIP", 2);

    @ObfuscatedName("ew.l")
    public final String field2276;

    @ObfuscatedName("ew.d")
    public final int field2271;

    @ObfuscatedName("c.f(I)[Lew;")
    public static class154[] method597() {
        return new class154[] { field2267, field2266, field2268, field2273 };
    }

    public class154(String arg0, int arg1) {
        this.field2276 = arg0;
        this.field2271 = arg1;
    }

    @ObfuscatedName("cx.u(II)Lew;")
    public static class154 method1823(int arg0) {
        class154[] var1 = method597();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class154 var3 = var1[var2];
            if (var3.field2271 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
