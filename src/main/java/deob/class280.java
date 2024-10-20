package deob;

@ObfuscatedName("ks")
public class class280 extends class488 {

    @ObfuscatedName("ks.aq")
    public class270[] field2931;

    @ObfuscatedName("gh.aq(Lof;Lof;IZI)Lks;")
    public static class280 method3153(class378 arg0, class378 arg1, int arg2, boolean arg3) {
        boolean var4 = true;
        int[] var5 = arg0.method6510(arg2);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = arg0.method6426(arg2, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9;
                if (arg3) {
                    var9 = arg1.method6426(0, var8);
                } else {
                    var9 = arg1.method6426(var8, 0);
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
            return new class280(arg0, arg1, arg2, arg3);
        } catch (Exception var11) {
            return null;
        }
    }

    public class280(class378 arg0, class378 arg1, int arg2, boolean arg3) {
        class397 var5 = new class397();
        int var6 = arg0.method6429(arg2);
        this.field2931 = new class270[var6];
        int[] var7 = arg0.method6510(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method6489(arg2, var7[var8]);
            class275 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class275 var12 = (class275) var5.method6702(); var12 != null; var12 = (class275) var5.method6684()) {
                if (var12.field2838 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method6426(0, var11);
                } else {
                    var13 = arg1.method6426(var11, 0);
                }
                var10 = new class275(var11, var13);
                var5.method6678(var10);
            }
            this.field2931[var7[var8]] = new class270(var9, var10);
        }
    }

    @ObfuscatedName("ks.aw(IB)Z")
    public boolean method5092(int arg0) {
        return this.field2931[arg0].field2792;
    }
}
