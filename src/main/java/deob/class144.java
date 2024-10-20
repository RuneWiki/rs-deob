package deob;

@ObfuscatedName("eg")
public class class144 extends class196 {

    @ObfuscatedName("eg.i")
    public class131[] field2145;

    @ObfuscatedName("g.i(Lii;Lii;IZI)Leg;")
    public static class144 method191(class237 arg0, class237 arg1, int arg2, boolean arg3) {
        boolean var4 = true;
        int[] var5 = arg0.method3890(arg2);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = arg0.method3831(arg2, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9;
                if (arg3) {
                    var9 = arg1.method3831(0, var8);
                } else {
                    var9 = arg1.method3831(var8, 0);
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

    public class144(class237 arg0, class237 arg1, int arg2, boolean arg3) {
        class195 var5 = new class195();
        int var6 = arg0.method3835(arg2);
        this.field2145 = new class131[var6];
        int[] var7 = arg0.method3890(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method3824(arg2, var7[var8]);
            class138 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class138 var12 = (class138) var5.method3410(); var12 != null; var12 = (class138) var5.method3412()) {
                if (var12.field2061 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method3831(0, var11);
                } else {
                    var13 = arg1.method3831(var11, 0);
                }
                var10 = new class138(var11, var13);
                var5.method3405(var10);
            }
            this.field2145[var7[var8]] = new class131(var9, var10);
        }
    }

    @ObfuscatedName("eg.j(II)Z")
    public boolean method2707(int arg0) {
        return this.field2145[arg0].field1905;
    }
}
