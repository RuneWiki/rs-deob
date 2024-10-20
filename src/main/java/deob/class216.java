package deob;

@ObfuscatedName("hd")
public class class216 extends class364 {

    @ObfuscatedName("hd.n")
    public class209[] field2436;

    public class216(class290 arg0, class290 arg1, int arg2, boolean arg3) {
        class309 var5 = new class309();
        int var6 = arg0.method4720(arg2);
        this.field2436 = new class209[var6];
        int[] var7 = arg0.method4719(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method4710(arg2, var7[var8]);
            class212 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class212 var12 = (class212) var5.method4962(); var12 != null; var12 = (class212) var5.method4985()) {
                if (var12.field2360 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method4716(0, var11);
                } else {
                    var13 = arg1.method4716(var11, 0);
                }
                var10 = new class212(var11, var13);
                var5.method4986(var10);
            }
            this.field2436[var7[var8]] = new class209(var9, var10);
        }
    }

    @ObfuscatedName("hd.n(II)Z")
    public boolean method3980(int arg0) {
        return this.field2436[arg0].field2306;
    }
}
