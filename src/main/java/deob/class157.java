package deob;

@ObfuscatedName("fh")
public class class157 {

    @ObfuscatedName("fh.e")
    public static final class157 field2325 = new class157("LIVE", 0);

    @ObfuscatedName("fh.l")
    public static final class157 field2324 = new class157("BUILDLIVE", 3);

    @ObfuscatedName("fh.c")
    public static final class157 field2323 = new class157("RC", 1);

    @ObfuscatedName("fh.h")
    public static final class157 field2329 = new class157("WIP", 2);

    @ObfuscatedName("fh.r")
    public final String field2327;

    @ObfuscatedName("fh.a")
    public final int field2328;

    @ObfuscatedName("bq.e(I)[Lfh;")
    public static class157[] method1196() {
        return new class157[] { field2323, field2325, field2324, field2329 };
    }

    public class157(String arg0, int arg1) {
        this.field2327 = arg0;
        this.field2328 = arg1;
    }

    @ObfuscatedName("ec.l(II)Lfh;")
    public static class157 method2861(int arg0) {
        class157[] var1 = method1196();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class157 var3 = var1[var2];
            if (var3.field2328 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
