package deob;

@ObfuscatedName("iv")
public class class258 {

    @ObfuscatedName("iv.c")
    public static final class258 field3341 = new class258("LIVE", 0);

    @ObfuscatedName("iv.i")
    public static final class258 field3340 = new class258("BUILDLIVE", 3);

    @ObfuscatedName("iv.o")
    public static final class258 field3342 = new class258("RC", 1);

    @ObfuscatedName("iv.j")
    public static final class258 field3343 = new class258("WIP", 2);

    @ObfuscatedName("iv.k")
    public final String field3344;

    @ObfuscatedName("iv.x")
    public final int field3345;

    public class258(String arg0, int arg1) {
        this.field3344 = arg0;
        this.field3345 = arg1;
    }

    @ObfuscatedName("jl.c(IB)Liv;")
    public static class258 method4742(int arg0) {
        class258[] var1 = new class258[] { field3341, field3342, field3343, field3340 };
        class258[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class258 var4 = var2[var3];
            if (var4.field3345 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
