package deob;

@ObfuscatedName("tk")
public class class507 extends class470 {

    @ObfuscatedName("tk.ay")
    public static class289 field5040 = new class289(64);

    @ObfuscatedName("tk.ar")
    public int[][] field5041;

    @ObfuscatedName("tk.am")
    public Object[][] field5043;

    @ObfuscatedName("pi.aw(Lnd;B)V")
    public static void method6953(class360 arg0) {
        Statics.field5044 = arg0;
    }

    @ObfuscatedName("qh.ay(IB)Ltk;")
    public static class507 method7367(int arg0) {
        class507 var1 = (class507) field5040.method5152((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field5044.method6117(39, arg0);
        class507 var3 = new class507();
        if (var2 != null) {
            var3.method8127(new class514(var2));
        }
        var3.method8126();
        field5040.method5149(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("tk.ar(Lty;I)V")
    public void method8127(class514 arg0) {
        while (true) {
            int var2 = arg0.method8244();
            if (var2 == 0) {
                return;
            }
            this.method8128(arg0, var2);
        }
    }

    @ObfuscatedName("tk.am(Lty;IB)V")
    public void method8128(class514 arg0, int arg1) {
        if (arg1 != 1) {
            return;
        }
        int var3 = arg0.method8244();
        if (this.field5041 == null) {
            this.field5041 = new int[var3][];
        }
        for (int var4 = arg0.method8244(); var4 != 255; var4 = arg0.method8244()) {
            int var5 = var4 & 0x7F;
            boolean var6 = (var4 & 0x80) != 0;
            int[] var7 = new int[arg0.method8244()];
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8] = arg0.method8260();
            }
            this.field5041[var5] = var7;
            if (var6) {
                if (this.field5043 == null) {
                    this.field5043 = new Object[this.field5041.length][];
                }
                this.field5043[var5] = class510.method96(arg0, var7);
            }
        }
    }

    @ObfuscatedName("tk.as(I)V")
    public void method8126() {
    }

    @ObfuscatedName("cx.aj(I)V")
    public static void method1143() {
        field5040.method5146();
    }
}
