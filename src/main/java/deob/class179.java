package deob;

@ObfuscatedName("fx")
public class class179 {

    @ObfuscatedName("fx.b")
    public static final class179 field2686 = new class179("LIVE", 0);

    @ObfuscatedName("fx.e")
    public static final class179 field2679 = new class179("BUILDLIVE", 3);

    @ObfuscatedName("fx.c")
    public static final class179 field2680 = new class179("RC", 1);

    @ObfuscatedName("fx.l")
    public static final class179 field2684 = new class179("WIP", 2);

    @ObfuscatedName("fx.y")
    public final String field2681;

    @ObfuscatedName("fx.j")
    public final int field2683;

    @ObfuscatedName("ec.b(B)[Lfx;")
    public static class179[] method2883() {
        return new class179[] { field2680, field2686, field2679, field2684 };
    }

    public class179(String arg0, int arg1) {
        this.field2681 = arg0;
        this.field2683 = arg1;
    }

    @ObfuscatedName("fl.e(II)Lfx;")
    public static class179 method2992(int arg0) {
        class179[] var1 = method2883();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class179 var3 = var1[var2];
            if (var3.field2683 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
