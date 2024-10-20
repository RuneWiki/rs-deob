package deob;

@ObfuscatedName("cp")
public class class93 extends class130 {

    @ObfuscatedName("cp.k")
    public class81[] field1569;

    public class93(class183 arg0, class183 arg1, int arg2, boolean arg3) {
        class129 var5 = new class129();
        int var6 = arg0.method3075(arg2);
        this.field1569 = new class81[var6];
        int[] var7 = arg0.method3074(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method3065(arg2, var7[var8]);
            class87 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class87 var12 = (class87) var5.method2243(); var12 != null; var12 = (class87) var5.method2238()) {
                if (var12.field1468 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method3071(0, var11);
                } else {
                    var13 = arg1.method3071(var11, 0);
                }
                var10 = new class87(var11, var13);
                var5.method2220(var10);
            }
            this.field1569[var7[var8]] = new class81(var9, var10);
        }
    }

    @ObfuscatedName("cp.k(II)Z")
    public boolean method1793(int arg0) {
        return this.field1569[arg0].field1323;
    }
}
