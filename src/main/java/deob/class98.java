package deob;

@ObfuscatedName("co")
public class class98 extends class194 {

    @ObfuscatedName("co.e")
    public class83[] field1655;

    public class98(class158 arg0, class158 arg1, int arg2, boolean arg3) {
        class189 var5 = new class189();
        int var6 = arg0.method2864(arg2);
        this.field1655 = new class83[var6];
        int[] var7 = arg0.method2852(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method2843(arg2, var7[var8]);
            class97 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class97 var12 = (class97) var5.method3378(); var12 != null; var12 = (class97) var5.method3394()) {
                if (var12.field1642 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method2849(0, var11);
                } else {
                    var13 = arg1.method2849(var11, 0);
                }
                var10 = new class97(var11, var13);
                var5.method3374(var10);
            }
            this.field1655[var7[var8]] = new class83(var9, var10);
        }
    }

    @ObfuscatedName("co.e(II)Z")
    public boolean method2011(int arg0) {
        return this.field1655[arg0].field1417;
    }
}
