package deob;

@ObfuscatedName("ja")
public class class251 extends class489 {

    @ObfuscatedName("ja.az")
    public class241[] field2723;

    @ObfuscatedName("fe.az(Loc;Loc;IZI)Lja;")
    public static class251 method2925(class379 arg0, class379 arg1, int arg2, boolean arg3) {
        boolean var4 = true;
        int[] var5 = arg0.method6350(arg2);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = arg0.method6355(arg2, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9;
                if (arg3) {
                    var9 = arg1.method6355(0, var8);
                } else {
                    var9 = arg1.method6355(var8, 0);
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
            return new class251(arg0, arg1, arg2, arg3);
        } catch (Exception var11) {
            return null;
        }
    }

    public class251(class379 arg0, class379 arg1, int arg2, boolean arg3) {
        class398 var5 = new class398();
        int var6 = arg0.method6338(arg2);
        this.field2723 = new class241[var6];
        int[] var7 = arg0.method6350(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method6328(arg2, var7[var8]);
            class246 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class246 var12 = (class246) var5.method6591(); var12 != null; var12 = (class246) var5.method6605()) {
                if (var12.field2635 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method6355(0, var11);
                } else {
                    var13 = arg1.method6355(var11, 0);
                }
                var10 = new class246(var11, var13);
                var5.method6581(var10);
            }
            this.field2723[var7[var8]] = new class241(var9, var10);
        }
    }

    @ObfuscatedName("ja.ah(II)Z")
    public boolean method4530(int arg0) {
        return this.field2723[arg0].field2573;
    }
}
