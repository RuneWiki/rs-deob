package deob;

@ObfuscatedName("eu")
public class class143 extends class219 {

    @ObfuscatedName("eu.g")
    public class130[] field2044;

    @ObfuscatedName("jz.g(Ljr;Ljr;IZB)Leu;")
    public static class143 method4652(class262 arg0, class262 arg1, int arg2, boolean arg3) {
        boolean var4 = true;
        int[] var5 = arg0.method4278(arg2);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = arg0.method4328(arg2, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9;
                if (arg3) {
                    var9 = arg1.method4328(0, var8);
                } else {
                    var9 = arg1.method4328(var8, 0);
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
            return new class143(arg0, arg1, arg2, arg3);
        } catch (Exception var11) {
            return null;
        }
    }

    public class143(class262 arg0, class262 arg1, int arg2, boolean arg3) {
        class218 var5 = new class218();
        int var6 = arg0.method4279(arg2);
        this.field2044 = new class130[var6];
        int[] var7 = arg0.method4278(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method4294(arg2, var7[var8]);
            class137 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class137 var12 = (class137) var5.method3809(); var12 != null; var12 = (class137) var5.method3832()) {
                if (var12.field1952 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method4328(0, var11);
                } else {
                    var13 = arg1.method4328(var11, 0);
                }
                var10 = new class137(var11, var13);
                var5.method3829(var10);
            }
            this.field2044[var7[var8]] = new class130(var9, var10);
        }
    }

    @ObfuscatedName("eu.e(II)Z")
    public boolean method2933(int arg0) {
        return this.field2044[arg0].field1797;
    }
}
