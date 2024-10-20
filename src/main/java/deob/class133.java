package deob;

@ObfuscatedName("el")
public class class133 extends class209 {

    @ObfuscatedName("el.g")
    public class120[] field1860;

    public class133(class250 arg0, class250 arg1, int arg2, boolean arg3) {
        class208 var5 = new class208();
        int var6 = arg0.method4496(arg2);
        this.field1860 = new class120[var6];
        int[] var7 = arg0.method4446(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method4438(arg2, var7[var8]);
            class127 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class127 var12 = (class127) var5.method3979(); var12 != null; var12 = (class127) var5.method3964()) {
                if (var12.field1764 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method4443(0, var11);
                } else {
                    var13 = arg1.method4443(var11, 0);
                }
                var10 = new class127(var11, var13);
                var5.method3957(var10);
            }
            this.field1860[var7[var8]] = new class120(var9, var10);
        }
    }

    @ObfuscatedName("el.g(II)Z")
    public boolean method3036(int arg0) {
        return this.field1860[arg0].field1615;
    }
}
