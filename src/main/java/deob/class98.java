package deob;

@ObfuscatedName("cg")
public class class98 extends class195 {

    @ObfuscatedName("cg.o")
    public class83[] field1683;

    @ObfuscatedName("j.o(Lfg;Lfg;IZB)Lcg;")
    public static class98 method134(class158 arg0, class158 arg1, int arg2, boolean arg3) {
        boolean var4 = true;
        int[] var5 = arg0.method2949(arg2);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = arg0.method2946(arg2, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9;
                if (arg3) {
                    var9 = arg1.method2946(0, var8);
                } else {
                    var9 = arg1.method2946(var8, 0);
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
            return new class98(arg0, arg1, arg2, arg3);
        } catch (Exception var11) {
            return null;
        }
    }

    public class98(class158 arg0, class158 arg1, int arg2, boolean arg3) {
        class190 var5 = new class190();
        int var6 = arg0.method2950(arg2);
        this.field1683 = new class83[var6];
        int[] var7 = arg0.method2949(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method2940(arg2, var7[var8]);
            class97 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class97 var12 = (class97) var5.method3499(); var12 != null; var12 = (class97) var5.method3482()) {
                if (var12.field1675 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method2946(0, var11);
                } else {
                    var13 = arg1.method2946(var11, 0);
                }
                var10 = new class97(var11, var13);
                var5.method3470(var10);
            }
            this.field1683[var7[var8]] = new class83(var9, var10);
        }
    }

    @ObfuscatedName("cg.l(II)Z")
    public boolean method2036(int arg0) {
        return this.field1683[arg0].field1460;
    }
}
