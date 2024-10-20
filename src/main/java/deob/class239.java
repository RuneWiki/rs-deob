package deob;

@ObfuscatedName("iy")
public class class239 {

    @ObfuscatedName("iy.b")
    public static final class239 field3243 = new class239("LIVE", 0);

    @ObfuscatedName("iy.s")
    public static final class239 field3246 = new class239("BUILDLIVE", 3);

    @ObfuscatedName("iy.r")
    public static final class239 field3245 = new class239("RC", 1);

    @ObfuscatedName("iy.g")
    public static final class239 field3247 = new class239("WIP", 2);

    @ObfuscatedName("iy.x")
    public final String field3244;

    @ObfuscatedName("iy.f")
    public final int field3248;

    public class239(String arg0, int arg1) {
        this.field3244 = arg0;
        this.field3248 = arg1;
    }

    @ObfuscatedName("ck.b(II)Liy;")
    public static class239 method1612(int arg0) {
        class239[] var1 = new class239[] { field3247, field3246, field3245, field3243 };
        class239[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class239 var4 = var2[var3];
            if (var4.field3248 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
