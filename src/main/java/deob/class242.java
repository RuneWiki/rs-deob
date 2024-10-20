package deob;

@ObfuscatedName("io")
public class class242 extends class195 {

    @ObfuscatedName("io.a")
    public static class190 field3291 = new class190(64);

    @ObfuscatedName("io.t")
    public int field3292 = 0;

    @ObfuscatedName("io.i(Lfp;B)V")
    public void method3922(class174 arg0) {
        while (true) {
            int var2 = arg0.method3061();
            if (var2 == 0) {
                return;
            }
            this.method3926(arg0, var2);
        }
    }

    @ObfuscatedName("io.w(Lfp;II)V")
    public void method3926(class174 arg0, int arg1) {
        if (arg1 == 5) {
            this.field3292 = arg0.method2882();
        }
    }

    @ObfuscatedName("ca.a(I)V")
    public static void method1562() {
        field3291.method3232();
    }
}
