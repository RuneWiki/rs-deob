package deob;

@ObfuscatedName("qh")
public class class467 extends class435 {

    @ObfuscatedName("qh.w")
    public static class273 field4909 = new class273(64);

    @ObfuscatedName("qh.v")
    public int[][] field4908;

    @ObfuscatedName("qh.s")
    public Object[][] field4910;

    @ObfuscatedName("d.f(Lln;I)V")
    public static void method317(class337 arg0) {
        Statics.field4911 = arg0;
    }

    @ObfuscatedName("jv.w(II)Lqh;")
    public static class467 method5044(int arg0) {
        class467 var1 = (class467) field4909.method5028((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field4911.method5990(39, arg0);
        class467 var3 = new class467();
        if (var2 != null) {
            var3.method7856(new class474(var2));
        }
        var3.method7858();
        field4909.method5027(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("qh.v(Lrd;I)V")
    public void method7856(class474 arg0) {
        while (true) {
            int var2 = arg0.method7964();
            if (var2 == 0) {
                return;
            }
            this.method7857(arg0, var2);
        }
    }

    @ObfuscatedName("qh.s(Lrd;II)V")
    public void method7857(class474 arg0, int arg1) {
        if (arg1 != 1) {
            return;
        }
        int var3 = arg0.method7964();
        if (this.field4908 == null) {
            this.field4908 = new int[var3][];
        }
        for (int var4 = arg0.method7964(); var4 != 255; var4 = arg0.method7964()) {
            int var5 = var4 & 0x7F;
            boolean var6 = (var4 & 0x80) != 0;
            int[] var7 = new int[arg0.method7964()];
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8] = arg0.method8059();
            }
            this.field4908[var5] = var7;
            if (var6) {
                if (this.field4910 == null) {
                    this.field4910 = new Object[this.field4908.length][];
                }
                Object[][] var9 = this.field4910;
                int var11 = arg0.method8059();
                Object[] var12 = new Object[var7.length * var11];
                for (int var13 = 0; var13 < var11; var13++) {
                    for (int var14 = 0; var14 < var7.length; var14++) {
                        int var15 = var7.length * var13 + var14;
                        class464 var16 = class462.method6482(var7[var14]);
                        var12[var15] = var16.method7833(arg0);
                    }
                }
                var9[var5] = var12;
            }
        }
    }

    @ObfuscatedName("qh.z(I)V")
    public void method7858() {
    }
}
