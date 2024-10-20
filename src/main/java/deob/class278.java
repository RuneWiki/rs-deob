package deob;

@ObfuscatedName("jk")
public class class278 {

    @ObfuscatedName("jk.i")
    public static final class278 field3286 = new class278("LIVE", 0);

    @ObfuscatedName("jk.w")
    public static final class278 field3285 = new class278("BUILDLIVE", 3);

    @ObfuscatedName("jk.s")
    public static final class278 field3288 = new class278("RC", 1);

    @ObfuscatedName("jk.a")
    public static final class278 field3287 = new class278("WIP", 2);

    @ObfuscatedName("jk.o")
    public final String field3289;

    @ObfuscatedName("jk.g")
    public final int field3290;

    @ObfuscatedName("il.i(S)[Ljk;")
    public static class278[] method4252() {
        return new class278[] { field3286, field3287, field3288, field3285 };
    }

    public class278(String arg0, int arg1) {
        this.field3289 = arg0;
        this.field3290 = arg1;
    }

    @ObfuscatedName("gh.w(II)Ljk;")
    public static class278 method3529(int arg0) {
        class278[] var1 = method4252();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class278 var3 = var1[var2];
            if (var3.field3290 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
