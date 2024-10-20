package deob;

@ObfuscatedName("el")
public class class148 extends class185 {

    @ObfuscatedName("el.n")
    public class135[] field1907;

    @ObfuscatedName("fd.n(Lig;Lig;IZI)Lel;")
    public static class148 method3357(class245 arg0, class245 arg1, int arg2, boolean arg3) {
        boolean var4 = true;
        int[] var5 = arg0.method3994(arg2);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = arg0.method3991(arg2, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9;
                if (arg3) {
                    var9 = arg1.method3991(0, var8);
                } else {
                    var9 = arg1.method3991(var8, 0);
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
            return new class148(arg0, arg1, arg2, arg3);
        } catch (Exception var11) {
            return null;
        }
    }

    public class148(class245 arg0, class245 arg1, int arg2, boolean arg3) {
        class273 var5 = new class273();
        int var6 = arg0.method4008(arg2);
        this.field1907 = new class135[var6];
        int[] var7 = arg0.method3994(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method4032(arg2, var7[var8]);
            class142 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class142 var12 = (class142) var5.method4721(); var12 != null; var12 = (class142) var5.method4706()) {
                if (var12.field1814 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method3991(0, var11);
                } else {
                    var13 = arg1.method3991(var11, 0);
                }
                var10 = new class142(var11, var13);
                var5.method4699(var10);
            }
            this.field1907[var7[var8]] = new class135(var9, var10);
        }
    }

    @ObfuscatedName("el.v(II)Z")
    public boolean method3177(int arg0) {
        return this.field1907[arg0].field1655;
    }
}
