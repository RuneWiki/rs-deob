package deob;

@ObfuscatedName("pu")
public class class437 extends class406 {

    @ObfuscatedName("pu.h")
    public static class256 field4671 = new class256(64);

    @ObfuscatedName("pu.w")
    public int[][] field4669;

    @ObfuscatedName("pu.v")
    public Object[][] field4672;

    @ObfuscatedName("ln.s(IB)Lpu;")
    public static class437 method5176(int arg0) {
        class437 var1 = (class437) field4671.method4599((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field4670.method5179(39, arg0);
        class437 var3 = new class437();
        if (var2 != null) {
            var3.method6825(new class444(var2));
        }
        var3.method6816();
        field4671.method4600(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("pu.h(Lqr;I)V")
    public void method6825(class444 arg0) {
        while (true) {
            int var2 = arg0.method6929();
            if (var2 == 0) {
                return;
            }
            this.method6817(arg0, var2);
        }
    }

    @ObfuscatedName("pu.w(Lqr;IB)V")
    public void method6817(class444 arg0, int arg1) {
        if (arg1 != 1) {
            return;
        }
        int var3 = arg0.method6929();
        if (this.field4669 == null) {
            this.field4669 = new int[var3][];
        }
        for (int var4 = arg0.method6929(); var4 != 255; var4 = arg0.method6929()) {
            int var5 = var4 & 0x7F;
            boolean var6 = (var4 & 0x80) != 0;
            int[] var7 = new int[arg0.method6929()];
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8] = arg0.method6944();
            }
            this.field4669[var5] = var7;
            if (var6) {
                if (this.field4672 == null) {
                    this.field4672 = new Object[this.field4669.length][];
                }
                Object[][] var9 = this.field4672;
                int var11 = arg0.method6944();
                Object[] var12 = new Object[var7.length * var11];
                for (int var13 = 0; var13 < var11; var13++) {
                    for (int var14 = 0; var14 < var7.length; var14++) {
                        int var15 = var7.length * var13 + var14;
                        class434 var16 = class432.method280(var7[var14]);
                        var12[var15] = var16.method6796(arg0);
                    }
                }
                var9[var5] = var12;
            }
        }
    }

    @ObfuscatedName("pu.v(I)V")
    public void method6816() {
    }

    @ObfuscatedName("gt.c(B)V")
    public static void method3891() {
        field4671.method4603();
    }
}
