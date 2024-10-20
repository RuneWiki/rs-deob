package deob;

@ObfuscatedName("uc")
public class class541 extends class502 {

    @ObfuscatedName("uc.ay")
    public static class315 field5319 = new class315(64);

    @ObfuscatedName("uc.an")
    public Object[][] field5320;

    @ObfuscatedName("uc.au")
    public int[][] field5318;

    @ObfuscatedName("uc.ax")
    public int field5321 = -1;

    @ObfuscatedName("rd.ab(II)Luc;")
    public static class541 method7764(int arg0) {
        class541 var1 = (class541) field5319.method5586((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field5322.method6670(38, arg0);
        class541 var3 = new class541();
        if (var2 != null) {
            var3.method8699(new class549(var2));
        }
        var3.method8703();
        field5319.method5589(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("uc.ay(Lvg;I)V")
    public void method8699(class549 arg0) {
        while (true) {
            int var2 = arg0.method9025();
            if (var2 == 0) {
                return;
            }
            this.method8702(arg0, var2);
        }
    }

    @ObfuscatedName("uc.an(IB)[Ljava/lang/Object;")
    public Object[] method8700(int arg0) {
        return this.field5320 == null ? null : this.field5320[arg0];
    }

    @ObfuscatedName("uc.au(Lvg;II)V")
    public void method8702(class549 arg0, int arg1) {
        if (arg1 == 3) {
            int var3 = arg0.method9025();
            if (this.field5320 == null) {
                this.field5320 = new Object[var3][];
                this.field5318 = new int[var3][];
            }
            for (int var4 = arg0.method9025(); var4 != 255; var4 = arg0.method9025()) {
                int var5 = arg0.method9025();
                int[] var6 = new int[var5];
                for (int var7 = 0; var7 < var5; var7++) {
                    var6[var7] = arg0.method8813();
                }
                Object[][] var8 = this.field5320;
                int var10 = arg0.method8813();
                Object[] var11 = new Object[var6.length * var10];
                for (int var12 = 0; var12 < var10; var12++) {
                    for (int var13 = 0; var13 < var6.length; var13++) {
                        int var14 = var6.length * var12 + var13;
                        class536 var15 = class534.method7129(var6[var13]);
                        var11[var14] = var15.method8662(arg0);
                    }
                }
                var8[var4] = var11;
                this.field5318[var4] = var6;
            }
        } else if (arg1 == 4) {
            this.field5321 = arg0.method8843();
        }
    }

    @ObfuscatedName("uc.ax(B)V")
    public void method8703() {
    }
}
