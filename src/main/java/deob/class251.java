package deob;

@ObfuscatedName("ia")
public class class251 extends class195 {

    @ObfuscatedName("ia.o")
    public static class190 field3355 = new class190(64);

    @ObfuscatedName("ia.i")
    public int field3356;

    @ObfuscatedName("ia.u")
    public int field3357;

    @ObfuscatedName("ia.g")
    public int field3358;

    @ObfuscatedName("gr.c(Lip;I)V")
    public static void method3372(class236 arg0) {
        Statics.field3359 = arg0;
    }

    @ObfuscatedName("ey.o(II)Lia;")
    public static class251 method2672(int arg0) {
        class251 var1 = (class251) field3355.method3220((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3359.method3741(14, arg0);
        class251 var3 = new class251();
        if (var2 != null) {
            var3.method4001(new class174(var2));
        }
        field3355.method3233(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ia.i(Lfp;I)V")
    public void method4001(class174 arg0) {
        while (true) {
            int var2 = arg0.method2843();
            if (var2 == 0) {
                return;
            }
            this.method4007(arg0, var2);
        }
    }

    @ObfuscatedName("ia.u(Lfp;II)V")
    public void method4007(class174 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3356 = arg0.method2861();
            this.field3357 = arg0.method2843();
            this.field3358 = arg0.method2843();
        }
    }
}
