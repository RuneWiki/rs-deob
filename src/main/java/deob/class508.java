package deob;

@ObfuscatedName("tc")
public class class508 extends class469 {

    @ObfuscatedName("tc.ae")
    public static class288 field5053 = new class288(64);

    @ObfuscatedName("tc.ao")
    public Object[][] field5057;

    @ObfuscatedName("tc.at")
    public int[][] field5055;

    @ObfuscatedName("tc.ac")
    public int field5056 = -1;

    @ObfuscatedName("jq.au(Lnu;B)V")
    public static void method4660(class359 arg0) {
        Statics.field5054 = arg0;
    }

    @ObfuscatedName("gm.ae(II)Ltc;")
    public static class508 method3057(int arg0) {
        class508 var1 = (class508) field5053.method5182((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field5054.method6128(38, arg0);
        class508 var3 = new class508();
        if (var2 != null) {
            var3.method8215(new class515(var2));
        }
        var3.method8204();
        field5053.method5177(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("tc.ao(Ltm;I)V")
    public void method8215(class515 arg0) {
        while (true) {
            int var2 = arg0.method8300();
            if (var2 == 0) {
                return;
            }
            this.method8203(arg0, var2);
        }
    }

    @ObfuscatedName("tc.at(II)[Ljava/lang/Object;")
    public Object[] method8206(int arg0) {
        return this.field5057 == null ? null : this.field5057[arg0];
    }

    @ObfuscatedName("tc.ac(Ltm;II)V")
    public void method8203(class515 arg0, int arg1) {
        if (arg1 == 3) {
            int var3 = arg0.method8300();
            if (this.field5057 == null) {
                this.field5057 = new Object[var3][];
                this.field5055 = new int[var3][];
            }
            for (int var4 = arg0.method8300(); var4 != 255; var4 = arg0.method8300()) {
                int var5 = arg0.method8300();
                int[] var6 = new int[var5];
                for (int var7 = 0; var7 < var5; var7++) {
                    var6[var7] = arg0.method8436();
                }
                this.field5057[var4] = class509.method373(arg0, var6);
                this.field5055[var4] = var6;
            }
        } else if (arg1 == 4) {
            this.field5056 = arg0.method8322();
        }
    }

    @ObfuscatedName("tc.ai(B)V")
    public void method8204() {
    }

    @ObfuscatedName("ah.az(I)V")
    public static void method289() {
        field5053.method5175();
    }
}
