package deob;

@ObfuscatedName("io")
public class class227 extends class444 {

    @ObfuscatedName("io.af")
    public class217[] field2631;

    @ObfuscatedName("dg.af(Lnm;Lnm;IZI)Lio;")
    public static class227 method2241(class344 arg0, class344 arg1, int arg2, boolean arg3) {
        boolean var4 = true;
        int[] var5 = arg0.method6074(arg2);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = arg0.method6078(arg2, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9;
                if (arg3) {
                    var9 = arg1.method6078(0, var8);
                } else {
                    var9 = arg1.method6078(var8, 0);
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
            return new class227(arg0, arg1, arg2, arg3);
        } catch (Exception var11) {
            return null;
        }
    }

    public class227(class344 arg0, class344 arg1, int arg2, boolean arg3) {
        class363 var5 = new class363();
        int var6 = arg0.method6081(arg2);
        this.field2631 = new class217[var6];
        int[] var7 = arg0.method6074(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method6090(arg2, var7[var8]);
            class222 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class222 var12 = (class222) var5.method6329(); var12 != null; var12 = (class222) var5.method6338()) {
                if (var12.field2539 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method6078(0, var11);
                } else {
                    var13 = arg1.method6078(var11, 0);
                }
                var10 = new class222(var11, var13);
                var5.method6324(var10);
            }
            this.field2631[var7[var8]] = new class217(var9, var10);
        }
    }

    @ObfuscatedName("io.an(II)Z")
    public boolean method4349(int arg0) {
        return this.field2631[arg0].field2480;
    }
}
