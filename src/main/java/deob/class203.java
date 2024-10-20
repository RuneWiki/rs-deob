package deob;

@ObfuscatedName("ga")
public class class203 extends class349 {

    @ObfuscatedName("ga.s")
    public class196[] field2354;

    @ObfuscatedName("f.s(Ljy;Ljy;IZS)Lga;")
    public static class203 method55(class277 arg0, class277 arg1, int arg2, boolean arg3) {
        boolean var4 = true;
        int[] var5 = arg0.method4521(arg2);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = arg0.method4467(arg2, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9;
                if (arg3) {
                    var9 = arg1.method4467(0, var8);
                } else {
                    var9 = arg1.method4467(var8, 0);
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
            return new class203(arg0, arg1, arg2, arg3);
        } catch (Exception var11) {
            return null;
        }
    }

    public class203(class277 arg0, class277 arg1, int arg2, boolean arg3) {
        class296 var5 = new class296();
        int var6 = arg0.method4484(arg2);
        this.field2354 = new class196[var6];
        int[] var7 = arg0.method4521(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method4459(arg2, var7[var8]);
            class199 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class199 var12 = (class199) var5.method4721(); var12 != null; var12 = (class199) var5.method4712()) {
                if (var12.field2278 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method4467(0, var11);
                } else {
                    var13 = arg1.method4467(var11, 0);
                }
                var10 = new class199(var11, var13);
                var5.method4706(var10);
            }
            this.field2354[var7[var8]] = new class196(var9, var10);
        }
    }

    @ObfuscatedName("ga.t(IB)Z")
    public boolean method3735(int arg0) {
        return this.field2354[arg0].field2222;
    }
}
