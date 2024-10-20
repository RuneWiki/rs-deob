package deob;

@ObfuscatedName("jt")
public class class235 extends class469 {

    @ObfuscatedName("jt.au")
    public class225[] field2644;

    @ObfuscatedName("dg.au(Lnu;Lnu;IZB)Ljt;")
    public static class235 method2163(class359 arg0, class359 arg1, int arg2, boolean arg3) {
        boolean var4 = true;
        int[] var5 = arg0.method6137(arg2);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = arg0.method6135(arg2, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9;
                if (arg3) {
                    var9 = arg1.method6135(0, var8);
                } else {
                    var9 = arg1.method6135(var8, 0);
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
            return new class235(arg0, arg1, arg2, arg3);
        } catch (Exception var11) {
            return null;
        }
    }

    public class235(class359 arg0, class359 arg1, int arg2, boolean arg3) {
        class378 var5 = new class378();
        int var6 = arg0.method6173(arg2);
        this.field2644 = new class225[var6];
        int[] var7 = arg0.method6137(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method6128(arg2, var7[var8]);
            class230 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class230 var12 = (class230) var5.method6393(); var12 != null; var12 = (class230) var5.method6395()) {
                if (var12.field2557 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method6135(0, var11);
                } else {
                    var13 = arg1.method6135(var11, 0);
                }
                var10 = new class230(var11, var13);
                var5.method6405(var10);
            }
            this.field2644[var7[var8]] = new class225(var9, var10);
        }
    }

    @ObfuscatedName("jt.ae(II)Z")
    public boolean method4397(int arg0) {
        return this.field2644[arg0].field2507;
    }
}
