package deob;

@ObfuscatedName("ic")
public class class255 extends class206 {

    @ObfuscatedName("ic.w")
    public static class201 field3402 = new class201(64);

    @ObfuscatedName("ic.e")
    public boolean field3403 = false;

    @ObfuscatedName("q.a(Lib;I)V")
    public static void method135(class247 arg0) {
        Statics.field3401 = arg0;
    }

    @ObfuscatedName("ic.w(Lgh;B)V")
    public void method4090(class185 arg0) {
        while (true) {
            int var2 = arg0.method2962();
            if (var2 == 0) {
                return;
            }
            this.method4088(arg0, var2);
        }
    }

    @ObfuscatedName("ic.e(Lgh;II)V")
    public void method4088(class185 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3403 = true;
        }
    }
}
