package deob;

@ObfuscatedName("um")
public class class538 extends class501 {

    @ObfuscatedName("um.ad")
    public static class313 field5296 = new class313(64);

    @ObfuscatedName("um.ag")
    public int[][] field5297;

    @ObfuscatedName("um.ak")
    public Object[][] field5298;

    @ObfuscatedName("dp.aq(Lok;B)V")
    public static void method2269(class388 arg0) {
        Statics.field5295 = arg0;
    }

    @ObfuscatedName("hk.ad(IB)Lum;")
    public static class538 method3571(int arg0) {
        class538 var1 = (class538) field5296.method5495((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field5295.method6539(39, arg0);
        class538 var3 = new class538();
        if (var2 != null) {
            var3.method8608(new class547(var2));
        }
        var3.method8609();
        field5296.method5498(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("um.ag(Lvp;I)V")
    public void method8608(class547 arg0) {
        while (true) {
            int var2 = arg0.method8804();
            if (var2 == 0) {
                return;
            }
            this.method8615(arg0, var2);
        }
    }

    @ObfuscatedName("um.ak(Lvp;II)V")
    public void method8615(class547 arg0, int arg1) {
        if (arg1 != 1) {
            return;
        }
        int var3 = arg0.method8804();
        if (this.field5297 == null) {
            this.field5297 = new int[var3][];
        }
        for (int var4 = arg0.method8804(); var4 != 255; var4 = arg0.method8804()) {
            int var5 = var4 & 0x7F;
            boolean var6 = (var4 & 0x80) != 0;
            int[] var7 = new int[arg0.method8804()];
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8] = arg0.method8744();
            }
            this.field5297[var5] = var7;
            if (var6) {
                if (this.field5298 == null) {
                    this.field5298 = new Object[this.field5297.length][];
                }
                Object[][] var9 = this.field5298;
                int var11 = arg0.method8744();
                Object[] var12 = new Object[var7.length * var11];
                for (int var13 = 0; var13 < var11; var13++) {
                    for (int var14 = 0; var14 < var7.length; var14++) {
                        int var15 = var7.length * var13 + var14;
                        class535 var16 = class533.method2651(var7[var14]);
                        var12[var15] = var16.method8589(arg0);
                    }
                }
                var9[var5] = var12;
            }
        }
    }

    @ObfuscatedName("um.ap(B)V")
    public void method8609() {
    }
}
