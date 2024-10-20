package deob;

@ObfuscatedName("cd")
public class class93 extends class130 {

    @ObfuscatedName("cd.b")
    public class81[] field1564;

    @ObfuscatedName("aa.b(Lgj;Lgj;IZI)Lcd;")
    public static class93 method801(class183 arg0, class183 arg1, int arg2, boolean arg3) {
        boolean var4 = true;
        int[] var5 = arg0.method3159(arg2);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = arg0.method3156(arg2, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9;
                if (arg3) {
                    var9 = arg1.method3156(0, var8);
                } else {
                    var9 = arg1.method3156(var8, 0);
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
            return new class93(arg0, arg1, arg2, arg3);
        } catch (Exception var11) {
            return null;
        }
    }

    public class93(class183 arg0, class183 arg1, int arg2, boolean arg3) {
        class129 var5 = new class129();
        int var6 = arg0.method3200(arg2);
        this.field1564 = new class81[var6];
        int[] var7 = arg0.method3159(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method3226(arg2, var7[var8]);
            class87 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class87 var12 = (class87) var5.method2324(); var12 != null; var12 = (class87) var5.method2331()) {
                if (var12.field1461 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method3156(0, var11);
                } else {
                    var13 = arg1.method3156(var11, 0);
                }
                var10 = new class87(var11, var13);
                var5.method2320(var10);
            }
            this.field1564[var7[var8]] = new class81(var9, var10);
        }
    }

    @ObfuscatedName("cd.l(II)Z")
    public boolean method1868(int arg0) {
        return this.field1564[arg0].field1309;
    }
}
