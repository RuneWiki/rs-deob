package deob;

@ObfuscatedName("qs")
public class class460 extends class428 {

    @ObfuscatedName("qs.e")
    public static class269 field4882 = new class269(64);

    @ObfuscatedName("qs.v")
    public int[][] field4884;

    @ObfuscatedName("qs.x")
    public Object[][] field4881;

    @ObfuscatedName("oq.h(Lly;B)V")
    public static void method6924(class333 arg0) {
        Statics.field4883 = arg0;
    }

    @ObfuscatedName("ej.e(II)Lqs;")
    public static class460 method2928(int arg0) {
        class460 var1 = (class460) field4882.method4917((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field4883.method5909(39, arg0);
        class460 var3 = new class460();
        if (var2 != null) {
            var3.method7673(new class467(var2));
        }
        var3.method7675();
        field4882.method4925(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("qs.v(Lqy;B)V")
    public void method7673(class467 arg0) {
        while (true) {
            int var2 = arg0.method7792();
            if (var2 == 0) {
                return;
            }
            this.method7682(arg0, var2);
        }
    }

    @ObfuscatedName("qs.x(Lqy;IB)V")
    public void method7682(class467 arg0, int arg1) {
        if (arg1 != 1) {
            return;
        }
        int var3 = arg0.method7792();
        if (this.field4884 == null) {
            this.field4884 = new int[var3][];
        }
        for (int var4 = arg0.method7792(); var4 != 255; var4 = arg0.method7792()) {
            int var5 = var4 & 0x7F;
            boolean var6 = (var4 & 0x80) != 0;
            int[] var7 = new int[arg0.method7792()];
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8] = arg0.method7806();
            }
            this.field4884[var5] = var7;
            if (var6) {
                if (this.field4881 == null) {
                    this.field4881 = new Object[this.field4884.length][];
                }
                Object[][] var9 = this.field4881;
                int var11 = arg0.method7806();
                Object[] var12 = new Object[var7.length * var11];
                for (int var13 = 0; var13 < var11; var13++) {
                    for (int var14 = 0; var14 < var7.length; var14++) {
                        int var15 = var7.length * var13 + var14;
                        class457 var16 = class455.method73(var7[var14]);
                        var12[var15] = var16.method7650(arg0);
                    }
                }
                var9[var5] = var12;
            }
        }
    }

    @ObfuscatedName("qs.m(I)V")
    public void method7675() {
    }
}
