package deob;

@ObfuscatedName("ar")
public class class44 extends class194 {

    @ObfuscatedName("ar.a")
    public static class183 field965 = new class183(64);

    @ObfuscatedName("ar.l")
    public int field964;

    @ObfuscatedName("ar.c")
    public int field967;

    @ObfuscatedName("ar.u")
    public int field968;

    @ObfuscatedName("ak.e(IB)Lar;")
    public static class44 method838(int arg0) {
        class44 var1 = (class44) field965.method3302((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field966.method2843(14, arg0);
        class44 var3 = new class44();
        if (var2 != null) {
            var3.method841(new class111(var2));
        }
        field965.method3304(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ar.a(Ldh;I)V")
    public void method841(class111 arg0) {
        while (true) {
            int var2 = arg0.method2176();
            if (var2 == 0) {
                return;
            }
            this.method842(arg0, var2);
        }
    }

    @ObfuscatedName("ar.l(Ldh;IB)V")
    public void method842(class111 arg0, int arg1) {
        if (arg1 == 1) {
            this.field964 = arg0.method2178();
            this.field967 = arg0.method2176();
            this.field968 = arg0.method2176();
        }
    }

    @ObfuscatedName("s.c(I)V")
    public static void method167() {
        field965.method3303();
    }
}
