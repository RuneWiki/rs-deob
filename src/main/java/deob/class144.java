package deob;

@ObfuscatedName("et")
public class class144 extends class202 {

    @ObfuscatedName("et.b")
    public class131[] field2042;

    @ObfuscatedName("an.b(Lij;Lij;IZI)Let;")
    public static class144 method216(class243 arg0, class243 arg1, int arg2, boolean arg3) {
        boolean var4 = true;
        int[] var5 = arg0.method3827(arg2);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = arg0.method3824(arg2, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9;
                if (arg3) {
                    var9 = arg1.method3824(0, var8);
                } else {
                    var9 = arg1.method3824(var8, 0);
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
            return new class144(arg0, arg1, arg2, arg3);
        } catch (Exception var11) {
            return null;
        }
    }

    public class144(class243 arg0, class243 arg1, int arg2, boolean arg3) {
        class201 var5 = new class201();
        int var6 = arg0.method3883(arg2);
        this.field2042 = new class131[var6];
        int[] var7 = arg0.method3827(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method3887(arg2, var7[var8]);
            class138 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class138 var12 = (class138) var5.method3405(); var12 != null; var12 = (class138) var5.method3414()) {
                if (var12.field1951 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method3824(0, var11);
                } else {
                    var13 = arg1.method3824(var11, 0);
                }
                var10 = new class138(var11, var13);
                var5.method3400(var10);
            }
            this.field2042[var7[var8]] = new class131(var9, var10);
        }
    }

    @ObfuscatedName("et.s(II)Z")
    public boolean method2666(int arg0) {
        return this.field2042[arg0].field1805;
    }
}
