package deob;

@ObfuscatedName("ci")
public class class98 extends class195 {

    @ObfuscatedName("ci.n")
    public class83[] field1703;

    public class98(class158 arg0, class158 arg1, int arg2, boolean arg3) {
        class190 var5 = new class190();
        int var6 = arg0.method2978(arg2);
        this.field1703 = new class83[var6];
        int[] var7 = arg0.method2959(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method2948(arg2, var7[var8]);
            class97 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class97 var12 = (class97) var5.method3497(); var12 != null; var12 = (class97) var5.method3475()) {
                if (var12.field1698 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method3013(0, var11);
                } else {
                    var13 = arg1.method3013(var11, 0);
                }
                var10 = new class97(var11, var13);
                var5.method3477(var10);
            }
            this.field1703[var7[var8]] = new class83(var9, var10);
        }
    }

    @ObfuscatedName("ci.n(II)Z")
    public boolean method2061(int arg0) {
        return this.field1703[arg0].field1473;
    }
}
