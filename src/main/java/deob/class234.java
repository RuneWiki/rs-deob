package deob;

@ObfuscatedName("iu")
public class class234 extends class457 {

    @ObfuscatedName("iu.at")
    public class224[] field2626;

    public class234(class357 arg0, class357 arg1, int arg2, boolean arg3) {
        class376 var5 = new class376();
        int var6 = arg0.method6135(arg2);
        this.field2626 = new class224[var6];
        int[] var7 = arg0.method6090(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method6080(arg2, var7[var8]);
            class229 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class229 var12 = (class229) var5.method6309(); var12 != null; var12 = (class229) var5.method6311()) {
                if (var12.field2536 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method6087(0, var11);
                } else {
                    var13 = arg1.method6087(var11, 0);
                }
                var10 = new class229(var11, var13);
                var5.method6303(var10);
            }
            this.field2626[var7[var8]] = new class224(var9, var10);
        }
    }

    @ObfuscatedName("iu.at(IS)Z")
    public boolean method4357(int arg0) {
        return this.field2626[arg0].field2492;
    }
}
