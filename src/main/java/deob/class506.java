package deob;

@ObfuscatedName("tk")
public class class506 extends class469 {

    @ObfuscatedName("tk.ae")
    public static class288 field5042 = new class288(64);

    @ObfuscatedName("tk.ao")
    public int[][] field5044;

    @ObfuscatedName("tk.at")
    public Object[][] field5046;

    @ObfuscatedName("gm.ae(IB)Ltk;")
    public static class506 method3058(int arg0) {
        class506 var1 = (class506) field5042.method5182((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field5043.method6128(39, arg0);
        class506 var3 = new class506();
        if (var2 != null) {
            var3.method8183(new class515(var2));
        }
        var3.method8188();
        field5042.method5177(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("tk.ao(Ltm;B)V")
    public void method8183(class515 arg0) {
        while (true) {
            int var2 = arg0.method8300();
            if (var2 == 0) {
                return;
            }
            this.method8184(arg0, var2);
        }
    }

    @ObfuscatedName("tk.at(Ltm;II)V")
    public void method8184(class515 arg0, int arg1) {
        if (arg1 != 1) {
            return;
        }
        int var3 = arg0.method8300();
        if (this.field5044 == null) {
            this.field5044 = new int[var3][];
        }
        for (int var4 = arg0.method8300(); var4 != 255; var4 = arg0.method8300()) {
            int var5 = var4 & 0x7F;
            boolean var6 = (var4 & 0x80) != 0;
            int[] var7 = new int[arg0.method8300()];
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8] = arg0.method8436();
            }
            this.field5044[var5] = var7;
            if (var6) {
                if (this.field5046 == null) {
                    this.field5046 = new Object[this.field5044.length][];
                }
                this.field5046[var5] = class509.method373(arg0, var7);
            }
        }
    }

    @ObfuscatedName("tk.ac(I)V")
    public void method8188() {
    }

    @ObfuscatedName("it.ai(B)V")
    public static void method3938() {
        field5042.method5175();
    }
}
