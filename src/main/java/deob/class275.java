package deob;

@ObfuscatedName("ko")
public class class275 extends class481 {

    @ObfuscatedName("ko.at")
    public class265[] field2878;

    @ObfuscatedName("ff.at(Lol;Lol;IZB)Lko;")
    public static class275 method2992(class371 arg0, class371 arg1, int arg2, boolean arg3) {
        boolean var4 = true;
        int[] var5 = arg0.method6295(arg2);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = arg0.method6354(arg2, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9;
                if (arg3) {
                    var9 = arg1.method6354(0, var8);
                } else {
                    var9 = arg1.method6354(var8, 0);
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
            return new class275(arg0, arg1, arg2, arg3);
        } catch (Exception var11) {
            return null;
        }
    }

    public class275(class371 arg0, class371 arg1, int arg2, boolean arg3) {
        class390 var5 = new class390();
        int var6 = arg0.method6294(arg2);
        this.field2878 = new class265[var6];
        int[] var7 = arg0.method6295(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method6284(arg2, var7[var8]);
            class270 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class270 var12 = (class270) var5.method6579(); var12 != null; var12 = (class270) var5.method6549()) {
                if (var12.field2791 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method6354(0, var11);
                } else {
                    var13 = arg1.method6354(var11, 0);
                }
                var10 = new class270(var11, var13);
                var5.method6547(var10);
            }
            this.field2878[var7[var8]] = new class265(var9, var10);
        }
    }

    @ObfuscatedName("ko.ah(IB)Z")
    public boolean method4979(int arg0) {
        return this.field2878[arg0].field2731;
    }
}
