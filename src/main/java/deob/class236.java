package deob;

@ObfuscatedName("jm")
public class class236 extends class470 {

    @ObfuscatedName("jm.aw")
    public class226[] field2623;

    @ObfuscatedName("fb.aw(Lnd;Lnd;IZI)Ljm;")
    public static class236 method2948(class360 arg0, class360 arg1, int arg2, boolean arg3) {
        boolean var4 = true;
        int[] var5 = arg0.method6126(arg2);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = arg0.method6124(arg2, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9;
                if (arg3) {
                    var9 = arg1.method6124(0, var8);
                } else {
                    var9 = arg1.method6124(var8, 0);
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
            return new class236(arg0, arg1, arg2, arg3);
        } catch (Exception var11) {
            return null;
        }
    }

    public class236(class360 arg0, class360 arg1, int arg2, boolean arg3) {
        class379 var5 = new class379();
        int var6 = arg0.method6127(arg2);
        this.field2623 = new class226[var6];
        int[] var7 = arg0.method6126(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method6117(arg2, var7[var8]);
            class231 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class231 var12 = (class231) var5.method6393(); var12 != null; var12 = (class231) var5.method6374()) {
                if (var12.field2533 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method6124(0, var11);
                } else {
                    var13 = arg1.method6124(var11, 0);
                }
                var10 = new class231(var11, var13);
                var5.method6367(var10);
            }
            this.field2623[var7[var8]] = new class226(var9, var10);
        }
    }

    @ObfuscatedName("jm.ay(II)Z")
    public boolean method4378(int arg0) {
        return this.field2623[arg0].field2480;
    }
}
