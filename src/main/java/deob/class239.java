package deob;

@ObfuscatedName("iy")
public class class239 {

    @ObfuscatedName("iy.d")
    public static final class239 field3269 = new class239("LIVE", 0);

    @ObfuscatedName("iy.x")
    public static final class239 field3263 = new class239("BUILDLIVE", 3);

    @ObfuscatedName("iy.k")
    public static final class239 field3266 = new class239("RC", 1);

    @ObfuscatedName("iy.z")
    public static final class239 field3265 = new class239("WIP", 2);

    @ObfuscatedName("iy.v")
    public final String field3264;

    @ObfuscatedName("iy.m")
    public final int field3267;

    public class239(String arg0, int arg1) {
        this.field3264 = arg0;
        this.field3267 = arg1;
    }

    @ObfuscatedName("dl.d(IB)Liy;")
    public static class239 method2235(int arg0) {
        class239[] var1 = new class239[] { field3265, field3269, field3263, field3266 };
        class239[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class239 var4 = var2[var3];
            if (var4.field3267 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
