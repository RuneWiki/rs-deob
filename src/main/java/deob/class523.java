package deob;

@ObfuscatedName("ug")
public class class523 extends class484 {

    @ObfuscatedName("ug.al")
    public static class302 field5088 = new class302(64);

    @ObfuscatedName("ug.ak")
    public Object[][] field5089;

    @ObfuscatedName("ug.ax")
    public int[][] field5092;

    @ObfuscatedName("ug.ao")
    public int field5090 = -1;

    @ObfuscatedName("ek.ac(Lom;I)V")
    public static void method2656(class374 arg0) {
        Statics.field5091 = arg0;
    }

    @ObfuscatedName("gu.al(IB)Lug;")
    public static class523 method3281(int arg0) {
        class523 var1 = (class523) field5088.method5286((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field5091.method6342(38, arg0);
        class523 var3 = new class523();
        if (var2 != null) {
            var3.method8265(new class530(var2));
        }
        var3.method8276();
        field5088.method5289(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ug.ak(Lul;I)V")
    public void method8265(class530 arg0) {
        while (true) {
            int var2 = arg0.method8365();
            if (var2 == 0) {
                return;
            }
            this.method8263(arg0, var2);
        }
    }

    @ObfuscatedName("ug.ax(II)[Ljava/lang/Object;")
    public Object[] method8273(int arg0) {
        return this.field5089 == null ? null : this.field5089[arg0];
    }

    @ObfuscatedName("ug.ao(Lul;IB)V")
    public void method8263(class530 arg0, int arg1) {
        if (arg1 == 3) {
            int var3 = arg0.method8365();
            if (this.field5089 == null) {
                this.field5089 = new Object[var3][];
                this.field5092 = new int[var3][];
            }
            for (int var4 = arg0.method8365(); var4 != 255; var4 = arg0.method8365()) {
                int var5 = arg0.method8365();
                int[] var6 = new int[var5];
                for (int var7 = 0; var7 < var5; var7++) {
                    var6[var7] = arg0.method8526();
                }
                this.field5089[var4] = class524.method7831(arg0, var6);
                this.field5092[var4] = var6;
            }
        } else if (arg1 == 4) {
            this.field5090 = arg0.method8387();
        }
    }

    @ObfuscatedName("ug.ah(I)V")
    public void method8276() {
    }

    @ObfuscatedName("ct.ar(S)V")
    public static void method2025() {
        field5088.method5288();
    }
}
