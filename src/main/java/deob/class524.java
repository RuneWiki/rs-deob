package deob;

@ObfuscatedName("uh")
public class class524 extends class485 {

    @ObfuscatedName("uh.ap")
    public static class302 field5124 = new class302(64);

    @ObfuscatedName("uh.af")
    public Object[][] field5126;

    @ObfuscatedName("uh.aj")
    public int[][] field5127;

    @ObfuscatedName("uh.aq")
    public int field5128 = -1;

    @ObfuscatedName("qv.am(Low;B)V")
    public static void method7421(class375 arg0) {
        Statics.field5125 = arg0;
    }

    @ObfuscatedName("rc.ap(II)Luh;")
    public static class524 method7767(int arg0) {
        class524 var1 = (class524) field5124.method5400((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field5125.method6396(38, arg0);
        class524 var3 = new class524();
        if (var2 != null) {
            var3.method8460(new class531(var2));
        }
        var3.method8463();
        field5124.method5402(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("uh.af(Luk;I)V")
    public void method8460(class531 arg0) {
        while (true) {
            int var2 = arg0.method8561();
            if (var2 == 0) {
                return;
            }
            this.method8477(arg0, var2);
        }
    }

    @ObfuscatedName("uh.aj(II)[Ljava/lang/Object;")
    public Object[] method8461(int arg0) {
        return this.field5126 == null ? null : this.field5126[arg0];
    }

    @ObfuscatedName("uh.aq(Luk;II)V")
    public void method8477(class531 arg0, int arg1) {
        if (arg1 == 3) {
            int var3 = arg0.method8561();
            if (this.field5126 == null) {
                this.field5126 = new Object[var3][];
                this.field5127 = new int[var3][];
            }
            for (int var4 = arg0.method8561(); var4 != 255; var4 = arg0.method8561()) {
                int var5 = arg0.method8561();
                int[] var6 = new int[var5];
                for (int var7 = 0; var7 < var5; var7++) {
                    var6[var7] = arg0.method8576();
                }
                Object[][] var8 = this.field5126;
                int var10 = arg0.method8576();
                Object[] var11 = new Object[var6.length * var10];
                for (int var12 = 0; var12 < var10; var12++) {
                    for (int var13 = 0; var13 < var6.length; var13++) {
                        int var14 = var6.length * var12 + var13;
                        class519 var15 = class517.method4843(var6[var13]);
                        var11[var14] = var15.method8428(arg0);
                    }
                }
                var8[var4] = var11;
                this.field5127[var4] = var6;
            }
        } else if (arg1 == 4) {
            this.field5128 = arg0.method8703();
        }
    }

    @ObfuscatedName("uh.ar(B)V")
    public void method8463() {
    }
}
