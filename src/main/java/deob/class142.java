package deob;

@ObfuscatedName("ex")
public class class142 extends class206 {

    @ObfuscatedName("ex.s")
    public class129[] field2023;

    @ObfuscatedName("bi.s(Lir;Lir;IZI)Lex;")
    public static class142 method889(class247 arg0, class247 arg1, int arg2, boolean arg3) {
        boolean var4 = true;
        int[] var5 = arg0.method4195(arg2);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = arg0.method4192(arg2, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9;
                if (arg3) {
                    var9 = arg1.method4192(0, var8);
                } else {
                    var9 = arg1.method4192(var8, 0);
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
            return new class142(arg0, arg1, arg2, arg3);
        } catch (Exception var11) {
            return null;
        }
    }

    public class142(class247 arg0, class247 arg1, int arg2, boolean arg3) {
        class205 var5 = new class205();
        int var6 = arg0.method4209(arg2);
        this.field2023 = new class129[var6];
        int[] var7 = arg0.method4195(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method4231(arg2, var7[var8]);
            class136 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class136 var12 = (class136) var5.method3752(); var12 != null; var12 = (class136) var5.method3762()) {
                if (var12.field1933 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method4192(0, var11);
                } else {
                    var13 = arg1.method4192(var11, 0);
                }
                var10 = new class136(var11, var13);
                var5.method3747(var10);
            }
            this.field2023[var7[var8]] = new class129(var9, var10);
        }
    }

    @ObfuscatedName("ex.g(IB)Z")
    public boolean method2920(int arg0) {
        return this.field2023[arg0].field1778;
    }
}
