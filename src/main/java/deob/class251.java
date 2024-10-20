package deob;

@ObfuscatedName("ix")
public class class251 {

    @ObfuscatedName("ix.a")
    public static final class251 field3214 = new class251("LIVE", 0);

    @ObfuscatedName("ix.s")
    public static final class251 field3213 = new class251("BUILDLIVE", 3);

    @ObfuscatedName("ix.g")
    public static final class251 field3212 = new class251("RC", 1);

    @ObfuscatedName("ix.x")
    public static final class251 field3215 = new class251("WIP", 2);

    @ObfuscatedName("ix.h")
    public final String field3216;

    @ObfuscatedName("ix.f")
    public final int field3217;

    @ObfuscatedName("bo.a(B)[Lix;")
    public static class251[] method949() {
        return new class251[] { field3213, field3215, field3214, field3212 };
    }

    public class251(String arg0, int arg1) {
        this.field3216 = arg0;
        this.field3217 = arg1;
    }

    @ObfuscatedName("eh.s(II)Lix;")
    public static class251 method3175(int arg0) {
        class251[] var1 = method949();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class251 var3 = var1[var2];
            if (var3.field3217 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
