package deob;

@ObfuscatedName("fw")
public class class179 {

    @ObfuscatedName("fw.x")
    public static final class179 field2671 = new class179("LIVE", 0);

    @ObfuscatedName("fw.j")
    public static final class179 field2670 = new class179("BUILDLIVE", 3);

    @ObfuscatedName("fw.c")
    public static final class179 field2666 = new class179("RC", 1);

    @ObfuscatedName("fw.d")
    public static final class179 field2665 = new class179("WIP", 2);

    @ObfuscatedName("fw.w")
    public final String field2668;

    @ObfuscatedName("fw.h")
    public final int field2664;

    @ObfuscatedName("fl.x(I)[Lfw;")
    public static class179[] method2872() {
        return new class179[] { field2666, field2670, field2665, field2671 };
    }

    public class179(String arg0, int arg1) {
        this.field2668 = arg0;
        this.field2664 = arg1;
    }

    @ObfuscatedName("ek.j(IB)Lfw;")
    public static class179 method2842(int arg0) {
        class179[] var1 = method2872();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class179 var3 = var1[var2];
            if (var3.field2664 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
