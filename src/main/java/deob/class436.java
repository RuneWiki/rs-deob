package deob;

@ObfuscatedName("po")
public class class436 extends class405 {

    @ObfuscatedName("po.v")
    public static class256 field4668 = new class256(64);

    @ObfuscatedName("po.q")
    public int[][] field4669;

    @ObfuscatedName("po.f")
    public Object[][] field4670;

    @ObfuscatedName("eq.c(Llh;B)V")
    public static void method2737(class315 arg0) {
        Statics.field4667 = arg0;
    }

    @ObfuscatedName("dg.v(IB)Lpo;")
    public static class436 method2501(int arg0) {
        class436 var1 = (class436) field4668.method4691((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field4667.method5305(39, arg0);
        class436 var3 = new class436();
        if (var2 != null) {
            var3.method6906(new class443(var2));
        }
        var3.method6916();
        field4668.method4693(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("po.q(Lqt;I)V")
    public void method6906(class443 arg0) {
        while (true) {
            int var2 = arg0.method7047();
            if (var2 == 0) {
                return;
            }
            this.method6907(arg0, var2);
        }
    }

    @ObfuscatedName("po.f(Lqt;II)V")
    public void method6907(class443 arg0, int arg1) {
        if (arg1 != 1) {
            return;
        }
        int var3 = arg0.method7047();
        if (this.field4669 == null) {
            this.field4669 = new int[var3][];
        }
        for (int var4 = arg0.method7047(); var4 != 255; var4 = arg0.method7047()) {
            int var5 = var4 & 0x7F;
            boolean var6 = (var4 & 0x80) != 0;
            int[] var7 = new int[arg0.method7047()];
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8] = arg0.method7062();
            }
            this.field4669[var5] = var7;
            if (var6) {
                if (this.field4670 == null) {
                    this.field4670 = new Object[this.field4669.length][];
                }
                this.field4670[var5] = class439.method4019(arg0, var7);
            }
        }
    }

    @ObfuscatedName("po.j(I)V")
    public void method6916() {
    }

    @ObfuscatedName("ff.e(I)V")
    public static void method3006() {
        field4668.method4695();
    }
}
