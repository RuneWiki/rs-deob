package deob;

@ObfuscatedName("es")
public class class133 extends class209 {

    @ObfuscatedName("es.y")
    public class120[] field1849;

    @ObfuscatedName("bd.y(Liu;Liu;IZB)Les;")
    public static class133 method970(class250 arg0, class250 arg1, int arg2, boolean arg3) {
        boolean var4 = true;
        int[] var5 = arg0.method4267(arg2);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = arg0.method4264(arg2, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9;
                if (arg3) {
                    var9 = arg1.method4264(0, var8);
                } else {
                    var9 = arg1.method4264(var8, 0);
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
        int var6 = arg0.method4287(arg2);
        this.field1849 = new class120[var6];
        int[] var7 = arg0.method4267(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method4263(arg2, var7[var8]);
            class127 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class127 var12 = (class127) var5.method3799(); var12 != null; var12 = (class127) var5.method3780()) {
                if (var12.field1758 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method4264(0, var11);
                } else {
                    var13 = arg1.method4264(var11, 0);
                }
                var10 = new class127(var11, var13);
                var5.method3773(var10);
            }
            this.field1849[var7[var8]] = new class120(var9, var10);
        }
    }

    @ObfuscatedName("es.c(II)Z")
    public boolean method2853(int arg0) {
        return this.field1849[arg0].field1603;
    }
}
