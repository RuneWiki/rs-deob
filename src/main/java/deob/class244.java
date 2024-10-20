package deob;

@ObfuscatedName("iq")
public class class244 extends class195 {

    @ObfuscatedName("iq.c")
    public static class190 field3313 = new class190(64);

    @ObfuscatedName("iq.e")
    public boolean field3315 = false;

    @ObfuscatedName("et.i(Liw;I)V")
    public static void method2638(class236 arg0) {
        Statics.field3317 = arg0;
    }

    @ObfuscatedName("iq.c(Lfx;S)V")
    public void method3965(class174 arg0) {
        while (true) {
            int var2 = arg0.method2870();
            if (var2 == 0) {
                return;
            }
            this.method3966(arg0, var2);
        }
    }

    @ObfuscatedName("iq.e(Lfx;II)V")
    public void method3966(class174 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3315 = true;
        }
    }
}
