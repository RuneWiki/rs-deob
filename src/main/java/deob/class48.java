package deob;

@ObfuscatedName("dn")
public class class48 extends class7 {

    @ObfuscatedName("dn.v")
    public class147[] field532;

    public class48(class87 arg0, class87 arg1, int arg2, boolean arg3) {
        class71 var5 = new class71();
        int var6 = arg0.method1352(arg2);
        this.field532 = new class147[var6];
        int[] var7 = arg0.method1335(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method1298(arg2, var7[var8]);
            class44 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class44 var12 = (class44) var5.method1104(); var12 != null; var12 = (class44) var5.method1106()) {
                if (var12.field513 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method1304(0, var11);
                } else {
                    var13 = arg1.method1304(var11, 0);
                }
                var10 = new class44(var11, var13);
                var5.method1099(var10);
            }
            this.field532[var7[var8]] = new class147(var9, var10);
        }
    }

    @ObfuscatedName("dn.v(II)Z")
    public boolean method862(int arg0) {
        return this.field532[arg0].field2210;
    }
}
