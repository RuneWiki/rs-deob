package deob;

@ObfuscatedName("gi")
public class class202 extends class348 {

    @ObfuscatedName("gi.f")
    public class195[] field2367;

    public class202(class276 arg0, class276 arg1, int arg2, boolean arg3) {
        class295 var5 = new class295();
        int var6 = arg0.method4514(arg2);
        this.field2367 = new class195[var6];
        int[] var7 = arg0.method4513(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method4504(arg2, var7[var8]);
            class198 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class198 var12 = (class198) var5.method4721(); var12 != null; var12 = (class198) var5.method4723()) {
                if (var12.field2289 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method4529(0, var11);
                } else {
                    var13 = arg1.method4529(var11, 0);
                }
                var10 = new class198(var11, var13);
                var5.method4716(var10);
            }
            this.field2367[var7[var8]] = new class195(var9, var10);
        }
    }

    @ObfuscatedName("gi.e(II)Z")
    public boolean method3796(int arg0) {
        return this.field2367[arg0].field2226;
    }
}
