package deob;

@ObfuscatedName("im")
public class class237 extends class404 {

    @ObfuscatedName("im.v")
    public class229[] field2668;

    @ObfuscatedName("cp.v(Lln;Lln;IZB)Lim;")
    public static class237 method2081(class316 arg0, class316 arg1, int arg2, boolean arg3) {
        boolean var4 = true;
        int[] var5 = arg0.method5304(arg2);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = arg0.method5302(arg2, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9;
                if (arg3) {
                    var9 = arg1.method5302(0, var8);
                } else {
                    var9 = arg1.method5302(var8, 0);
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
            return new class237(arg0, arg1, arg2, arg3);
        } catch (Exception var11) {
            return null;
        }
    }

    public class237(class316 arg0, class316 arg1, int arg2, boolean arg3) {
        class335 var5 = new class335();
        int var6 = arg0.method5305(arg2);
        this.field2668 = new class229[var6];
        int[] var7 = arg0.method5304(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method5296(arg2, var7[var8]);
            class233 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class233 var12 = (class233) var5.method5540(); var12 != null; var12 = (class233) var5.method5534()) {
                if (var12.field2587 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method5302(0, var11);
                } else {
                    var13 = arg1.method5302(var11, 0);
                }
                var10 = new class233(var11, var13);
                var5.method5530(var10);
            }
            this.field2668[var7[var8]] = new class229(var9, var10);
        }
    }

    @ObfuscatedName("im.c(II)Z")
    public boolean method4449(int arg0) {
        return this.field2668[arg0].field2525;
    }
}
