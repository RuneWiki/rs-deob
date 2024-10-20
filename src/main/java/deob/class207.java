package deob;

@ObfuscatedName("gh")
public class class207 extends class405 {

    @ObfuscatedName("gh.c")
    public class199[] field2453;

    @ObfuscatedName("jf.c(Llh;Llh;IZI)Lgh;")
    public static class207 method4978(class315 arg0, class315 arg1, int arg2, boolean arg3) {
        boolean var4 = true;
        int[] var5 = arg0.method5309(arg2);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = arg0.method5307(arg2, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9;
                if (arg3) {
                    var9 = arg1.method5307(0, var8);
                } else {
                    var9 = arg1.method5307(var8, 0);
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
            return new class207(arg0, arg1, arg2, arg3);
        } catch (Exception var11) {
            return null;
        }
    }

    public class207(class315 arg0, class315 arg1, int arg2, boolean arg3) {
        class334 var5 = new class334();
        int var6 = arg0.method5313(arg2);
        this.field2453 = new class199[var6];
        int[] var7 = arg0.method5309(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method5305(arg2, var7[var8]);
            class203 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class203 var12 = (class203) var5.method5535(); var12 != null; var12 = (class203) var5.method5537()) {
                if (var12.field2378 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method5307(0, var11);
                } else {
                    var13 = arg1.method5307(var11, 0);
                }
                var10 = new class203(var11, var13);
                var5.method5530(var10);
            }
            this.field2453[var7[var8]] = new class199(var9, var10);
        }
    }

    @ObfuscatedName("gh.v(II)Z")
    public boolean method4012(int arg0) {
        return this.field2453[arg0].field2314;
    }
}
