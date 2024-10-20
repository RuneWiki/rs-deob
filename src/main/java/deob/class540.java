package deob;

@ObfuscatedName("ut")
public class class540 extends class501 {

    @ObfuscatedName("ut.ad")
    public static class313 field5304 = new class313(64);

    @ObfuscatedName("ut.ag")
    public Object[][] field5308;

    @ObfuscatedName("ut.ak")
    public int[][] field5307;

    @ObfuscatedName("ut.ap")
    public int field5305 = -1;

    @ObfuscatedName("jt.aq(II)Lut;")
    public static class540 method4538(int arg0) {
        class540 var1 = (class540) field5304.method5495((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field5306.method6539(38, arg0);
        class540 var3 = new class540();
        if (var2 != null) {
            var3.method8633(new class547(var2));
        }
        var3.method8632();
        field5304.method5498(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ut.ad(Lvp;I)V")
    public void method8633(class547 arg0) {
        while (true) {
            int var2 = arg0.method8804();
            if (var2 == 0) {
                return;
            }
            this.method8635(arg0, var2);
        }
    }

    @ObfuscatedName("ut.ag(II)[Ljava/lang/Object;")
    public Object[] method8634(int arg0) {
        return this.field5308 == null ? null : this.field5308[arg0];
    }

    @ObfuscatedName("ut.ak(Lvp;IB)V")
    public void method8635(class547 arg0, int arg1) {
        if (arg1 == 3) {
            int var3 = arg0.method8804();
            if (this.field5308 == null) {
                this.field5308 = new Object[var3][];
                this.field5307 = new int[var3][];
            }
            for (int var4 = arg0.method8804(); var4 != 255; var4 = arg0.method8804()) {
                int var5 = arg0.method8804();
                int[] var6 = new int[var5];
                for (int var7 = 0; var7 < var5; var7++) {
                    var6[var7] = arg0.method8744();
                }
                Object[][] var8 = this.field5308;
                int var10 = arg0.method8744();
                Object[] var11 = new Object[var6.length * var10];
                for (int var12 = 0; var12 < var10; var12++) {
                    for (int var13 = 0; var13 < var6.length; var13++) {
                        int var14 = var6.length * var12 + var13;
                        class535 var15 = class533.method2651(var6[var13]);
                        var11[var14] = var15.method8589(arg0);
                    }
                }
                var8[var4] = var11;
                this.field5307[var4] = var6;
            }
        } else if (arg1 == 4) {
            this.field5305 = arg0.method8750();
        }
    }

    @ObfuscatedName("ut.ap(I)V")
    public void method8632() {
    }

    @ObfuscatedName("lp.an(I)V")
    public static void method5463() {
        field5304.method5500();
    }
}
