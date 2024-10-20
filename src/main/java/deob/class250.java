package deob;

@ObfuscatedName("ja")
public class class250 extends class511 {

    @ObfuscatedName("ja.ap")
    public class238[] field2752;

    @ObfuscatedName("qb.ap(Lpe;Lpe;IZI)Lja;")
    public static class250 method8049(class392 arg0, class392 arg1, int arg2, boolean arg3) {
        boolean var4 = true;
        int[] var5 = arg0.method7003(arg2);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = arg0.method7001(arg2, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9;
                if (arg3) {
                    var9 = arg1.method7001(0, var8);
                } else {
                    var9 = arg1.method7001(var8, 0);
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
            return new class250(arg0, arg1, arg2, arg3);
        } catch (Exception var11) {
            return null;
        }
    }

    public class250(class392 arg0, class392 arg1, int arg2, boolean arg3) {
        class411 var5 = new class411();
        int var6 = arg0.method7004(arg2);
        this.field2752 = new class238[var6];
        int[] var7 = arg0.method7003(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method7009(arg2, var7[var8]);
            class244 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class244 var12 = (class244) var5.method7247(); var12 != null; var12 = (class244) var5.method7249()) {
                if (var12.field2631 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method7001(0, var11);
                } else {
                    var13 = arg1.method7001(var11, 0);
                }
                var10 = new class244(var11, var13);
                var5.method7243(var10);
            }
            this.field2752[var7[var8]] = new class238(var9, var10);
        }
    }

    @ObfuscatedName("ja.aw(II)Z")
    public boolean method4944(int arg0) {
        return this.field2752[arg0].field2562;
    }
}
