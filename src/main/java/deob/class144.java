package deob;

@ObfuscatedName("ek")
public class class144 extends class206 {

    @ObfuscatedName("ek.n")
    public class131[] field2047;

    @ObfuscatedName("hu.n(Lil;Lil;IZI)Lek;")
    public static class144 method3671(class247 arg0, class247 arg1, int arg2, boolean arg3) {
        boolean var4 = true;
        int[] var5 = arg0.method3976(arg2);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = arg0.method3924(arg2, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9;
                if (arg3) {
                    var9 = arg1.method3924(0, var8);
                } else {
                    var9 = arg1.method3924(var8, 0);
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
        int var6 = arg0.method3921(arg2);
        this.field2047 = new class131[var6];
        int[] var7 = arg0.method3976(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method3931(arg2, var7[var8]);
            class138 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class138 var12 = (class138) var5.method3492(); var12 != null; var12 = (class138) var5.method3481()) {
                if (var12.field1955 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method3924(0, var11);
                } else {
                    var13 = arg1.method3924(var11, 0);
                }
                var10 = new class138(var11, var13);
                var5.method3482(var10);
            }
            this.field2047[var7[var8]] = new class131(var9, var10);
        }
    }

    @ObfuscatedName("ek.v(IB)Z")
    public boolean method2700(int arg0) {
        return this.field2047[arg0].field1803;
    }
}
