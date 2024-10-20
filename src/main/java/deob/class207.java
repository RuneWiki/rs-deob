package deob;

@ObfuscatedName("gn")
public class class207 extends class406 {

    @ObfuscatedName("gn.s")
    public class199[] field2458;

    public class207(class316 arg0, class316 arg1, int arg2, boolean arg3) {
        class335 var5 = new class335();
        int var6 = arg0.method5184(arg2);
        this.field2458 = new class199[var6];
        int[] var7 = arg0.method5245(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method5179(arg2, var7[var8]);
            class203 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class203 var12 = (class203) var5.method5442(); var12 != null; var12 = (class203) var5.method5426()) {
                if (var12.field2374 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method5187(0, var11);
                } else {
                    var13 = arg1.method5187(var11, 0);
                }
                var10 = new class203(var11, var13);
                var5.method5425(var10);
            }
            this.field2458[var7[var8]] = new class199(var9, var10);
        }
    }

    @ObfuscatedName("gn.s(II)Z")
    public boolean method3885(int arg0) {
        return this.field2458[arg0].field2309;
    }
}
