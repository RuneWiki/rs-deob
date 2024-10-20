package deob;

@ObfuscatedName("io")
public class class241 {

    @ObfuscatedName("io.h")
    public static final class241 field3133 = new class241("LIVE", 0);

    @ObfuscatedName("io.v")
    public static final class241 field3130 = new class241("BUILDLIVE", 3);

    @ObfuscatedName("io.x")
    public static final class241 field3132 = new class241("RC", 1);

    @ObfuscatedName("io.w")
    public static final class241 field3131 = new class241("WIP", 2);

    @ObfuscatedName("io.t")
    public final String field3134;

    @ObfuscatedName("io.j")
    public final int field3135;

    @ObfuscatedName("v.h(B)[Lio;")
    public static class241[] method8() {
        return new class241[] { field3130, field3133, field3131, field3132 };
    }

    public class241(String arg0, int arg1) {
        this.field3134 = arg0;
        this.field3135 = arg1;
    }

    @ObfuscatedName("bo.v(IB)Lio;")
    public static class241 method1104(int arg0) {
        class241[] var1 = method8();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class241 var3 = var1[var2];
            if (var3.field3135 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
