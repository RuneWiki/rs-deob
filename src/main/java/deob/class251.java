package deob;

@ObfuscatedName("iw")
public class class251 extends class195 {

    @ObfuscatedName("iw.w")
    public static class190 field3391 = new class190(64);

    @ObfuscatedName("iw.a")
    public int field3390;

    @ObfuscatedName("iw.t")
    public int field3393;

    @ObfuscatedName("iw.s")
    public int field3394;

    @ObfuscatedName("iw.i(Lfp;B)V")
    public void method4067(class174 arg0) {
        while (true) {
            int var2 = arg0.method3061();
            if (var2 == 0) {
                return;
            }
            this.method4071(arg0, var2);
        }
    }

    @ObfuscatedName("iw.w(Lfp;II)V")
    public void method4071(class174 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3390 = arg0.method2882();
            this.field3393 = arg0.method3061();
            this.field3394 = arg0.method3061();
        }
    }

    @ObfuscatedName("du.a(I)V")
    public static void method2175() {
        field3391.method3232();
    }
}
