package deob;

@ObfuscatedName("jw")
public class class278 {

    @ObfuscatedName("jw.n")
    public static final class278 field3300 = new class278("LIVE", 0);

    @ObfuscatedName("jw.c")
    public static final class278 field3299 = new class278("BUILDLIVE", 3);

    @ObfuscatedName("jw.m")
    public static final class278 field3295 = new class278("RC", 1);

    @ObfuscatedName("jw.k")
    public static final class278 field3294 = new class278("WIP", 2);

    @ObfuscatedName("jw.o")
    public final String field3297;

    @ObfuscatedName("jw.g")
    public final int field3298;

    public class278(String arg0, int arg1) {
        this.field3297 = arg0;
        this.field3298 = arg1;
    }

    @ObfuscatedName("dg.n(IB)Ljw;")
    public static class278 method2381(int arg0) {
        class278[] var1 = new class278[] { field3294, field3299, field3300, field3295 };
        class278[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class278 var4 = var2[var3];
            if (var4.field3298 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
