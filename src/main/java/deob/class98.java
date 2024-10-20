package deob;

@ObfuscatedName("cw")
public class class98 extends class195 {

    @ObfuscatedName("cw.t")
    public class83[] field1685;

    public class98(class158 arg0, class158 arg1, int arg2, boolean arg3) {
        class190 var5 = new class190();
        int var6 = arg0.method2891(arg2);
        this.field1685 = new class83[var6];
        int[] var7 = arg0.method2899(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method2881(arg2, var7[var8]);
            class97 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class97 var12 = (class97) var5.method3415(); var12 != null; var12 = (class97) var5.method3419()) {
                if (var12.field1678 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method2912(0, var11);
                } else {
                    var13 = arg1.method2912(var11, 0);
                }
                var10 = new class97(var11, var13);
                var5.method3442(var10);
            }
            this.field1685[var7[var8]] = new class83(var9, var10);
        }
    }

    @ObfuscatedName("cw.t(II)Z")
    public boolean method2008(int arg0) {
        return this.field1685[arg0].field1453;
    }
}
