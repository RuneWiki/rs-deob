package deob;

@ObfuscatedName("gu")
public class class200 extends class387 {

    @ObfuscatedName("gu.c")
    public class192[] field2379;

    public class200(class307 arg0, class307 arg1, int arg2, boolean arg3) {
        class326 var5 = new class326();
        int var6 = arg0.method5029(arg2);
        this.field2379 = new class192[var6];
        int[] var7 = arg0.method5084(arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method5066(arg2, var7[var8]);
            class196 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class196 var12 = (class196) var5.method5269(); var12 != null; var12 = (class196) var5.method5270()) {
                if (var12.field2297 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method5111(0, var11);
                } else {
                    var13 = arg1.method5111(var11, 0);
                }
                var10 = new class196(var11, var13);
                var5.method5264(var10);
            }
            this.field2379[var7[var8]] = new class192(var9, var10);
        }
    }

    @ObfuscatedName("gu.c(II)Z")
    public boolean method3769(int arg0) {
        return this.field2379[arg0].field2224;
    }
}
