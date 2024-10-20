package deob;

@ObfuscatedName("iw")
public class class256 extends class206 {

    @ObfuscatedName("iw.w")
    public static class201 field3404 = new class201(64);

    @ObfuscatedName("iw.e")
    public boolean field3405 = false;

    @ObfuscatedName("t.a(Lib;I)V")
    public static void method23(class247 arg0) {
        Statics.field3406 = arg0;
    }

    @ObfuscatedName("iw.w(Lgh;I)V")
    public void method4097(class185 arg0) {
        while (true) {
            int var2 = arg0.method2962();
            if (var2 == 0) {
                return;
            }
            this.method4098(arg0, var2);
        }
    }

    @ObfuscatedName("iw.e(Lgh;II)V")
    public void method4098(class185 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3405 = true;
        }
    }
}
