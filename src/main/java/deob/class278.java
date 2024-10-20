package deob;

@ObfuscatedName("ky")
public class class278 extends class485 {

    @ObfuscatedName("ky.am")
    public class268[] field2915;

    @ObfuscatedName("iz.am(Low;Low;IZS)Lky;")
    public static class278 method4081(class375 arg0, class375 arg1, int arg2, boolean arg3) {
        boolean var4 = true;
        int[] var5 = arg0.method6405(arg2);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = arg0.method6423(arg2, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9;
                if (arg3) {
                    var9 = arg1.method6423(0, var8);
                } else {
                    var9 = arg1.method6423(var8, 0);
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
            return new class278(arg0, arg1, arg2, arg3);
        } catch (Exception var11) {
            return null;
        }
    }

    public class278(class375 arg0, class375 arg1, int arg2, boolean arg3) {
        class394 var5 = new class394();
        int var6 = arg0.method6406(arg2);
        this.field2915 = new class268[var6];
        int[] var7 = arg0.method6405(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method6396(arg2, var7[var8]);
            class273 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class273 var12 = (class273) var5.method6670(); var12 != null; var12 = (class273) var5.method6665()) {
                if (var12.field2827 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method6423(0, var11);
                } else {
                    var13 = arg1.method6423(var11, 0);
                }
                var10 = new class273(var11, var13);
                var5.method6666(var10);
            }
            this.field2915[var7[var8]] = new class268(var9, var10);
        }
    }

    @ObfuscatedName("ky.ap(IB)Z")
    public boolean method5077(int arg0) {
        return this.field2915[arg0].field2778;
    }
}
