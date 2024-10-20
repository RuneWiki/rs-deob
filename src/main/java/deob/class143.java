package deob;

@ObfuscatedName("et")
public class class143 extends class219 {

    @ObfuscatedName("et.t")
    public class130[] field2040;

    @ObfuscatedName("ah.t(Ljc;Ljc;IZB)Let;")
    public static class143 method344(class262 arg0, class262 arg1, int arg2, boolean arg3) {
        boolean var4 = true;
        int[] var5 = arg0.method4203(arg2);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = arg0.method4200(arg2, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9;
                if (arg3) {
                    var9 = arg1.method4200(0, var8);
                } else {
                    var9 = arg1.method4200(var8, 0);
                }
                if (var9 == null) {
                    var4 = false;
                }
            }
        }
        if (!var4) {
            return null;
        }
        try {
            return new class143(arg0, arg1, arg2, arg3);
        } catch (Exception var11) {
            return null;
        }
    }

    public class143(class262 arg0, class262 arg1, int arg2, boolean arg3) {
        class218 var5 = new class218();
        int var6 = arg0.method4204(arg2);
        this.field2040 = new class130[var6];
        int[] var7 = arg0.method4203(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method4265(arg2, var7[var8]);
            class137 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class137 var12 = (class137) var5.method3731(); var12 != null; var12 = (class137) var5.method3733()) {
                if (var12.field1954 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method4200(0, var11);
                } else {
                    var13 = arg1.method4200(var11, 0);
                }
                var10 = new class137(var11, var13);
                var5.method3759(var10);
            }
            this.field2040[var7[var8]] = new class130(var9, var10);
        }
    }

    @ObfuscatedName("et.q(II)Z")
    public boolean method2827(int arg0) {
        return this.field2040[arg0].field1799;
    }
}
