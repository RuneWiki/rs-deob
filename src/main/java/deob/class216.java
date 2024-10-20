package deob;

@ObfuscatedName("ho")
public class class216 extends class365 {

    @ObfuscatedName("ho.i")
    public class209[] field2453;

    public class216(class290 arg0, class290 arg1, int arg2, boolean arg3) {
        class309 var5 = new class309();
        int var6 = arg0.method4768(arg2);
        this.field2453 = new class209[var6];
        int[] var7 = arg0.method4752(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method4743(arg2, var7[var8]);
            class212 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class212 var12 = (class212) var5.method4981(); var12 != null; var12 = (class212) var5.method4987()) {
                if (var12.field2372 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method4750(0, var11);
                } else {
                    var13 = arg1.method4750(var11, 0);
                }
                var10 = new class212(var11, var13);
                var5.method4980(var10);
            }
            this.field2453[var7[var8]] = new class209(var9, var10);
        }
    }

    @ObfuscatedName("ho.i(II)Z")
    public boolean method4021(int arg0) {
        return this.field2453[arg0].field2320;
    }
}
