package deob;

@ObfuscatedName("ic")
public class class245 extends class198 {

    @ObfuscatedName("ic.x")
    public static class193 field3290 = new class193(64);

    @ObfuscatedName("ic.k")
    public int field3288 = 0;

    @ObfuscatedName("fm.w(Liq;I)V")
    public static void method2698(class239 arg0) {
        Statics.field3285 = arg0;
        Statics.field3286 = Statics.field3285.method3798(16);
    }

    @ObfuscatedName("ic.o(Lfi;B)V")
    public void method3877(class177 arg0) {
        while (true) {
            int var2 = arg0.method2931();
            if (var2 == 0) {
                return;
            }
            this.method3878(arg0, var2);
        }
    }

    @ObfuscatedName("ic.x(Lfi;II)V")
    public void method3878(class177 arg0, int arg1) {
        if (arg1 == 5) {
            this.field3288 = arg0.method2886();
        }
    }

    @ObfuscatedName("g.k(I)V")
    public static void method142() {
        field3290.method3242();
    }
}
