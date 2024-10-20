package deob;

@ObfuscatedName("lf")
public class class288 extends class501 {

    @ObfuscatedName("lf.aq")
    public class276[] field3025;

    @ObfuscatedName("cw.aq(Lok;Lok;IZI)Llf;")
    public static class288 method1812(class388 arg0, class388 arg1, int arg2, boolean arg3) {
        boolean var4 = true;
        int[] var5 = arg0.method6548(arg2);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = arg0.method6546(arg2, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9;
                if (arg3) {
                    var9 = arg1.method6546(0, var8);
                } else {
                    var9 = arg1.method6546(var8, 0);
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
            return new class288(arg0, arg1, arg2, arg3);
        } catch (Exception var11) {
            return null;
        }
    }

    public class288(class388 arg0, class388 arg1, int arg2, boolean arg3) {
        class407 var5 = new class407();
        int var6 = arg0.method6549(arg2);
        this.field3025 = new class276[var6];
        int[] var7 = arg0.method6548(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method6539(arg2, var7[var8]);
            class282 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class282 var12 = (class282) var5.method6814(); var12 != null; var12 = (class282) var5.method6799()) {
                if (var12.field2911 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method6546(0, var11);
                } else {
                    var13 = arg1.method6546(var11, 0);
                }
                var10 = new class282(var11, var13);
                var5.method6794(var10);
            }
            this.field3025[var7[var8]] = new class276(var9, var10);
        }
    }

    @ObfuscatedName("lf.ad(II)Z")
    public boolean method5185(int arg0) {
        return this.field3025[arg0].field2848;
    }
}
