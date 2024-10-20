package deob;

@ObfuscatedName("eq")
public class class139 extends class183 {

    @ObfuscatedName("eq.f")
    public class126[] field1866;

    public class139(class234 arg0, class234 arg1, int arg2, boolean arg3) {
        class262 var5 = new class262();
        int var6 = arg0.method3764(arg2);
        this.field1866 = new class126[var6];
        int[] var7 = arg0.method3808(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method3752(arg2, var7[var8]);
            class133 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class133 var12 = (class133) var5.method4540(); var12 != null; var12 = (class133) var5.method4533()) {
                if (var12.field1772 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method3760(0, var11);
                } else {
                    var13 = arg1.method3760(var11, 0);
                }
                var10 = new class133(var11, var13);
                var5.method4554(var10);
            }
            this.field1866[var7[var8]] = new class126(var9, var10);
        }
    }

    @ObfuscatedName("eq.f(II)Z")
    public boolean method3015(int arg0) {
        return this.field1866[arg0].field1620;
    }
}
