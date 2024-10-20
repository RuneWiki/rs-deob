package deob;

@ObfuscatedName("et")
public class class133 extends class209 {

    @ObfuscatedName("et.f")
    public class120[] field1862;

    @ObfuscatedName("bc.f(Lik;Lik;IZI)Let;")
    public static class133 method1767(class250 arg0, class250 arg1, int arg2, boolean arg3) {
        boolean var4 = true;
        int[] var5 = arg0.method4366(arg2);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = arg0.method4386(arg2, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9;
                if (arg3) {
                    var9 = arg1.method4386(0, var8);
                } else {
                    var9 = arg1.method4386(var8, 0);
                }
                if (var9 == null) {
                    var4 = false;
                }
            }
        }
        if (!var4) {
            return null;
        }
        try {
            return new class133(arg0, arg1, arg2, arg3);
        } catch (Exception var11) {
            return null;
        }
    }

    public class133(class250 arg0, class250 arg1, int arg2, boolean arg3) {
        class208 var5 = new class208();
        int var6 = arg0.method4326(arg2);
        this.field1862 = new class120[var6];
        int[] var7 = arg0.method4366(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method4289(arg2, var7[var8]);
            class127 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class127 var12 = (class127) var5.method3827(); var12 != null; var12 = (class127) var5.method3829()) {
                if (var12.field1759 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method4386(0, var11);
                } else {
                    var13 = arg1.method4386(var11, 0);
                }
                var10 = new class127(var11, var13);
                var5.method3823(var10);
            }
            this.field1862[var7[var8]] = new class120(var9, var10);
        }
    }

    @ObfuscatedName("et.l(II)Z")
    public boolean method2915(int arg0) {
        return this.field1862[arg0].field1601;
    }
}
