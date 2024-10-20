package deob;

@ObfuscatedName("id")
public class class244 {

    @ObfuscatedName("id.z")
    public static final class244 field3132 = new class244("LIVE", 0);

    @ObfuscatedName("id.w")
    public static final class244 field3133 = new class244("BUILDLIVE", 3);

    @ObfuscatedName("id.s")
    public static final class244 field3137 = new class244("RC", 1);

    @ObfuscatedName("id.l")
    public static final class244 field3135 = new class244("WIP", 2);

    @ObfuscatedName("id.u")
    public final String field3136;

    @ObfuscatedName("id.q")
    public final int field3134;

    public class244(String arg0, int arg1) {
        this.field3136 = arg0;
        this.field3134 = arg1;
    }

    @ObfuscatedName("fs.z(II)Lid;")
    public static class244 method3220(int arg0) {
        class244[] var1 = new class244[] { field3133, field3137, field3132, field3135 };
        class244[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class244 var4 = var2[var3];
            if (var4.field3134 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
