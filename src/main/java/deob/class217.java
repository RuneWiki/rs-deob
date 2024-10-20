package deob;

@ObfuscatedName("hk")
public class class217 {

    @ObfuscatedName("hk.f")
    public static final class217 field3185 = new class217(0);

    @ObfuscatedName("hk.i")
    public static final class217 field3183 = new class217(1);

    @ObfuscatedName("hk.u")
    public static final class217 field3184 = new class217(2);

    @ObfuscatedName("hk.h")
    public final int field3182;

    public class217(int arg0) {
        this.field3182 = arg0;
    }

    @ObfuscatedName("bt.f(IB)Lhk;")
    public static class217 method1406(int arg0) {
        class217[] var1 = new class217[] { field3183, field3185, field3184 };
        class217[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class217 var4 = var2[var3];
            if (var4.field3182 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
