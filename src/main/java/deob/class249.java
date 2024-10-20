package deob;

@ObfuscatedName("ja")
public class class249 extends class484 {

    @ObfuscatedName("ja.ac")
    public class239[] field2669;

    @ObfuscatedName("gk.ac(Lom;Lom;IZB)Lja;")
    public static class249 method3108(class374 arg0, class374 arg1, int arg2, boolean arg3) {
        boolean var4 = true;
        int[] var5 = arg0.method6272(arg2);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = arg0.method6312(arg2, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9;
                if (arg3) {
                    var9 = arg1.method6312(0, var8);
                } else {
                    var9 = arg1.method6312(var8, 0);
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
            return new class249(arg0, arg1, arg2, arg3);
        } catch (Exception var11) {
            return null;
        }
    }

    public class249(class374 arg0, class374 arg1, int arg2, boolean arg3) {
        class393 var5 = new class393();
        int var6 = arg0.method6273(arg2);
        this.field2669 = new class239[var6];
        int[] var7 = arg0.method6272(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method6342(arg2, var7[var8]);
            class244 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class244 var12 = (class244) var5.method6532(); var12 != null; var12 = (class244) var5.method6543()) {
                if (var12.field2578 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method6312(0, var11);
                } else {
                    var13 = arg1.method6312(var11, 0);
                }
                var10 = new class244(var11, var13);
                var5.method6526(var10);
            }
            this.field2669[var7[var8]] = new class239(var9, var10);
        }
    }

    @ObfuscatedName("ja.al(II)Z")
    public boolean method4480(int arg0) {
        return this.field2669[arg0].field2524;
    }
}
