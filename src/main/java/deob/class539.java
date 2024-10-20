package deob;

@ObfuscatedName("uj")
public class class539 extends class502 {

    @ObfuscatedName("uj.ay")
    public static class315 field5307 = new class315(64);

    @ObfuscatedName("uj.an")
    public int[][] field5309;

    @ObfuscatedName("uj.au")
    public Object[][] field5310;

    @ObfuscatedName("tt.ab(II)Luj;")
    public static class539 method8268(int arg0) {
        class539 var1 = (class539) field5307.method5586((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field5308.method6670(39, arg0);
        class539 var3 = new class539();
        if (var2 != null) {
            var3.method8677(new class549(var2));
        }
        var3.method8684();
        field5307.method5589(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("uj.ay(Lvg;I)V")
    public void method8677(class549 arg0) {
        while (true) {
            int var2 = arg0.method9025();
            if (var2 == 0) {
                return;
            }
            this.method8678(arg0, var2);
        }
    }

    @ObfuscatedName("uj.an(Lvg;IB)V")
    public void method8678(class549 arg0, int arg1) {
        if (arg1 != 1) {
            return;
        }
        int var3 = arg0.method9025();
        if (this.field5309 == null) {
            this.field5309 = new int[var3][];
        }
        for (int var4 = arg0.method9025(); var4 != 255; var4 = arg0.method9025()) {
            int var5 = var4 & 0x7F;
            boolean var6 = (var4 & 0x80) != 0;
            int[] var7 = new int[arg0.method9025()];
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8] = arg0.method8813();
            }
            this.field5309[var5] = var7;
            if (var6) {
                if (this.field5310 == null) {
                    this.field5310 = new Object[this.field5309.length][];
                }
                Object[][] var9 = this.field5310;
                int var11 = arg0.method8813();
                Object[] var12 = new Object[var7.length * var11];
                for (int var13 = 0; var13 < var11; var13++) {
                    for (int var14 = 0; var14 < var7.length; var14++) {
                        int var15 = var7.length * var13 + var14;
                        class536 var16 = class534.method7129(var7[var14]);
                        var12[var15] = var16.method8662(arg0);
                    }
                }
                var9[var5] = var12;
            }
        }
    }

    @ObfuscatedName("uj.au(I)V")
    public void method8684() {
    }

    @ObfuscatedName("sp.ax(I)V")
    public static void method7908() {
        field5307.method5588();
    }
}
