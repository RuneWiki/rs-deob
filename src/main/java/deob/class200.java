package deob;

@ObfuscatedName("gg")
public class class200 extends class382 {

    @ObfuscatedName("gg.c")
    public class192[] field2367;

    public class200(class302 arg0, class302 arg1, int arg2, boolean arg3) {
        class321 var5 = new class321();
        int var6 = arg0.method5144(arg2);
        this.field2367 = new class192[var6];
        int[] var7 = arg0.method5063(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method5053(arg2, var7[var8]);
            class196 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class196 var12 = (class196) var5.method5301(); var12 != null; var12 = (class196) var5.method5303()) {
                if (var12.field2284 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method5073(0, var11);
                } else {
                    var13 = arg1.method5073(var11, 0);
                }
                var10 = new class196(var11, var13);
                var5.method5296(var10);
            }
            this.field2367[var7[var8]] = new class192(var9, var10);
        }
    }

    @ObfuscatedName("gg.c(IB)Z")
    public boolean method3824(int arg0) {
        return this.field2367[arg0].field2227;
    }
}
