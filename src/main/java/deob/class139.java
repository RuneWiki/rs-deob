package deob;

@ObfuscatedName("ee")
public class class139 extends class176 {

    @ObfuscatedName("ee.s")
    public class126[] field1871;

    public class139(class234 arg0, class234 arg1, int arg2, boolean arg3) {
        class262 var5 = new class262();
        int var6 = arg0.method3776(arg2);
        this.field1871 = new class126[var6];
        int[] var7 = arg0.method3770(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method3790(arg2, var7[var8]);
            class133 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class133 var12 = (class133) var5.method4480(); var12 != null; var12 = (class133) var5.method4491()) {
                if (var12.field1777 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method3856(0, var11);
                } else {
                    var13 = arg1.method3856(var11, 0);
                }
                var10 = new class133(var11, var13);
                var5.method4475(var10);
            }
            this.field1871[var7[var8]] = new class126(var9, var10);
        }
    }

    @ObfuscatedName("ee.s(IB)Z")
    public boolean method3036(int arg0) {
        return this.field1871[arg0].field1622;
    }
}
