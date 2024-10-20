package deob;

@ObfuscatedName("fb")
public class class157 {

    @ObfuscatedName("fb.l")
    public static final class157 field2336 = new class157("LIVE", 0);

    @ObfuscatedName("fb.g")
    public static final class157 field2334 = new class157("BUILDLIVE", 3);

    @ObfuscatedName("fb.r")
    public static final class157 field2335 = new class157("RC", 1);

    @ObfuscatedName("fb.e")
    public static final class157 field2340 = new class157("WIP", 2);

    @ObfuscatedName("fb.h")
    public final String field2337;

    @ObfuscatedName("fb.s")
    public final int field2338;

    public class157(String arg0, int arg1) {
        this.field2337 = arg0;
        this.field2338 = arg1;
    }

    @ObfuscatedName("dd.l(II)Lfb;")
    public static class157 method2431(int arg0) {
        class157[] var1 = new class157[] { field2340, field2335, field2336, field2334 };
        class157[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class157 var4 = var2[var3];
            if (var4.field2338 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
