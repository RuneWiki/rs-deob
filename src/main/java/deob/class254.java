package deob;

@ObfuscatedName("ia")
public class class254 extends class185 {

    @ObfuscatedName("ia.v")
    public static class155 field3269 = new class155(64);

    @ObfuscatedName("ia.d")
    public boolean field3271 = false;

    @ObfuscatedName("m.n(Lig;I)V")
    public static void method204(class245 arg0) {
        Statics.field3270 = arg0;
    }

    @ObfuscatedName("ia.v(Lkx;B)V")
    public void method4199(class311 arg0) {
        while (true) {
            int var2 = arg0.method5310();
            if (var2 == 0) {
                return;
            }
            this.method4200(arg0, var2);
        }
    }

    @ObfuscatedName("ia.d(Lkx;II)V")
    public void method4200(class311 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3271 = true;
        }
    }
}
