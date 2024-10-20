package deob;

@ObfuscatedName("fb")
public class class179 extends class346 {

    @ObfuscatedName("fb.f")
    public class172[] field2009;

    @ObfuscatedName("fk.f(Lir;Lir;IZI)Lfb;")
    public static class179 method2833(class253 arg0, class253 arg1, int arg2, boolean arg3) {
        boolean var4 = true;
        int[] var5 = arg0.method3943(arg2);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = arg0.method3955(arg2, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9;
                if (arg3) {
                    var9 = arg1.method3955(0, var8);
                } else {
                    var9 = arg1.method3955(var8, 0);
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
            return new class179(arg0, arg1, arg2, arg3);
        } catch (Exception var11) {
            return null;
        }
    }

    public class179(class253 arg0, class253 arg1, int arg2, boolean arg3) {
        class272 var5 = new class272();
        int var6 = arg0.method3944(arg2);
        this.field2009 = new class172[var6];
        int[] var7 = arg0.method3943(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method3933(arg2, var7[var8]);
            class175 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class175 var12 = (class175) var5.method4160(); var12 != null; var12 = (class175) var5.method4182()) {
                if (var12.field1931 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method3955(0, var11);
                } else {
                    var13 = arg1.method3955(var11, 0);
                }
                var10 = new class175(var11, var13);
                var5.method4155(var10);
            }
            this.field2009[var7[var8]] = new class172(var9, var10);
        }
    }

    @ObfuscatedName("fb.o(II)Z")
    public boolean method3195(int arg0) {
        return this.field2009[arg0].field1861;
    }
}
