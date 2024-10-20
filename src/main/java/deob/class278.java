package deob;

@ObfuscatedName("ji")
public class class278 {

    @ObfuscatedName("ji.l")
    public static final class278 field3300 = new class278("LIVE", 0);

    @ObfuscatedName("ji.q")
    public static final class278 field3298 = new class278("BUILDLIVE", 3);

    @ObfuscatedName("ji.f")
    public static final class278 field3295 = new class278("RC", 1);

    @ObfuscatedName("ji.j")
    public static final class278 field3294 = new class278("WIP", 2);

    @ObfuscatedName("ji.m")
    public final String field3297;

    @ObfuscatedName("ji.k")
    public final int field3296;

    @ObfuscatedName("ca.l(B)[Lji;")
    public static class278[] method1969() {
        return new class278[] { field3295, field3300, field3294, field3298 };
    }

    public class278(String arg0, int arg1) {
        this.field3297 = arg0;
        this.field3296 = arg1;
    }

    @ObfuscatedName("dj.q(II)Lji;")
    public static class278 method2377(int arg0) {
        class278[] var1 = method1969();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class278 var3 = var1[var2];
            if (var3.field3296 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
