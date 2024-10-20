package deob;

@ObfuscatedName("ep")
public class class133 extends class209 {

    @ObfuscatedName("ep.c")
    public class120[] field1866;

    public class133(class250 arg0, class250 arg1, int arg2, boolean arg3) {
        class208 var5 = new class208();
        int var6 = arg0.method4222(arg2);
        this.field1866 = new class120[var6];
        int[] var7 = arg0.method4221(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method4210(arg2, var7[var8]);
            class127 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class127 var12 = (class127) var5.method3746(); var12 != null; var12 = (class127) var5.method3747()) {
                if (var12.field1777 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method4229(0, var11);
                } else {
                    var13 = arg1.method4229(var11, 0);
                }
                var10 = new class127(var11, var13);
                var5.method3740(var10);
            }
            this.field1866[var7[var8]] = new class120(var9, var10);
        }
    }

    @ObfuscatedName("ep.c(IS)Z")
    public boolean method2836(int arg0) {
        return this.field1866[arg0].field1621;
    }
}
