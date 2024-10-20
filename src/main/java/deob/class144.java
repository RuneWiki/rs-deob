package deob;

@ObfuscatedName("ec")
public class class144 extends class206 {

    @ObfuscatedName("ec.a")
    public class131[] field2027;

    @ObfuscatedName("ce.a(Lib;Lib;IZI)Lec;")
    public static class144 method1518(class247 arg0, class247 arg1, int arg2, boolean arg3) {
        boolean var4 = true;
        int[] var5 = arg0.method3983(arg2);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = arg0.method3903(arg2, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9;
                if (arg3) {
                    var9 = arg1.method3903(0, var8);
                } else {
                    var9 = arg1.method3903(var8, 0);
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

    public class144(class247 arg0, class247 arg1, int arg2, boolean arg3) {
        class205 var5 = new class205();
        int var6 = arg0.method3907(arg2);
        this.field2027 = new class131[var6];
        int[] var7 = arg0.method3983(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method3897(arg2, var7[var8]);
            class138 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class138 var12 = (class138) var5.method3442(); var12 != null; var12 = (class138) var5.method3444()) {
                if (var12.field1945 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method3903(0, var11);
                } else {
                    var13 = arg1.method3903(var11, 0);
                }
                var10 = new class138(var11, var13);
                var5.method3446(var10);
            }
            this.field2027[var7[var8]] = new class131(var9, var10);
        }
    }

    @ObfuscatedName("ec.w(II)Z")
    public boolean method2664(int arg0) {
        return this.field2027[arg0].field1787;
    }
}
