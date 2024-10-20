package deob;

@ObfuscatedName("cx")
public class class97 extends class187 {

    @ObfuscatedName("cx.a")
    public class82[] field1671;

    public class97(class151 arg0, class151 arg1, int arg2, boolean arg3) {
        class182 var5 = new class182();
        int var6 = arg0.method2806(arg2);
        this.field1671 = new class82[var6];
        int[] var7 = arg0.method2739(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method2731(arg2, var7[var8]);
            class96 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class96 var12 = (class96) var5.method3251(); var12 != null; var12 = (class96) var5.method3261()) {
                if (var12.field1662 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method2730(0, var11);
                } else {
                    var13 = arg1.method2730(var11, 0);
                }
                var10 = new class96(var11, var13);
                var5.method3274(var10);
            }
            this.field1671[var7[var8]] = new class82(var9, var10);
        }
    }

    @ObfuscatedName("cx.a(II)Z")
    public boolean method1970(int arg0) {
        return this.field1671[arg0].field1442;
    }
}
