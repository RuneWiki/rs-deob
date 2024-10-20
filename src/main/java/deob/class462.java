package deob;

@ObfuscatedName("qr")
public class class462 {

    @ObfuscatedName("qr.c")
    public static final class462 field4855 = new class462(0);

    @ObfuscatedName("qr.p")
    public static final class462 field4852 = new class462(1);

    @ObfuscatedName("qr.f")
    public static final class462 field4853 = new class462(2);

    @ObfuscatedName("qr.n")
    public final int field4854;

    @ObfuscatedName("j.c(I)[Lqr;")
    public static class462[] method100() {
        return new class462[] { field4855, field4853, field4852 };
    }

    public class462(int arg0) {
        this.field4854 = arg0;
    }

    @ObfuscatedName("bn.p(IB)Lqr;")
    public static class462 method2051(int arg0) {
        class462[] var1 = method100();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class462 var3 = var1[var2];
            if (var3.field4854 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
