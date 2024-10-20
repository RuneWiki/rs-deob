package deob;

@ObfuscatedName("qp")
public class class457 extends class425 {

    @ObfuscatedName("qp.f")
    public static class266 field4840 = new class266(64);

    @ObfuscatedName("qp.c")
    public int[][] field4841;

    @ObfuscatedName("qp.x")
    public Object[][] field4843;

    @ObfuscatedName("ab.a(II)Lqp;")
    public static class457 method816(int arg0) {
        class457 var1 = (class457) field4840.method4839((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field4842.method5859(39, arg0);
        class457 var3 = new class457();
        if (var2 != null) {
            var3.method7594(new class464(var2));
        }
        var3.method7596();
        field4840.method4834(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("qp.f(Lqr;I)V")
    public void method7594(class464 arg0) {
        while (true) {
            int var2 = arg0.method7735();
            if (var2 == 0) {
                return;
            }
            this.method7597(arg0, var2);
        }
    }

    @ObfuscatedName("qp.c(Lqr;II)V")
    public void method7597(class464 arg0, int arg1) {
        if (arg1 != 1) {
            return;
        }
        int var3 = arg0.method7735();
        if (this.field4841 == null) {
            this.field4841 = new int[var3][];
        }
        for (int var4 = arg0.method7735(); var4 != 255; var4 = arg0.method7735()) {
            int var5 = var4 & 0x7F;
            boolean var6 = (var4 & 0x80) != 0;
            int[] var7 = new int[arg0.method7735()];
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8] = arg0.method7801();
            }
            this.field4841[var5] = var7;
            if (var6) {
                if (this.field4843 == null) {
                    this.field4843 = new Object[this.field4841.length][];
                }
                Object[][] var9 = this.field4843;
                int var11 = arg0.method7801();
                Object[] var12 = new Object[var7.length * var11];
                for (int var13 = 0; var13 < var11; var13++) {
                    for (int var14 = 0; var14 < var7.length; var14++) {
                        int var15 = var7.length * var13 + var14;
                        class454 var16 = class452.method4310(var7[var14]);
                        var12[var15] = var16.method7577(arg0);
                    }
                }
                var9[var5] = var12;
            }
        }
    }

    @ObfuscatedName("qp.x(I)V")
    public void method7596() {
    }
}
