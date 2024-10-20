package deob;

@ObfuscatedName("ei")
public class class136 {

    @ObfuscatedName("ei.v")
    public static final class136 field2316 = new class136(0);

    @ObfuscatedName("ei.f")
    public static final class136 field2317 = new class136(1);

    @ObfuscatedName("ei.n")
    public static final class136 field2311 = new class136(2);

    @ObfuscatedName("ei.c")
    public final int field2312;

    @ObfuscatedName("o.v(I)[Lei;")
    public static class136[] method110() {
        return new class136[] { field2311, field2316, field2317 };
    }

    public class136(int arg0) {
        this.field2312 = arg0;
    }

    @ObfuscatedName("bv.f(II)Lei;")
    public static class136 method1406(int arg0) {
        class136[] var1 = method110();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class136 var3 = var1[var2];
            if (var3.field2312 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
