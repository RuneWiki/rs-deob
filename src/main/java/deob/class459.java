package deob;

@ObfuscatedName("qj")
public class class459 extends class425 {

    @ObfuscatedName("qj.f")
    public static class266 field4848 = new class266(64);

    @ObfuscatedName("qj.c")
    public Object[][] field4850;

    @ObfuscatedName("qj.x")
    public int[][] field4847;

    @ObfuscatedName("qj.h")
    public int field4851 = -1;

    @ObfuscatedName("np.a(Llg;I)V")
    public static void method6700(class330 arg0) {
        Statics.field4849 = arg0;
    }

    @ObfuscatedName("ex.f(II)Lqj;")
    public static class459 method2951(int arg0) {
        class459 var1 = (class459) field4848.method4839((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field4849.method5859(38, arg0);
        class459 var3 = new class459();
        if (var2 != null) {
            var3.method7618(new class464(var2));
        }
        var3.method7621();
        field4848.method4834(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("qj.c(Lqr;B)V")
    public void method7618(class464 arg0) {
        while (true) {
            int var2 = arg0.method7735();
            if (var2 == 0) {
                return;
            }
            this.method7626(arg0, var2);
        }
    }

    @ObfuscatedName("qj.x(IB)[Ljava/lang/Object;")
    public Object[] method7619(int arg0) {
        return this.field4850 == null ? null : this.field4850[arg0];
    }

    @ObfuscatedName("qj.h(Lqr;II)V")
    public void method7626(class464 arg0, int arg1) {
        if (arg1 == 3) {
            int var3 = arg0.method7735();
            if (this.field4850 == null) {
                this.field4850 = new Object[var3][];
                this.field4847 = new int[var3][];
            }
            for (int var4 = arg0.method7735(); var4 != 255; var4 = arg0.method7735()) {
                int var5 = arg0.method7735();
                int[] var6 = new int[var5];
                for (int var7 = 0; var7 < var5; var7++) {
                    var6[var7] = arg0.method7801();
                }
                Object[][] var8 = this.field4850;
                int var10 = arg0.method7801();
                Object[] var11 = new Object[var6.length * var10];
                for (int var12 = 0; var12 < var10; var12++) {
                    for (int var13 = 0; var13 < var6.length; var13++) {
                        int var14 = var6.length * var12 + var13;
                        class454 var15 = class452.method4310(var6[var13]);
                        var11[var14] = var15.method7577(arg0);
                    }
                }
                var8[var4] = var11;
                this.field4847[var4] = var6;
            }
        } else if (arg1 == 4) {
            this.field4851 = arg0.method7736();
        }
    }

    @ObfuscatedName("qj.j(B)V")
    public void method7621() {
    }
}
