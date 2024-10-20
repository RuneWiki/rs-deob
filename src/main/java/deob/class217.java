package deob;

@ObfuscatedName("hv")
public class class217 {

    @ObfuscatedName("hv.b")
    public static final class217 field3180 = new class217(0);

    @ObfuscatedName("hv.l")
    public static final class217 field3177 = new class217(1);

    @ObfuscatedName("hv.i")
    public static final class217 field3179 = new class217(2);

    @ObfuscatedName("hv.t")
    public final int field3178;

    @ObfuscatedName("co.b(I)[Lhv;")
    public static class217[] method1893() {
        return new class217[] { field3177, field3179, field3180 };
    }

    public class217(int arg0) {
        this.field3178 = arg0;
    }

    @ObfuscatedName("ah.l(II)Lhv;")
    public static class217 method865(int arg0) {
        class217[] var1 = method1893();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class217 var3 = var1[var2];
            if (var3.field3178 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
