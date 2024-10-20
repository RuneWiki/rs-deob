package deob;

@ObfuscatedName("rn")
public class class469 extends class435 {

    @ObfuscatedName("rn.w")
    public static class273 field4918 = new class273(64);

    @ObfuscatedName("rn.v")
    public Object[][] field4917;

    @ObfuscatedName("rn.s")
    public int[][] field4920;

    @ObfuscatedName("rn.z")
    public int field4921 = -1;

    @ObfuscatedName("gp.f(Lln;I)V")
    public static void method3648(class337 arg0) {
        Statics.field4919 = arg0;
    }

    @ObfuscatedName("oz.w(IB)Lrn;")
    public static class469 method7132(int arg0) {
        class469 var1 = (class469) field4918.method5028((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field4919.method5990(38, arg0);
        class469 var3 = new class469();
        if (var2 != null) {
            var3.method7876(new class474(var2));
        }
        var3.method7878();
        field4918.method5027(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("rn.v(Lrd;I)V")
    public void method7876(class474 arg0) {
        while (true) {
            int var2 = arg0.method7964();
            if (var2 == 0) {
                return;
            }
            this.method7877(arg0, var2);
        }
    }

    @ObfuscatedName("rn.s(IB)[Ljava/lang/Object;")
    public Object[] method7889(int arg0) {
        return this.field4917 == null ? null : this.field4917[arg0];
    }

    @ObfuscatedName("rn.z(Lrd;II)V")
    public void method7877(class474 arg0, int arg1) {
        if (arg1 == 3) {
            int var3 = arg0.method7964();
            if (this.field4917 == null) {
                this.field4917 = new Object[var3][];
                this.field4920 = new int[var3][];
            }
            for (int var4 = arg0.method7964(); var4 != 255; var4 = arg0.method7964()) {
                int var5 = arg0.method7964();
                int[] var6 = new int[var5];
                for (int var7 = 0; var7 < var5; var7++) {
                    var6[var7] = arg0.method8059();
                }
                Object[][] var8 = this.field4917;
                int var10 = arg0.method8059();
                Object[] var11 = new Object[var6.length * var10];
                for (int var12 = 0; var12 < var10; var12++) {
                    for (int var13 = 0; var13 < var6.length; var13++) {
                        int var14 = var6.length * var12 + var13;
                        class464 var15 = class462.method6482(var6[var13]);
                        var11[var14] = var15.method7833(arg0);
                    }
                }
                var8[var4] = var11;
                this.field4920[var4] = var6;
            }
        } else if (arg1 == 4) {
            this.field4921 = arg0.method7985();
        }
    }

    @ObfuscatedName("rn.j(I)V")
    public void method7878() {
    }
}
